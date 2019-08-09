fun main(){

    showInfo(12345)
    showInfo("rachita")
    println(squareNumber(10))
    println(squareNumber(10.6))
}

fun showInfo(id : Int){
    println("id:$id")
}

fun showInfo(name : String) {
    println("name : $name")

}

fun squareNumber(number : Int) : Int{
    return number*number
}

fun squareNumber(number : Double): Double {
    return number*number
}