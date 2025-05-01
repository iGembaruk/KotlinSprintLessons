package ru.gembaruk.lesson2

const val countCrystals = 7
const val countIrons = 11
const val plusBuff = 0.2
fun main() {
    val bonusCrystals = countCrystals * plusBuff
    val bonusIrons = countIrons * plusBuff
    println(bonusCrystals.toInt())
    println(bonusIrons.toInt())
}