package com.example.kotlinbasics

data class CoffeeDetails(val sugarCount:Int,
           val name:String,
           val size:String,
           val creamAmount:Int)

fun main() {


}

fun askCoffeeDetails() {
    println("Who is the coffee for?")
    val nameCoffee = readln()

    println("How many spoons of sugar?")
    val sugarCount = readln().toInt()

    //makeCoffee(coffeeDetails: CoffeeDetails)
}


fun makeCoffee(coffeeDetails: CoffeeDetails) {
        when (coffeeDetails.sugarCount){
        0 -> println("Coffee with ${coffeeDetails.sugarCount} spoons of sugar for ${coffeeDetails.name}")
        1 -> println("Coffee for ${coffeeDetails.name} with ${coffeeDetails.sugarCount} spoon of sugar.")
        else -> println("Coffee for ${coffeeDetails.name} with ${coffeeDetails.sugarCount} spoons of sugar.")
    }
}


fun getInTheClub() {
    // greater than >
    // less than <
    // greater equal >=
    // less equal <=
    // equal ==

    var age = 0

    println("Please enter your age")
    val enteredValue = readln()
    age = enteredValue.toInt()


    //age = readln().toInt()

    if(age >= 18) {
        println("Okay!")
    }
    else{
        println("No good!")
    }
}

fun thorDogExample() {
    var thor = Dog("Thor", "Pit-bull", 12)
    // println("${thor.name} is a ${thor.breed} and is ${thor.age} years old")

}


fun lambdaLearning() {


    //  variable name: (What type of input you want) -> (Return type) = {logic here}
    val lambda: (Int) -> Int =  { it * 2}



}

fun mutableShoppingList(){

    // listOf is immutable list, CANNOT be changed
    val shoppingList = listOf("Processor", "RAM", "GPU", "CPU", "SSD")

    // mutableListOf is a mutable list, CAN be changed
    val mutableShoppingList = mutableListOf("Processor", "RAM", "GPU RTX 3060", "CPU", "SSD")

    // adding items to list
    mutableShoppingList.add("AIO")
    mutableShoppingList.remove("GPU RTX 3060")
    mutableShoppingList.add("GPU RTX 4090")


    mutableShoppingList[1] = "RAM"
    val hasRam = mutableShoppingList.contains("RAM")
    if (hasRam){
        println("Has RAM in list")
    }
    else{
        println("No RAM in list")
    }


    // for loop showing how to iterate list
    for (index in 0 until mutableShoppingList.size) {
        println("item ${mutableShoppingList[index]} is at index $index")

    }

    println(mutableShoppingList)
}

fun consistentCapitalization() {
    println("Please enter text: ")
    val userText = readln()

    val userTextUpper = consistentCapitalization(userText, "upper")
    val userTextLower = consistentCapitalization(userText, "lower")

    println("Uppercase: $userTextUpper")
    println("Lowercase: $userTextLower")
}

fun longestWord(){
    println("Enter a string of words and I'll tell you which is the longest!")
    var userText = readln()
    wordCheck(userText)

}

fun caesarCipher(){

    println("Cipher or Decipher? Please enter 1 for Cipher or 2 for Decipher: ")
    var choice = readln().toInt()

    when (choice) {
        1 ->
        {println("Please enter your message to be ciphered: ")
            var userMessage = readln()

            println("Please enter shift key: ")
            var userShiftKey = readln().toInt()

            cipher(userMessage, userShiftKey)
        }

        2 ->
        {println("Please enter your message to be deciphered: ")
            var userDecipher = readln()

            println("Please enter shift key: ")
            var userDecipherKey = readln().toInt()

            decipher(userDecipher, userDecipherKey)
        }


    }

}

fun fizzBuzz() {
    println("Please enter a number: ")
    var userNum = readln().toInt()
    fizzBuzz(userNum)

}

fun Steps() {
    println("Enter number of hashtags: ")
    var userNum = readln().toInt()
    steps(userNum)

}

fun triangles() {
    println("Please input number of rows: ")
    var numRows = readln().toInt()

    println("Please input what you want the triangle to be drawn with: *Recommendation: #")
    var userInput = readln()

    println("Please input 1 for triangle, 2 for square")
    var userShape = readln().toInt()
    triangles(numRows, userInput, userShape)

}