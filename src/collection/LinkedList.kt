package collection

import java.util.*

fun main(){
    println("===Pets==")
    println("Enter number of Pets")
    val n = readLine()!!.toInt()
    var listOfPets  = LinkedList<String>()
    println("Enter pet names")
    for (i in 0 until n){//<n
        listOfPets.add(readLine()!!.toString())
    }

    for (pet in listOfPets){
        println("pet : $pet")
    }
}