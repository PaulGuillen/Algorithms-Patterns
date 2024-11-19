package com.devpaul.patrones.algoritms

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    val numbers = mutableListOf<Double>()

    println("Enter numbers (enter 0 to finish):")

    while (true) {
        val number = scanner.nextDouble()
        if (number == 0.0) break
        numbers.add(number)
    }

    if (numbers.isNotEmpty()) {
        val sum = numbers.sum()
        val average = numbers.average()
        println("Sumatoria: $sum")
        println("Promedio: $average")
    } else {
        println("No numbers entered.")
    }
}
