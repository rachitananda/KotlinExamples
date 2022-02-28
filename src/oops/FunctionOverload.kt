package collection
fun main(){

    println(add(1, 2))
    println(add(1, 2, 3))

}

fun add(n1: Int, n2:Int): Int{
    return n1+n2
}

fun add(n1: Int, n2:Int, n3:Int): Int{
    return n1+n2+n3
}