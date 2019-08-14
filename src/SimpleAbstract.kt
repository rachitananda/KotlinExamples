abstract class BankCard(){
    fun getNumber():String
    {
        return "236547895534"
    }

    abstract fun getType():String

}


class CardInfo : BankCard(){
   fun getInfo(): String{
       return getNumber();
   }

    override fun getType(): String {
        return "Debit"
    }
}


fun main(){

    //val card = BankCard() cannot create an instance of abstract class
    val user = CardInfo()
    println(user.getInfo())
    println(user.getType())
}