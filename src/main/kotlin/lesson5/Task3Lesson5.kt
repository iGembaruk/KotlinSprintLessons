package ru.gembaruk.lesson5

import kotlin.random.Random

fun main() {
    val bingoOne = Random.nextInt(0, 43)
    val bingoTwo = Random.nextInt(0, 43)

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

//    if(countWin == 2){
//        println("Поздравляем! Вы выиграли главный приз!")
//    } else if(countWin == 1){
//        println("Вы выиграли утешительный приз!")
//    } else {
//        println("Неудача!")
//    }

    when(countWin){
        2 ->  println("Поздравляем! Вы выиграли главный приз!")
        1 -> println("Вы выиграли утешительный приз!")
        0 -> println("Неудача!")
    }
    println("Загаданные числа: $bingoOne и $bingoTwo")
}