package collection

fun main() {

    //1. list unmutable
    var list = listOf<String>("rachita", "kotlin")
    var list1 = listOf("rachita", "nanda")
    //list[0]= "text"; - not allowed as unmutable

    var listMutable = mutableListOf("rachita", "bangalore")
    listMutable[1] = "delhi"  //allowed

    for (name in listMutable) {
        println(name)
    }



    var map = mapOf(1 to "rachita", 2 to "nanda")

    var mapMutable = mutableMapOf(1 to "rachita", 2 to "nanda")

}