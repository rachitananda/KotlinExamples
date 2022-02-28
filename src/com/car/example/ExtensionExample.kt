package com.car.example

fun main() {

    val list = ArrayList<Int>();
    list.add(2)
    list.add(56)
    list.add(23)
    list.add(11)
    list.add(47)
    list.add(84);list.add(1) //;can be used if multiple code lines within same line

   println("Max: ${list.findMax()}")
    println("Min: ${list.findMin()}")


}

//extension method

fun ArrayList<Int>.findMax(): Int{
    var max =Integer.MIN_VALUE

    forEach { number ->
        if(number> max ){
            max= number
        }
    }
    return max
}

fun ArrayList<Int>.findMin(): Int{
    var min =Integer.MAX_VALUE

    for (number in this){
        if(number<min){
            min = number
        }
    }

    return min
}