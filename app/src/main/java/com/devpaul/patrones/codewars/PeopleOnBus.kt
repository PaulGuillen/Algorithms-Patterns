package com.devpaul.patrones.codewars

/**How many people are in the bus when the bus stop*/


fun main() {
    val busStops = listOf(
        Pair(10, 0),  // 10 people get on, 0 people get off (10 on the bus)
        Pair(3, 5),   // 3 people get on, 5 people get off (10 + 3 - 5 = 8 on the bus)
        Pair(2, 1),   // 2 people get on, 1 person gets off (8 + 2 - 1 = 9 on the bus)
        Pair(0, 3)    // 0 people get on, 3 people get off (9 - 3 = 6 on the bus)
    )

    val result = numberOfPeople(busStops)
    println("Number of people on the bus: $result")
}

fun numberOfPeople(busStops: List<Pair<Int, Int>>): Int {
    println("on: ${busStops.sumOf { it.first }}")
    println("off: ${busStops.sumOf { it.second }}")
    return busStops.sumOf { (on, off) -> on - off }
}
