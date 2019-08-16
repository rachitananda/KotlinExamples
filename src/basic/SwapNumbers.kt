package basic

fun main( args: Array<String>){
  println("Enter number 1:")
    var num1 = readLine()!!.toInt()
    println("Enter number 2:")
    var num2 : Int = readLine()!!.toInt()

    val temp = num1
    num1 = num2
    num2 = temp
    println("Num1 : $num1 Num2 : $num2")


}
