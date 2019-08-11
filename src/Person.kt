
//https://medium.com/@DarrenAtherton/intro-to-data-classes-in-kotlin-7f956d54365c

data class Person(val name:String, val age :Int, val gender :String)


fun main(){
    var person = Person("rachita",28,"female");
    println("Age: ${person.age}")
}