package basic

/**
 * Mathematical Operators
 * Operations rules| Priorites rules
 * BODMAS- Bracket, Order(power),Division,Multiply ,Add, Subtract
1- ()
2- ++a, --a
3- ^
4- *, /
5- +, -
6- =
7- a++,a--
 */
fun main(args: Array<String>) {
    println("----Mathematical Operators----")
    println("enter 1st number ")
    var n1: Float = readLine()!!.toFloat()
    println("enter 2st number ")
    var n2: Float = readLine()!!.toFloat()

    var n3 = 10;
    var n4 = 20;

    var sum: Float?
    sum = n1 + n2;
    println("Sum " + sum)
    var sub = n1 - n2;
    println("Subtraction " + sub)
    var product = n1 * n2;
    println("Product " + product)
    var division = n1 / n2
    println("Division " + division)


    var equation = n1 + n2 * n3 - n4
    println("Equation:$equation")  //Concatenation of value in string
    var equation1 = (n1 + n2) * n3 - n4
    println("Equation:$equation1")


}
