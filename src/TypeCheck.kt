//https://medium.com/@agrawalsuneet/typecheck-is-and-cast-as-in-kotlin-a2490c567a85
//https://medium.com/@agrawalsuneet/safe-calls-vs-null-checks-in-kotlin-f7c56623ab30

interface Shape {
    fun calculateArea(): Float
}

class Circle : Shape {
    var radius = 10f
    override fun calculateArea(): Float {
        return (22 * radius * radius) / 7
    }

}

class Square : Shape {
    var sideLength = 10f
    override fun calculateArea(): Float {
        return sideLength * sideLength
    }

}

class Rectangle : Shape {
    var length = 10f
    var breath = 5f
    override fun calculateArea(): Float {
        return length * breath
    }

}
// 'is' smart cast
fun checkType(shape: Shape) {
    when (shape) {
        is Circle -> println("Type :Circle")
        is Square -> println("Type :Square")
        is Rectangle -> println("Type :Rectangle")

    }
}

fun isCircle(shape: Shape): Boolean {

    if (shape !is Circle)
        return false
    else
        return true
}


fun main() {
    val circle = Circle()
    val square = Square()
    val rectangle = Rectangle()

    checkType(square)
    println("check if circle : ${isCircle(square)}")

    val rect: Shape = Rectangle()
    //explixit cast - safe cast
    var obj2: Shape? = rect!! as? Square



}