package ru.gembaruk.lesson2

const val hoursDeparture = 9
const val minutesDeparture = 39
const val minutesInPath = 457
fun main() {
    val fullsHoursInPath = minutesInPath / 60
    val minutesAfterFullHoursInPatch = minutesInPath % 60

    var hoursArrival = hoursDeparture + fullsHoursInPath
    var minutesArrival = minutesAfterFullHoursInPatch + minutesDeparture
    if(minutesArrival >= 60){
        hoursArrival += 1
        minutesArrival -= 60
    }
    println("$hoursArrival:$minutesArrival")
}