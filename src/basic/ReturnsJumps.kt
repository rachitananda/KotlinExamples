package basic
fun main(){
println("====continue-===")
    for( number in 1..5) {
        if(number==2){
            continue
        }
        println(number)
    }
    println("====break-===")
    for( number in 1..5) {
        if(number==2){
            break
        }
        println(number)
    }

    println("====break Outer-===")
   loopOuter@ for( num in 1..5){
        println("outer $num")
        for (inner in 1..5){
            println("inner $inner")
            if(inner== 3){
                break@loopOuter
            }
        }
    }

    println("====Return -===")
     for( num in 1..5){
        println("outer $num")
        for (inner in 1..5){
            println("inner $inner")
            if(inner== 3){
                return
            }
        }
    }
    println("====END-===") //mot printed if return used
}