package com.example.kotlinbasics

fun steps(userInput: Int) {

    var numHashtags = userInput

    var startingNumber = 0


    while (startingNumber <= numHashtags) {
       for (i in 1.. startingNumber) {
           print("#")
       }
        println()
        startingNumber++
    }
}