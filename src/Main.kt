import model.User
import operations.AddTwoNumber
import operations.SubTwoNumber
import java.util.*
import kotlin.collections.ArrayList

/*
    Byte 	8 bit 	-128 to 127
    Short 	16 bit 	-32768 to 32767
    Int 	32 bit 	-2,147,483,648 to 2,147,483,647
    Long 	64 bit 	-9,223,372,036,854,775,808 to +9,223,372,036,854,775,807
    Float 	32 bit 	1.40129846432481707e-45 to 3.40282346638528860e+38
    Double 	64 bit 	4.94065645841246544e-324 to 1.79769313486231570e+308
    */

fun main() {

//    calculation()
    listOfData()

}

private fun calculation() {
    val scanner = Scanner(System.`in`)
    val number1: Int = scanner.nextInt()
    val number2: Int = scanner.nextInt()

    println(
        "Sum of the given numbers: " +
                AddTwoNumber().addTwoNumber(
                    number1, number2
                ).toString()
    )

    println(
        "Sub of the given numbers: " +
                SubTwoNumber().subTwoNumber(
                    number1, number2
                ).toString()
    )
}

private fun listOfData() {
    val listOfString: ArrayList<User> = ArrayList()

    listOfString.add(User("Sabbir", "24", "M"))
    listOfString.add(User("Mazharul", "24", "M"))
    listOfString.add(User("Mazharul Sabbir", "24", "M"))

    var length = listOfString.size - 1

    for (i in 0..length) {
        val name = listOfString[i].name
        val age = listOfString[i].age
        val gender = listOfString[i].gender
        println("User $i ->")

        println("Name: $name \t\t")
        println("Age: $age \t\t")
        println("Gender: $gender \n\n")

    }
}
