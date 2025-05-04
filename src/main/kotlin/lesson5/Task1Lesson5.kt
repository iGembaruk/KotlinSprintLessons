package ru.gembaruk.lesson5

import kotlin.random.Random

fun main() {
    val numberOne = Random.nextInt(1, 10);
    val numberTwo = Random.nextInt(1, 10);

    println("Сложи число: $numberOne с числом: $numberTwo. Напиши ответ:")
    val result = readLine()?.toInt()
    if(result == numberOne + numberTwo) {
        println("Добро пожаловать!")
    } else {
        println("Доступ запрещен.")
    }
}