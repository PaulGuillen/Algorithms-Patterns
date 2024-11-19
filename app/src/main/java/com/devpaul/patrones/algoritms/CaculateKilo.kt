package com.devpaul.patrones.algoritms

import java.util.Scanner
import kotlin.math.roundToInt

fun main() {
    val scanner = Scanner(System.`in`)

    println("Enter the number of kilometers traveled:")
    val kilometers = readInput(scanner)

    println("Apply discount? (yes/no or 1/0):")
    val discountInput = scanner.next()
    val applyDiscount = discountInput == "yes" || discountInput == "1"

    val totalAmount = calculateTotalAmount(kilometers, applyDiscount)
    println("Total to charge: $${totalAmount.roundToInt()}")
}

fun readInput(scanner: Scanner): Double {
    while (true) {
        try {
            return scanner.nextDouble().also {
                if (it < 0) throw IllegalArgumentException("Distance cannot be negative.")
            }
        } catch (e: Exception) {
            println("Invalid input, please enter a valid number of kilometers:")
            scanner.nextLine()
        }
    }
}

fun calculateTotalAmount(kilometers: Double, applyDiscount: Boolean): Double {
    val baseRate = 2.25
    var total = kilometers * baseRate

    if (applyDiscount) {
        total *= 0.55
    }

    return total
}
