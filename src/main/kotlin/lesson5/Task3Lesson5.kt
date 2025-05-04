package ru.gembaruk.lesson5

fun main() {
    val bingoOne = (1..43).random()
    val bingoTwo = (1..43).random()

    println("Введите два числа по очереди, числа в промежутке 0 и 42")
    val userOne = readLine()?.toInt()
    val userTwo = readLine()?.toInt()
    var countWin = 0

    if (userOne == bingoOne) {
        countWin++
    }
    if (userTwo == bingoTwo) {
        countWin++
    }

    when (countWin) {
        2 -> println("Поздравляем! Вы выиграли главный приз!")
        1 -> println("Вы выиграли утешительный приз!")
        0 -> println("Неудача!")
    }
    println("Загаданные числа: $bingoOne и $bingoTwo")
}