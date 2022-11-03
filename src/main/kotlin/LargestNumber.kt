import java.util.*

fun main () {
    val reader = Scanner(System.`in`)


    print("Enter first age: ")
    val number: Int = reader.nextInt()


    print("Enter second age: ")
    val second: Int = reader.nextInt()


    print("Enter third age: ")
    val third: Int = reader.nextInt()

    val largest = if(number > third){
    if(number > third)
            number

        else
            third
    }
    else {
        if (second > third)
            second
        else {
            third
        }

    }


    println("The largest number is  = $largest")

}


