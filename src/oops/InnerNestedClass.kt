package oops

class Outer {

    private val outer = "Outer Obj"
    val outerPublic = "outer public "

    class Nested {
        fun show() {
            println("NESTED cannot access outer class variables not even public")
        }

    }

    inner class NestedInner {
        fun show() {
            println("INNER class can access outer classes's obj $outer $outerPublic")
        }

    }
}

    fun main() {
        val nested = Outer.Nested()//can access statically
        val outerObj = Outer()
        val inner = outerObj.NestedInner() //need object to aaccess
        nested.show()
        inner.show()
    }