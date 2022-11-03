fun main (){
    println("Enter a number: ")
    val number = reader.nextInt()

    when(number){
        in 1 .. 10 -> println("A positive number less than 11. ")
        in 10 .. 100 -> println("A positive number between 10 and 100 (inclusive)")
    }
}
