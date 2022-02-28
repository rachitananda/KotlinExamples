package collection

fun main(args: Array<String>) {

    var listOfUsers = hashMapOf<Int, String>()
    listOfUsers[11] = "rachita"
    listOfUsers[23] = "foo"
    listOfUsers[2503] = "boo"

    println("print id 11 ${listOfUsers[11]}")

    println("print hashmap ")
    for(key in listOfUsers.keys)
        println("item:  ${listOfUsers[key]}")


}