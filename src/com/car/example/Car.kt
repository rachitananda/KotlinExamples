package com.car.example

class Car(val type: String, var model: Int, val price1: Double) {

    //init called when car instance created
    init {
        println("car is created; $type")
    }

    fun getPrice(): Double{
        return this.price1
    }
}


fun main() {

    //var car = Car() - need to add default const paramaters

    val car1 = Car("BMW",2015,10000.0)
    car1.model=2018//cannot modify val , needs to be var
    println("Type :${car1.type}")
    println("Price :${car1.getPrice()}")
    println("Model :${car1.model}")

    val car2 = Car("Honda",2012,15000.0)
    println("Type :${car2.type}")
    println("Price :${car2.getPrice()}")
    println("Model :${car2.model}")

    val cars = arrayListOf<Car>()
    cars.add(car1)
    cars.add(car2)

    cars.forEach {car -> println("${car.type} price :${car.price1}")}

}