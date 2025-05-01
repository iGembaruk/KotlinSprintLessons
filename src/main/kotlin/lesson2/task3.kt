package ru.gembaruk.lesson2

const val HOURS_DEPARTURE = 9
const val MINUTES_DEPARTURE = 39
const val MINUTES_IN_PATCH = 457

fun main() {
    val fullsHoursInPath = MINUTES_IN_PATCH / 60
    val minutesAfterFullHoursInPatch = MINUTES_IN_PATCH % 60

    var hoursArrival = HOURS_DEPARTURE + fullsHoursInPath
    var minutesArrival = minutesAfterFullHoursInPatch + MINUTES_DEPARTURE
    if(minutesArrival >= 60){
        hoursArrival += 1
        minutesArrival -= 60
    }
    println("$hoursArrival:$minutesArrival")
}