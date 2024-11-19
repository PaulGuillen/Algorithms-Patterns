package com.devpaul.patrones

fun main() {
    val strategies = mapOf(
        "+" to AddStrategy(),
        "-" to SubtractStrategy(),
        "*" to MultiplyStrategy(),
        "/" to DivideStrategy()
    )

    val strategiesMapped = Strategies()
    strategiesMapped.setStrategy(strategies["+"]!!)
    println(strategiesMapped.executeStrategy(5, 3))

    strategiesMapped.setStrategy(strategies["-"]!!)
    println(strategiesMapped.executeStrategy(5, 3))

    strategiesMapped.setStrategy(strategies["*"]!!)
    println(strategiesMapped.executeStrategy(5, 3))

    strategiesMapped.setStrategy(strategies["/"]!!)
    println(strategiesMapped.executeStrategy(5, 3))
}

class Strategies {
    private var strategy: Strategy? = null

    fun setStrategy(strategy: Strategy) {
        this.strategy = strategy
    }

    fun executeStrategy(a: Int, b: Int): Int {
        return strategy?.execute(a, b) ?: 0
    }
}

interface Strategy {
    fun execute(a: Int, b: Int): Int
}

class AddStrategy : Strategy {
    override fun execute(a: Int, b: Int): Int {
        return a + b
    }
}

class SubtractStrategy : Strategy {
    override fun execute(a: Int, b: Int): Int {
        return a - b
    }
}

class MultiplyStrategy : Strategy {
    override fun execute(a: Int, b: Int): Int {
        return a * b
    }
}

class DivideStrategy : Strategy {
    override fun execute(a: Int, b: Int): Int {
        return a / b
    }
}
