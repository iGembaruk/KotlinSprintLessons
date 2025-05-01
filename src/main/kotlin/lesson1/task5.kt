package ru.gembaruk.lesson1

const val SECONDS_IN_HOUR = 3600
const val MINUTES_IN_HOUR = 60
const val SECONDS: Short = 6480

fun main(){
    val HOURS = SECONDS / SECONDS_IN_HOUR
    val SURPALCE_SECONDS = SECONDS % SECONDS_IN_HOUR
    val MINUTES = SURPALCE_SECONDS / MINUTES_IN_HOUR
    val AFTER_SECONDS = SURPALCE_SECONDS % MINUTES_IN_HOUR
    println(String.format("%02d:%02d:%02d", HOURS.toInt(), MINUTES.toInt(), AFTER_SECONDS.toInt()))
}