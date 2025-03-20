package com.example.kotlinbasics

fun fizzBuzz(userInput: Int){

    val userNum = userInput
    var isFirst = true

    for (num in 1..userNum) {

        if (isFirst) {
            isFirst = false
        }
        else {
            print(", ")
        }

        if ( num % 5 == 0 && num % 3 == 0) {
            print("FizzBuzz")
        }

       else if ( num % 3 == 0) {
            print("Fizz")
        }
        else if ( num % 5 == 0 ) {
            print("Buzz")
        }

        else {
            print(num)
        }

    }

    println()
}