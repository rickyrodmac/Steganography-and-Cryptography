package cryptography

import java.awt.Color
import java.awt.image.BufferedImage
import java.io.File
import javax.imageio.ImageIO
import kotlin.experimental.xor

fun main() {
    while (true) {
        println("Task (hide, show, exit):")
        val task = readln()
        when (task) {
            "hide" -> hide()
            "show" -> show()
            "exit" -> {
                println("Bye!")
                return
            }
            else -> println("Wrong Task: [$task]")
        }
    }
}

fun show() {
    println("Input image file:")
    val inFileName = readln()
    val inputFile = File(inFileName)
    val inputImage: BufferedImage;

    try {
        inputImage = ImageIO.read(inputFile)
    } catch (e: Exception) {
        println("Can't read input file!")
        return
    }

    println("Password:")
    val password = readln()

    val messageEnd = "\u0000\u0000\u0003"
    val maxBits = inputImage.width * inputImage.height
//    val bitArray = BooleanArray(maxBits) { false }
    val bitCharArray = CharArray(maxBits) { '0' }
    // read bits into boolean array?
    var bitCounter = 0
    for (height in 0 until inputImage.height) {
        for (width in 0 until inputImage.width) {
            val color = Color(inputImage.getRGB(width, height))
            bitCharArray[bitCounter] = if (color.blue % 2 != 0) '1' else '0'
            bitCounter++
        }
    }
    val bitString = bitCharArray.joinToString("")
    bitCounter = 0
    var byteCounter = 0
    var msgOut = ""
    while (bitCounter < maxBits - 8) {
        val byteString = bitString.substring(bitCounter, bitCounter + 8)
        bitCounter += 8
        val uByte = byteString.toInt(2)
        msgOut += uByte.toChar()
        byteCounter++
        // check for EOM
        val index = msgOut.indexOf(messageEnd)
        if (index > 0) {
            println("Message:")
            val message = msgOut.substring(0, index)
            val messageString = encryptDecryptMessage(message, password)
            println(messageString)
            return
        }
    }
}

fun hide() {
    println("Input image file:")
    val inFileName = readln()
//    val inputFile = File("/Users/rickyrod/" + inFileName)
    val inputFile = File(inFileName)
    val inputImage: BufferedImage;

    println("Output image file:")
    val outFileName = readln()
//    val outputFile = File("/Users/rickyrod/" + outFileName)
    val outputFile = File(outFileName)
    val outputImage: BufferedImage;

    try {
        inputImage = ImageIO.read(inputFile)
    } catch (e: Exception) {
        println("Can't read input file!")
        return
    }

    println("Message to hide:")
    val message = readln()

    println("Password:")
    val password = readln()

    val messageString = encryptDecryptMessage(message, password) + "\u0000\u0000\u0003"

    if (messageString.length * 8 > inputImage.width * inputImage.height) {
        println("The input image is not large enough to hold this message.")
        return
    }

    val messageBytes = messageString.encodeToByteArray()
    var messageListBinary = mutableListOf<String>()

    for (index in messageBytes) {
        val bin: String = ("0".repeat(8) + Integer.toBinaryString(index.toInt())).takeLast(8)
        messageListBinary.add(bin)
    }

    val messageBinary = messageListBinary.joinToString("")

    println("Input Image: $inFileName")
    println("Output Image: $outFileName")

    outputImage = BufferedImage(inputImage.width, inputImage.height, BufferedImage.TYPE_INT_RGB)

    var messageBit = 0
    for (height in 0 until inputImage.height) {
        for (width in 0 until inputImage.width) {
            val color = Color(inputImage.getRGB(width, height))
            val oldBlue = color.blue
            var newBlue = color.blue
            if (messageBit < messageBinary.length) {
                if (messageBinary[messageBit] == '0') {
                    newBlue = setLeastSignificantBitToZero(oldBlue)
                } else {
                    newBlue = setLeastSignificantBitToOne(oldBlue)
                }
                messageBit++
            }
            val rgb = Color(
                (color.red).toInt(),
                (color.green).toInt(),
                newBlue.toInt()
            ).rgb
            outputImage.setRGB(width, height, rgb)
        }
    }

    ImageIO.write(outputImage, "png", outputFile)

    println("Message saved in $outFileName image.")
}

fun encryptDecryptMessage(message: String, password: String): String {
    val messageBytes = message.encodeToByteArray()
    val passwordBytes = password.encodeToByteArray()
    var passwordIndex = 0
    for (index in message.indices) {
        messageBytes[index] = messageBytes[index].xor(passwordBytes[passwordIndex])
        if (passwordIndex < passwordBytes.size - 1) passwordIndex++ else passwordIndex = 0
    }

    return messageBytes.map { it -> it.toInt().toChar() }.joinToString("")
//    joinToString("")
}

fun setLeastSignificantBitToOne(pixel: Int): Int {
    if (pixel.toInt() % 2 == 0) {
        return (pixel or 0x01)
    } else {
        return pixel
    }
}

fun setLeastSignificantBitToZero(pixel: Int): Int {
    if (pixel.toInt() % 2 == 0) {
        return pixel
    } else {
        return (pixel and (0b1).inv())
    }
}

fun findMatch(byteArray: UByteArray, index: Int, match: String): Boolean {
    if (match.length >= index) {
        // logic here
    }
    return false
}