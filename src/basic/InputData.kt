package basic

/**
 * Input data from users
 */
fun main(args: Array<String>) {
    // this is to collection.add comments
    /* this is is a pretty comment */
    println("Enter basic.getName")
    var name = readLine()
    println("Enter last basic.getName")
    val lastName : String = readLine()!!.toString()
    name += " $lastName"
    println("Hi " + name)
    println("Enter Age ")
    var age:Int= readLine()!!.toInt() // !! means can expect null value
    println("you are "+age+" years old")
    println("Enter percentage")
    var percentage:Float = readLine()!!.toFloat()
    println(""+percentage+"%")
}
