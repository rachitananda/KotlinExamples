package basic
enum class Direction {
    NORTH,SOUTH,EAST,WEST
}

enum class Color(val rgb: Int) {
    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0x0000FF)
}
fun main() {

    var direction = Direction.SOUTH

    if (direction == Direction.SOUTH) {
        println("south")
    }
}