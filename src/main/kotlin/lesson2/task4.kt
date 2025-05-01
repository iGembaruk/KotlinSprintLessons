package ru.gembaruk.lesson2

const val COUNT_CRYSTALS = 7
const val COUNT_IRONS = 11
const val BONUS = 0.2

fun main() {
    val bonusCrystals = COUNT_CRYSTALS * BONUS
    val bonusIrons = COUNT_IRONS * BONUS
    println(bonusCrystals.toInt())
    println(bonusIrons.toInt())
}