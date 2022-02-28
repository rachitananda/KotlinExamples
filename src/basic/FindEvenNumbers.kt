package basic

import java.util.ArrayList

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
    var arr= arrayOf(String);
    var a= arrayListOf<String>()
    var a1= ArrayList<String>();
    
    var h= hashMapOf<Int,String>()
    var h1= HashMap<Int,String>();
}
