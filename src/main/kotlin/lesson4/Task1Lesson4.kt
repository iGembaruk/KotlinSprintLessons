package ru.gembaruk.lesson4

const val ALL = 13

fun main() {
    var countToday = ALL
    var countTomorrow = 9
    var availabilityToday: Boolean = false
    var availabilityTomorrow: Boolean = false

    if (countToday < ALL) {
        availabilityToday = true
    }

    if (countTomorrow < ALL) {
        availabilityTomorrow = true
    }
    println("[Доступность столиков на сегодня: $availabilityToday] \n[Доступность столиков на завтра: $availabilityTomorrow]")
}