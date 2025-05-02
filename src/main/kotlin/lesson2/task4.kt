package ru.gembaruk.lesson2

const val INTEREST = 100

fun main() {
    var bonus = 20.0
    val stuffedBonus: Double = bonus / INTEREST

    var countCrystals = 7
    var bonusCrystals = countCrystals * stuffedBonus

    var countIrons = 11
    var bonusIrons = countIrons * stuffedBonus
    println(bonusCrystals.toInt())
    println(bonusIrons.toInt())
}