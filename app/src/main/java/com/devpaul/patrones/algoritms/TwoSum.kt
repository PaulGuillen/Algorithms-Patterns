package com.devpaul.patrones.algoritms

fun main(){
    val numbers = intArrayOf(3, 2, 6)
    val target = 9
    val result = twoSum(numbers, target)
    println("Indices: ${result[0]}, ${result[1]}")
}

fun twoSum(numbers: IntArray, target: Int): IntArray {
    val map = mutableMapOf<Int, Int>()

    for ((index, num) in numbers.withIndex()) {
        val complement = target - num
        if (map.contains(complement)) {
            return intArrayOf(map[complement]!!, index)
        }
        map[num] = index
    }

    throw IllegalArgumentException("No solution found")
}