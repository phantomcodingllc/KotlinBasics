package com.example.kotlinbasics

class Book (val title: String = "Unknown", val author: String = "Anonymous", val yearPublished: Int = 2025){


    init {
        bookDetails(title, author, yearPublished)
    }

    fun bookDetails(title: String, author: String, yearPublished: Int){
        println("Title is: $title, Author is: $author, The year published is: $yearPublished")
    }

}