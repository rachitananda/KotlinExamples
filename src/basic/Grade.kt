package basic

fun main(args: Array<String>){

    println("Enter marks")

    val marks = readLine()!!.toInt()

    when{

        marks>90 -> println("Grade A")
        marks in 70..90 -> println("Grade B")
        marks in 50..70 -> println("Grade C")
        else -> println("FAIL")

    }

    val isPass = if(marks>50) true else false
    println("IsPass $isPass")

    val isFail = when (marks){
        0 -> true
        else -> false
    }

    println("isFail $isFail")

}
