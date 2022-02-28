package collection

/**
 * Mutable: can update
 * Immuntable: final
 */
fun main() {

    println("====Immutable===")
    //immutable - cannot update
    var listImmutable = listOf("foo", "boo")
    //  listImmutable[0]="too"
    for (name in listImmutable) {
        println(name)
    }
    println("====Mutable===")
    var listMutable = mutableListOf("moo", "coo")
    listMutable[0] = "too"
    for (name in listMutable) {
        println(name)
    }
}