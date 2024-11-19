package com.devpaul.patrones

fun main(){
    val mapaInmutable = mapOf(1 to "uno", 2 to "dos", 3 to "tres")
    println("Mapa inmutable: $mapaInmutable")

    val mapaMutable = mutableMapOf(1 to "uno", 2 to "dos")
    mapaMutable[3] = "tres"
    println("Mapa mutable: $mapaMutable")


}