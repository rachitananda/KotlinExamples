

fun main(){

    println(addNumber(12.4,30.6))
    println(addNumber(x=10.0,y=30.0))
    val x= 9.8
    val y = 13.6
    val  sum = addNumber(x,y)
    println(sum)
    //using default values
    println(addNumbersWithDefault(10.1 ))
    //passing value explicitly for y
    println(addNumbersWithDefault(y=20.1 ))
    addNamesVarargs("cat","dog")
    addNamesVarargs(names= *arrayOf("cat","dog","parrot"))

}

fun addNumber(x : Double , y :Double) : Double{
    return x+y
}

fun addNumbersWithDefault(x :Double=0.0,y : Double =0.0): Double{
    return x+y
}

fun addNamesVarargs(vararg names:String){
    for (name in names){
        println(name)
    }

}
