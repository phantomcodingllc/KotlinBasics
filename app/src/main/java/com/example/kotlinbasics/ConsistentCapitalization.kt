package com.example.kotlinbasics

fun consistentCapitalization(inputString: String, operation: String): String {

    if(operation == "upper") {
       return inputString.uppercase()
    }
    else if (operation == "lower") {
        return inputString.lowercase()
    }
    else {
        return inputString
    }
}