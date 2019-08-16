package oops
 val  globalVar = "bar" // global scope variable

fun main(){

    //can access method of another class in same package
    showInfo("foo")


    showInfoInClass()


}

fun showInfoInClass( ){
    println("basic.getName: $globalVar")
}