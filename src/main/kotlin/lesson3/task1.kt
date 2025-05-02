package ru.gembaruk.lesson3

const val MORNING = "Good morning"
const val EVENING = "Good evening"

fun main() {
    var userName = "Igor"
    var hello = "$MORNING, $userName"
    println(hello)

    hello = "$EVENING, $userName"
    println(hello)
}