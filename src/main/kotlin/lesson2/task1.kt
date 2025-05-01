package ru.gembaruk.lesson2

const val GRADE_STUDENT1 = 3
const val GRADE_STUDENT2 = 4
const val GRADE_STUDENT3 = 3
const val GRADE_STUDENT4 = 5

fun main(){
    val avg = (GRADE_STUDENT1 + GRADE_STUDENT2 + GRADE_STUDENT3 + GRADE_STUDENT4) / 4.0;
    println(avg)
}