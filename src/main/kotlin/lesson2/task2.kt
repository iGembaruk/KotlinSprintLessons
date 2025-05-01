package ru.gembaruk.lesson2

const val countPermanentPersonals = 50
const val salaryPermanentPersonals = 30_000
const val countInterns = 30
const val salaryInterns = 20_000

fun main(){
    val totalSalaryPermanentPersonals = countPermanentPersonals * salaryPermanentPersonals
    val sumFullPeoples = totalSalaryPermanentPersonals + (salaryInterns * countInterns)
    val avgSalary = sumFullPeoples / (countInterns + countPermanentPersonals)
    println("Расходы на выплату зарплаты постоянных сотрудников: $totalSalaryPermanentPersonals")
    println("Общие расходы по ЗП после прихода стажеров: $sumFullPeoples")
    println("Средняя ЗП одного сотрудника после устройства стажеров: $avgSalary")
}