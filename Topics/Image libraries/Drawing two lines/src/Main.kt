import java.awt.Color
import java.awt.image.BufferedImage

const val SIZE = 200

fun drawLines(): BufferedImage {
    val image = BufferedImage(SIZE, SIZE, BufferedImage.TYPE_INT_RGB)

    val graphics = image.createGraphics()

    graphics.color = Color.RED

    graphics.drawLine(0, 0, SIZE, SIZE)

    graphics.color = Color.GREEN

    graphics.drawLine(SIZE, 0, 0, SIZE)

    return image
}