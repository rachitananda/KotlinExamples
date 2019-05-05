fun main(args:Array<String>){

    val num = readLine()!!.toInt()

    when(num%2){

        0 -> println("EVEN")
        1 -> println("ODD")
    }

}