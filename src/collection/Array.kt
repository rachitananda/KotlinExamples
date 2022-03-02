package collection

fun main(args: Array<String>) {

    println("===Pets==")
    println("Enter number of Pets")
    val n = readLine()!!.toInt()

    var listOfPets : Array<String>  = Array(n){""}// string[]
    println("Enter pet names")
    for (i in 0 until n){//<n
        listOfPets[i]= readLine()!!.toString()
    }
    for (i in 0..n-1){
        println("pet $i : ${listOfPets[i]}")
    }

    for (i in 0  until listOfPets.size){

        println("pet $i : ${listOfPets[i]}")
    }
}
