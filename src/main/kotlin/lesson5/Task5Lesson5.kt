package ru.gembaruk.lesson5

fun main() {
    val bingoNumbers = listOf(
        (1..43).random(),
        (1..43).random(),
        (1..43).random()
    )

    println("Введите 3 числа от \"0\" до \"42\"")
    val userNumbers = listOf(
        readln()?.toInt(),
        readln()?.toInt(),
        readln()?.toInt()
    )
    val sizeUserNumbers = userNumbers.size

    val countCross = userNumbers.intersect(bingoNumbers).size
    when (countCross) {
        3 -> println("пользователь угадал все числа и выиграл джекпот")
        2 -> println("пользователь угадал два числа и получает крупный приз")
        1 -> println("пользователю выплачивается утешительный приз")
        0 -> println("пользователь не угадал ни одного числа")
    }
    println("Загаданные числа: $bingoNumbers")
}