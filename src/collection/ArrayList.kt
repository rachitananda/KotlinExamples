package collection

fun main(){

    println("===Pets==")
    println("Enter number of Pets")
    val n = readLine()!!.toInt()
    var listOfPets : ArrayList<String>  = ArrayList<String>()
    println("Enter pet names")
    for (i in 0 until n){//<n
        listOfPets.add(readLine()!!.toString())
    }

    for (i in 0  until listOfPets.size){

        println("pet $i : ${listOfPets.get(i)}")
    }
}