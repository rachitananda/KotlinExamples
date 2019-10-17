package oops

class Singleton {
    var name:String?=null

    constructor(){
        println("instance created")
    }

    companion object {
        val instance : Singleton by lazy {
            Singleton()
        }



    }
    fun getInstance(): Singleton {
        return instance
    }

}




fun main(){
    var s1= Singleton.instance;
    s1.name="abc"
    println(s1.name)

    var s2= Singleton.instance;
    println(s2.name)

    var s3= Singleton.instance;
    s1.name="xyz"
    println(s3.name)

    println(s1.name)
}
