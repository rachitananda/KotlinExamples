package basic
fun main(){
    addNumbers(3.0,1.2)
    addNumbers(5.0,11.7)
}

fun addNumbers(x:Double, y:Double){
    println("$x + $y")
    val temp= x+y;
    println(temp)
}

/*fun addNumbers(x:Double, y:Double): Double{
    println("$x + $y")
    val temp= x+y;
    println(temp)
    return temp

}*/

