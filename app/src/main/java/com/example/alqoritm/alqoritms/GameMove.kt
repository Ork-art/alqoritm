package com.example.alqoritm.alqoritms

/*
* In this game, the hero moves from left to right.
* The player rolls the dice and moves the number of spaces indicated by the dice two times.

Create a function for the terminal game that takes the current
* position of the hero and the roll (1-6) and return the new position.
* */
fun move(position: Int, roll: Int): Int {
    return position + roll * 2
}

fun main() {
    val currentPosition = 10
    val roll = 5
    val newPosition = move(currentPosition, roll)
    println("New Position: $newPosition")
}
