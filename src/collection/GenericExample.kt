package collection

import kotlin.test.assertTrue

//https://www.baeldung.com/kotlin-generics
class UserAdmins<T>(private val credit: T) {

    init {
        println("init: $credit")
    }

    fun getValue(): T {
        return credit
    }


}

class Admin {
    init {
        println("admin")
    }
}

//constrains on T generic
class LinuxAdmins<T : Admin>(credit: T) {

    init {
        println("init: $credit")
    }


}

//star projection
fun printArray(array: List<*>) {
    println()
    array.forEach { print(it) }
}

//OUT - produces T
class Producer<out T>(private val value: T) {

    fun get(): T {
        return value
    }
}

//IN - consumes type T/A
class Consumer<in A>(value: A) {

    fun toString(value: A): String {
        return value.toString()
    }
}

fun main() {

    val admin1 = UserAdmins<String>("linux")
    val admin2 = UserAdmins<Int>(156)
    val admin3 = UserAdmins<Double>(74.93)

    assertTrue(admin1.getValue() is String)

    val admin4 = Admin()
    val admin5 = LinuxAdmins(admin4) //constrained generic

    printArray(listOf(1, 2, 3))
    printArray(listOf("a", "b", "c"))
    printArray(listOf(1.1, 2.2, 3.3))

    val producer= Producer<Int>(12)
      println("producer:  ${producer.get()}")

    val consumer = Consumer<Double>(23.54)
    println("consumer:  ${consumer.toString()}")


}