package ru.gembaruk.lesson4

fun main() {
    var day = 5

    println("""
        Упражнения для рук:    ${day % 2 != 0}
        Упражнения для ног:    ${day % 2 == 0}
        Упражнения для спины:  ${day % 2 == 0}
        Упражнения для пресса: ${day % 2 != 0}
    """.trimIndent())
}