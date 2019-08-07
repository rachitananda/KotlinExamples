//import com.sun.org.apache.xpath.internal.operations.Bool
import java.util.*

fun main(args: Array<String>) {

    print("Enter Year of Birth ")
    val dob: Int = readLine()!!.toInt()

    val thisYear = Calendar.getInstance().get(Calendar.YEAR)

    val age = thisYear - dob
    print("Your age is $age")

    val isInRange: Boolean = age > 18 && age < 58

    val isValidAge = age in 19..57
    println("isInRange $isInRange")
    println("isInRange $isValidAge")


}