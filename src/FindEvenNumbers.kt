
fun main(args:Array<String>){

    println("enter range :")
    val range = readLine()!!.toInt()
    var output: String = ""
    for(i in 0..range step 2){
        if(i ==0){
            continue
        }
        output = output+ " " +i
    }
    println("Output : $output")
}
