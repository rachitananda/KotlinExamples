package basic

fun main(args: Array<String>) {

    println("Enter food ID")

    val foodId = readLine()!!.toInt()

    when(foodId){


        1 ->{
            println("you ordered Sandwich")
        }
        2 ->{
            println("you ordered Salad")
        }
        3->{
            println("You ordered Burger")
        }
        else -> {
            println("you did not order")
        }

    }

}