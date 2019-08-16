package oops

//https://proandroiddev.com/kotlin-made-interface-so-much-better-bbeaa59abdd7

interface CreditCard {

    val cardNumber: String //can have variables

    fun canApply(age: Int): Boolean

    fun type(): String {
        return "credit card"
    } //default value : not compulsory to implement

    fun score(): Int {
        return 110
    }

    fun isEligible(): Boolean = score() > 100  //can use method as object

    fun cardNumberLength() :Int { return cardNumber.length}

    fun isValidCardNo() = cardNumberLength() >8

}


class MasterCard(override val cardNumber: String) : CreditCard {

    override fun canApply(age: Int): Boolean {

        if (age > 50) {
            return false
        }
        return true

    }

    override fun score(): Int {
        return 120
    }
}

//should override object in constructor
class Visa(override val cardNumber: String) : CreditCard {

    override fun canApply(age: Int): Boolean {

        if (age > 60) {
            return false
        }
        return true

    }

    override fun type(): String {
        return "Personal ${super.type()}"
    }

    override fun score(): Int {
        return 90
    }
}

//delegation
class  PayPal(client : CreditCard) : CreditCard by client {

    fun payPalType () :String {
        return this.type()
    }

}

fun main() {
    val visa = Visa("27463768325732")
    println("oops.Visa Can Apply: ${visa.canApply(52)}")
    println("oops.Visa Type: ${visa.type()}")
    println("oops.Visa Score: ${visa.score()}")
    println("oops.Visa IsEligible: ${visa.isEligible()}")
    println("oops.Visa IsValidCardNO: ${visa.isValidCardNo()}")

    val mastercard = MasterCard("27434768325732")
    println("oops.MasterCard Can Apply: ${mastercard.canApply(52)}")
    println("oops.MasterCard Type: ${mastercard.type()}")
    println("Mastercard Score: ${mastercard.score()}")
    println("Mastercard IsEligible: ${mastercard.isEligible()}")
    println("Mastercard IsValidCardNO: ${mastercard.isValidCardNo()}")

    val payPalVisa= PayPal(visa)
    println("Paypal CardNo: ${payPalVisa.cardNumber}")
    println("Paypal Type: ${payPalVisa.type()}")

    val payPalMaster= PayPal(mastercard)
    println("Paypal CardNo: ${payPalMaster.cardNumber}")
    println("Paypal Type: ${payPalMaster.type()}")
}