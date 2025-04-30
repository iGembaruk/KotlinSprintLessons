package ru.gembaruk.lesson1

fun main(){
    val seconds: UShort = 6480U

    val hours = seconds / 3600U
    val surplusSeconds = seconds % 3600U
    val minutes = surplusSeconds / 60U
    val afterSeconds = surplusSeconds % 60U
    println(String.format("%02d:%02d:%02d", hours.toInt(), minutes.toInt(), afterSeconds.toInt()))
}