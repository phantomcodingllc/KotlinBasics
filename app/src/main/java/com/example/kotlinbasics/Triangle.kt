package com.example.kotlinbasics

fun triangles (userInput: Int, userString: String, userShape: Int) {


    var startingNum = 0
    var userShapes = userShape

    when (userShapes) {
        1 -> { //triangle
            while (startingNum <= userInput) {
                for (i in 1..startingNum) {
                    print(userString)
                }
                println()
                startingNum++
            }
        }
        2 -> { //square
            for (row in 1..userInput) {
                for (col in 1..userInput) {
                    print(userString)
                }
                println()
            }
        }
     }
}