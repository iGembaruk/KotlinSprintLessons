package ru.gembaruk.lesson2

fun main(){
    var countPermanentPersonal = 50
    var salaryPermanentPersonal = 30_000
    var countInterns = 30
    val salaryIntern = 20_000

    var totalSalaryPermanentPersonals = countPermanentPersonal * salaryPermanentPersonal
    var sumFullPeoples = totalSalaryPermanentPersonals + (salaryIntern * countInterns)
    var avgSalary = sumFullPeoples / (countInterns + countPermanentPersonal)
    println("Расходы на выплату зарплаты постоянных сотрудников: $totalSalaryPermanentPersonals")
    println("Общие расходы по ЗП после прихода стажеров: $sumFullPeoples")
    println("Средняя ЗП одного сотрудника после устройства стажеров: $avgSalary")
}