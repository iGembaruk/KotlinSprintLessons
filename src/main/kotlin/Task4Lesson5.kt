package ru.gembaruk

const val LOGIN = "Zaphod"
const val PASSWORD = "PanGalactic"

fun main() {
    println("Введите логин для входа в систему")
    val userLogin = readLine()

    if (userLogin.equals(LOGIN)) {
        println("Введите пароль")
        val passwordLogin = readLine()

        if (passwordLogin.equals(PASSWORD)) {
            println("Приветствую Вас, $userLogin")
        } else {
            println("Неверно введен пароль!")
        }
    } else {
        println("Зарегистрируйтесь, пожалуйста")
    }
}