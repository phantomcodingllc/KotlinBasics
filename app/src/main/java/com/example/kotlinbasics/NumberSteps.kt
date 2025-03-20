package com.example.kotlinbasics

fun main() {
    println("Please input a number: ")
    var userInput = readln().toInt()

    println("Please enter a step range: ")
    var userStep = readln().toInt()
    var userList = mutableListOf<Int>()

    var startingNumber = 0


    while (startingNumber < userInput) {
        startingNumber += userStep
        if(startingNumber + userStep < userInput) {
            userList.add(startingNumber)
        }
        else {
            break
        }

    }
    userList.add(startingNumber)
    println(userList)
}