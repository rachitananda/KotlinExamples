package oops

class MyButton {

    //kotlin does not support multiple companion objects
    /*  companion object {
          val VISIBLE = 1
          val INVISIBLE = 0
      }
      */
    // named companion obj
    companion object Visibility {
        val VISIBLE = 1
        val INVISIBLE = 0
    }

}

fun main() {
    println("Visibility:${MyButton.VISIBLE}")
    println("Visibility:${MyButton.INVISIBLE}")
}