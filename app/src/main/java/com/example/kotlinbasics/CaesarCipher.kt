package com.example.kotlinbasics

fun cipher(message: String, shift: Int) {

    var messageDecipher = message
    val shiftKey = shift

    val messageString = StringBuilder()

    for (letter in messageDecipher){

        var numericalValue = letter
        var shiftedValue = numericalValue + shiftKey
        //var wrapAroundValue = shiftedValue % 26
        var shiftedLetter = shiftedValue
        messageString.append(shiftedLetter)
    }
    print(messageString)

}

fun decipher(message: String, shift: Int) {

    var messageDecipher = message
    val shiftKey = shift

    val messageString = StringBuilder()

    for (letter in messageDecipher){

        var numericalValue = letter
        var shiftedValue = numericalValue - shiftKey
        //var wrapAroundValue = shiftedValue % 26
        var shiftedLetter = shiftedValue
        messageString.append(shiftedLetter)
    }
    print(messageString)
}