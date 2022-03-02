package basic

fun main(args: Array<String>) {

    println("===CONTINUE===")
    for (number in 1..5) {
        if (number == 3) {
            continue
        }
        println("number $number") //never printed for %
    }
    println("===BREAK====")
    for (number in 1..5) {
        if (number == 3) {
            break
        }
        println("number $number")
    }

    println("===BREAK INNER===")

    for (number in 1..5) {
        for (inner in 1..3) {
            if (inner == 2) {
                break;
            }
            println("outer $number inner $inner")
        }
    }


    println("===BREAK OUTER===")

    loop@ for (number in 1..5) {
        for (inner in 1..3) {
            if (inner == 2) {
                break@loop
            }
            println("outer $number inner $inner")
        }
    }
    println("==RETURN EX===")
    for (i in 1..3) {
        if (i == 2) {
            return
        }
    }

    println("==Never printed as control returns to basic.basic.basic.basic.collection.basic.collection.collection.basic.basic.oops.oops.basic.main===")


}