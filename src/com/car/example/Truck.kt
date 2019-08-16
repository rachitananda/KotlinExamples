package com.car.example

//https://medium.com/mindorks/kotlin-for-android-developers-visibility-modifiers-8d8a3b84d298

//CarOptions should be marked as open to allow inheritance
class Truck : CarOptions {

    var subType: String? = null


    constructor(type: String, model: Int, price1: Double, owner: String, subType: String)
            : super(type, model, price1, owner) {

        this.subType = subType
    }

    constructor(type: String, model: Int, price1: Double, subType: String) :
            super(type, model, price1) {

        this.subType = subType

    }

    fun getSubtype(): String {
        return this.subType!!;
    }

    //overriden method should be marked as open
    override fun getPrice(): Double {
        return super.getPrice()
    }

}

    fun main(){

    val truck1 = Truck("BMW",2015,10000.0,"SUV")
    truck1.model=2018//cannot modify val , needs to be var
    println("Type :${truck1.type}")
    println("Price :${truck1.getPrice()}")
    println("Model :${truck1.model}")
    println("SubType :${truck1.subType}")
    println("Owner :${truck1.owner}")

    val truck2 = Truck("Honda",2012,15000.0,"Garbage")
    println("Type :${truck2.type}")
    println("Price :${truck2.getPrice()}")
    println("Model :${truck2.model}")
    println("SubType :${truck2.subType}")
    println("Owner :${truck2.owner}")


}

//collection.add extension method
fun  Truck.getCarPriceExtension():Double{
    return this.getPrice();
}