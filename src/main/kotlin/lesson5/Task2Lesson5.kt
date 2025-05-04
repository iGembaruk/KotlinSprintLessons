package ru.gembaruk.lesson5

const val AGE = 18
const val CURRENT_YEAR = 2025

fun main() {
    println("Введите свой год рождения: ")
    val age = readLine()?.toInt()

    val calculatorAge = CURRENT_YEAR - age!!

    if(calculatorAge >= AGE){
        println("Показать экран со скрытым контентом")
    } else {
        println("Осталось чуть-чуть, подрасти еще")
    }
}