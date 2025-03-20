package com.example.kotlinbasics

fun wordCheck(userInput: String): String {

    val wordList = userInput.split(" ")

    var longestWord = wordList[0]

    for (word in wordList){
        if (word.length > longestWord.length) {
            longestWord = word
        }
        else if (word.length < longestWord.length) {
           continue
        }
    }
        println("'$longestWord' is the longest word in your sentence. It has ${longestWord.length} letters.")
        return longestWord

}

