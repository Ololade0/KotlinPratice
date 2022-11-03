import java.util.*

val reader = Scanner(System.`in`)

fun main() {

    println("Enter a number: ")
    val n = reader.nextInt()

    when (n) {
        1, 2, 3 -> println("n is a positve number less than 4")
        0 -> println("n is zero")
        -1, -2 -> println("n is a negative greater than 3")
    }
}
