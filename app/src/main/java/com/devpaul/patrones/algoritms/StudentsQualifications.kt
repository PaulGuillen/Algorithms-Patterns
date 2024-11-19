package com.devpaul.patrones.algoritms

fun main() {
    val students = arrayOf("José", "Alberto", "Laura", "Noel", "Erika", "Daniel")
    val grades = arrayOf(31.0, 94.0, 98.5, 75.0, 46.5, 75.0)

    printStatistics(students, grades)
}

fun printStatistics(names: Array<String>, grades: Array<Double>) {
    val average = grades.average()
    val highest = grades.maxOrNull() ?: 0.0
    val lowest = grades.minOrNull() ?: 0.0
    val failingStudents = names.zip(grades).filter { it.second < 60.0 }

    println("Average grade: $average")
    println("Highest grade: $highest")
    println("Lowest grade: $lowest")
    println("Failing students:")
    failingStudents.forEach { println("${it.first}, ${it.second}") }
}
