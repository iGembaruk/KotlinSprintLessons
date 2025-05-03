package ru.gembaruk.lesson4

const val START_WEIGHT = 35
const val END_WEIGHT = 100
const val END_VOLUME = 100

fun main() {
    val weightCargo1 = 20
    val volumeCargo1 = 80

    val weightCargo2 = 50
    val volumeCargo2 = 100

    println("Груз с весом $weightCargo1 кг и объемом $volumeCargo1 л соответствует категории 'Average': ${weightCargo1 > START_WEIGHT && weightCargo1 <= END_WEIGHT && volumeCargo1 <= END_VOLUME}")
    println("Груз с весом $weightCargo2 кг и объемом $volumeCargo2 л соответствует категории 'Average': ${weightCargo2 > START_WEIGHT && weightCargo2 <= END_WEIGHT && volumeCargo2 <= END_VOLUME}")
}