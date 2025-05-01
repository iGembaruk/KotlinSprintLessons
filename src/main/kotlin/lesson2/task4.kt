package ru.gembaruk.lesson2

const val BONUS = 0.2

fun main() {
    var countCrystals = 7
    var bonusCrystals = countCrystals * BONUS

    var countIrons = 11
    var bonusIrons = countIrons * BONUS
    println(bonusCrystals.toInt())
    println(bonusIrons.toInt())
}