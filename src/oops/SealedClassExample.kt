package oops

//https://proandroiddev.com/kotlin-sealed-classes-enums-with-swag-d3c4b799bcd4

sealed class State {

    class Error : State()   //singleton static  class

    class Loading : State()

    data class Data(val message: String) : State()


}

fun setScreenState(state: State) {

    when (state) {

        is State.Error -> {
            println("Error state")
        }
        is State.Loading -> {
            println("Loading state")
        }
        is State.Data -> {
            println("Error state: ${state.message}")
        }
    }

}


fun main() {

    val state1: State.Error = State.Error()
    val state2: State.Loading = State.Loading()
    val state3 = State.Data("waiting for response")
    setScreenState(state1)
    setScreenState(state2)
    setScreenState(state3)

}




