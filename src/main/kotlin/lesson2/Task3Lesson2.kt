package ru.gembaruk.lesson2

const val MINUTES_IN_HOUR = 60

fun main() {
    var hourseDeparture = 9
    var minutesDeparture = 39
    var minutesInPatch = 457

    var allMinutes = minutesInPatch + minutesDeparture
    var hoursInPath = allMinutes / MINUTES_IN_HOUR
    var hoursArrival = hoursInPath + hourseDeparture

    var minutesAfterHoursInPath = allMinutes % MINUTES_IN_HOUR
    println("$hoursArrival:$minutesAfterHoursInPath")
}