package ru.gembaruk.lesson5

import kotlin.random.Random

fun main() {
    val bingoNumbers = listOf(Random.nextInt(0, 43),Random.nextInt(0, 43), Random.nextInt(0, 43))

    println("Введите 3 числа от \"0\" до \"42\"")
    val userNumbers = listOf(readLine()?.toInt(), readLine()?.toInt(), readLine()?.toInt())
    val sizeUserNumbers = userNumbers.size

    val countCross = userNumbers.intersect(bingoNumbers).size
    when(countCross){
        3 -> println("пользователь угадал все числа и выиграл джекпот")
        2 -> println("пользователь угадал два числа и получает крупный приз")
        1 -> println("пользователю выплачивается утешительный приз")
        0 -> println("пользователь не угадал ни одного числа")
    }
    println("Загаданные числа: $bingoNumbers")
}