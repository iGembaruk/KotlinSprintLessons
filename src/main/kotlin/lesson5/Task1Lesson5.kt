package ru.gembaruk.lesson5


fun main() {
    val numberOne = (1..10).random()
    val numberTwo = (1..10).random()

    println("Сложи число: $numberOne с числом: $numberTwo. Напиши ответ:")
    val result = readln()?.toInt()
    if(result == numberOne + numberTwo) {
        println("Добро пожаловать!")
    } else {
        println("Доступ запрещен.")
    }
}