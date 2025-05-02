package ru.gembaruk.lesson2


fun main() {
    var bonus = 0.2

    var countCrystals = 7
    var bonusCrystals = countCrystals * bonus

    var countIrons = 11
    var bonusIrons = countIrons * bonus
    println(bonusCrystals.toInt())
    println(bonusIrons.toInt())
}