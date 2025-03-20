package com.example.kotlinbasics

fun main() {
    var fruitsList = mutableListOf("Strawberries", "Blueberries", "Raspberries", "Bananas", "Blackberries")

    /*
    println(fruitsList)

    fruitsList.add("Kiwi")

    println(fruitsList)

    fruitsList.remove("Raspberries")

    println(fruitsList)

        */

    if (fruitsList.contains("Bananas")) {
        fruitsList.add("Whipped Cream")

    }

    println(fruitsList)
}