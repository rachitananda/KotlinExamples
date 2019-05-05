fun main(args: Array<String>) {

    var str = "this is kotlin"
    var name: String = "rachita"
    name = " rachita nanda"
    val age: Int = 27//val
    val GPA = 3.8
    val str1 = "this is a final var"
    println("userInfo--")
    println("Name $name")
    println("Age $age")
    println("GPA $GPA")

    var dept: String?
    dept = null
    println(dept) //without ? & == null would not compile

    var school : String?
    school = null
    print("school : ${school}")//will print null
   // print("school : ${school!!}") //will throw null pointer
}

