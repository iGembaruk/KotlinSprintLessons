package ru.gembaruk.lesson4

const val OK_SUN = true
const val OK_TENT = true
const val OK_HUMIDITY = 20
const val OK_TIME_OF_YEAR = "весна, лето, осень"

fun main() {
    val isSun = true
    val isTent = true
    val humidity = 20
    val timeOfYear = "зима"

    println("Благоприятные ли условия сейчас для роста бобовых? ${isSun == OK_SUN && isTent == OK_TENT && humidity == OK_HUMIDITY && OK_TIME_OF_YEAR.contains(timeOfYear)}")
}