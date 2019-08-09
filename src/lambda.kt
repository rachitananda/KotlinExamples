fun main(){

    println(sum(1,2))
    println(sumLamda(1,2))

    val numbers = listOf(1,2,3,4,5)

    //print number normally with for

    for (num in numbers){
        print(num)
    }

    println()
    //kotlin lamda for for each
     numbers.forEach { number ->
         print(number)
     }



}


fun sum (number1: Int , number2:Int):Int{

    return number1+number2
}

val sumLamda =  {number1: Int , number2:Int ->
    number1+number2

}



