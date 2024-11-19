package com.devpaul.patrones

fun main(){
    val conjuntoInmutable = setOf("apple", "banana", "cherry")
    println("Conjunto inmutable: $conjuntoInmutable")

    val conjuntoMutable = mutableSetOf("apple", "banana")
    conjuntoMutable.add("cherry")
    println("Conjunto mutable: $conjuntoMutable")
}