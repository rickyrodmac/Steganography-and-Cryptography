fun printColor(myImage: BufferedImage) {
    // Write your code here
    val (x, y) = readln().split(" ")

    val color = Color(myImage.getRGB(x.toInt(), y.toInt()), true)

    println("${color.red} ${color.green} ${color.blue} ${color.alpha}")
}