import java.util.Scanner

fun main(){
    val reader = Scanner(System.`in`)

    println("Enter a character: ")
    var vowel = reader.next()

    when(vowel){
        "A" -> println("A is a vowel")
        "E" -> println("E is a vowel")
        "I" -> println("I is a vowel")
        "O" -> println("O is a vowel")
        "U" -> println("U is a vowel")
        else -> println("$vowel is a  Consonant")

    }

    fun main(){
        var ch = 'A'
        when(ch){
            'A', 'E', 'I', 'O', 'U' -> println("$ch is a vowel")
            else -> println("$ch is a Consonant")
        }

    }
}