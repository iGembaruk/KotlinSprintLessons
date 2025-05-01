package ru.gembaruk.lesson2

const val COUNT_PERMANENT_PERSONAL = 50
const val SALARY_PERMANENT_PERSONAL = 30_000
const val COUNT_INTERNS = 30
const val SALARY_INTERN = 20_000

fun main(){
    val totalSalaryPermanentPersonals = COUNT_PERMANENT_PERSONAL * SALARY_PERMANENT_PERSONAL
    val sumFullPeoples = totalSalaryPermanentPersonals + (SALARY_INTERN * COUNT_INTERNS)
    val avgSalary = sumFullPeoples / (COUNT_INTERNS + COUNT_PERMANENT_PERSONAL)
    println("Расходы на выплату зарплаты постоянных сотрудников: $totalSalaryPermanentPersonals")
    println("Общие расходы по ЗП после прихода стажеров: $sumFullPeoples")
    println("Средняя ЗП одного сотрудника после устройства стажеров: $avgSalary")
}