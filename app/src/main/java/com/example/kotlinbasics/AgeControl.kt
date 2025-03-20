package com.example.kotlinbasics

fun main() {
    println("Please enter your age")

    var age = 0

    var ageValue = readln()
    age = ageValue.toInt()

   // if(age >=18){
   //     println("You can enter!")
   // }
   // else if(age <= 40 && age >= 18){
   //     println("Please leave!")
   // }
 //   else{
  //      println("Go home!")
  //  }

    if (age >= 40) {
        println("Please go home!")
    }
    else if (age <= 18) {
        println("Please leave!")
    }
    else if (age in 18 .. 39) {
        println("You can enter!")
    }
}