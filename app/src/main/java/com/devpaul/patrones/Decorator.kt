package com.devpaul.patrones


fun main() {
    var coffee: Coffee = SimpleCoffee()
    println("${coffee.description()} \$${coffee.cost()}")

    coffee = MilkDecorator(coffee)
    println("${coffee.description()} \$${coffee.cost()}")

    coffee = SugarDecorator(coffee)
    println("${coffee.description()} \$${coffee.cost()}")
}

interface Coffee {
    fun cost(): Double
    fun description(): String
}

class SimpleCoffee : Coffee {
    override fun cost(): Double {
        return 5.0
    }

    override fun description(): String {
        return "Simple coffee"
    }
}

open class CoffeeDecorator(private val coffee: Coffee) : Coffee {
    override fun cost(): Double {
        return coffee.cost()
    }

    override fun description(): String {
        return coffee.description()
    }
}

class MilkDecorator(coffee: Coffee) : CoffeeDecorator(coffee) {
    override fun cost(): Double {
        return super.cost() + 1.5
    }

    override fun description(): String {
        return super.description() + ", milk"
    }
}

class SugarDecorator(coffee: Coffee) : CoffeeDecorator(coffee) {
    override fun cost(): Double {
        return super.cost() + 0.5
    }

    override fun description(): String {
        return super.description() + ", sugar"
    }
}
