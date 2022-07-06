import java.awt.Color
import java.awt.image.BufferedImage  

const val SIZE = 200
const val RADIUS = 100

@Suppress("MagicNumber")
fun drawCircles(): BufferedImage {
    val image = BufferedImage(SIZE, SIZE, BufferedImage.TYPE_INT_RGB)

    val graphics = image.createGraphics()

    graphics.color = Color.RED
    graphics.drawOval(50, 50, RADIUS, RADIUS)

    graphics.color = Color.YELLOW
    graphics.drawOval(50, 75, RADIUS, RADIUS)

    graphics.color = Color.GREEN
    graphics.drawOval(75, 50, RADIUS, RADIUS)

    graphics.color = Color.BLUE
    graphics.drawOval(75, 75, RADIUS, RADIUS)

    return image
}
