/**
 * Input data from users
 */
fun main(args: Array<String>) {
    println("Enter name")
    var name = readLine()
    println("Hi " + name)
    println("Enter Age ")
    var age:Int= readLine()!!.toInt() // !! means can expect null value
    println("you are "+age+" years old")
    println("Enter percentage")
    var percentage:Float = readLine()!!.toFloat()
    println(""+percentage+"%")
}
