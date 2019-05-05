fun main(args:Array<String>){

    for(i in 1..10 step 2){
        println("counter for $i")
    }
    var i =1
    while (i<=10){
        println("While count $i")
        i +=2
    }

    i =1
    do {
        println("While DO count $i")
        i +=2
    }while (i<=10)

    i =11
    do {
        println("While DO count $i")
        i +=2
    }while (i<=10)
}
