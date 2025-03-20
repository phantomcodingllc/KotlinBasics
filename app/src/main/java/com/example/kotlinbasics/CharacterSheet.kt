package com.example.kotlinbasics

class CharacterSheet(val name: String, val race: String, val job: String, val level: Int) {

    init {
        characterDetails(name, race, job, level)
    }

    fun characterDetails(name: String, race: String, job: String, level: Int) {
        println("Your character's name is: $name, race is: $race, job is: $job, level is: $level")
    }
}