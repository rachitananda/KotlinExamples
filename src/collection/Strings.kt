package collection

fun main(args: Array<String>) {

    val fname = " rachita"
    val lname  = "nanda "
    val name= fname+lname
    println(name)
    val name1 = "$fname $lname"
    println(name1.toUpperCase())
    println(name1.toLowerCase().trim())
    println(name[0])//r

    var str = "this is kotlin class"
    val arr = str.split(" ")
    for (subString in  arr){
        println(subString)
    }
}