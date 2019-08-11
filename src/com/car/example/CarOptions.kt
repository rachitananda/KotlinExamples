package com.car.example

open class CarOptions() {

    var type :String?=null
    var model :Int?=null
    var price1:Double?=null
    var owner :String?=null


    //init called when car instance created
    init {
        println("car is created; $type")
    }

    constructor( type: String,  model: Int,  price1: Double,owner:String):this(){
        this.type=type
        this.model=model
        this.price1=price1
        this.owner=owner
    }

    constructor( type: String,  model: Int,  price1: Double):this(){
        this.type=type
        this.model=model
        this.price1=price1

    }

//open - available for overriding
    open fun getPrice(): Double{
        return this.price1!!
    }
}


fun main() {

    //var car = Car() - need to add default const paramaters

    val car1 = CarOptions("BMW",2015,10000.0)
    car1.model=2018//cannot modify val , needs to be var
    println("Type :${car1.type}")
    println("Price :${car1.getPrice()}")
    println("Model :${car1.model}")
    println("Owner :${car1.owner}")

    val car2 = CarOptions("Honda",2012,15000.0,"henry")
    println("Type :${car2.type}")
    println("Price :${car2.getPrice()}")
    println("Model :${car2.model}")
    println("Owner :${car2.owner}")



}