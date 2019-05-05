fun main(args : Array<String>){

    for (i in 1..5) { //i=1 i<=5 i++(Step 1 default)
        println("count $i")
    }
    for(j in 1..10 step 2){ //j+=2 increment
       println("count with step 2 $j")
    }
    for( k in 9 downTo 0 step 2){//k-=2 decrement
       println("count downTo $k")
    }

}