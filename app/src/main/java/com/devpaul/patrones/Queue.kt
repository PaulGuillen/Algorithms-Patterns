package com.devpaul.patrones

fun main(){
    val cola = ArrayDeque<String>()
    cola.addLast("primero")
    cola.addLast("segundo")
    cola.addLast("tercero")
    println("Primer elemento de la cola: ${cola.removeFirst()}")  // "primero"


    val pila = ArrayDeque<String>()
    pila.addLast("primero")
    pila.addLast("segundo")
    pila.addLast("tercero")
    println("Último elemento de la pila: ${pila.removeLast()}")  // "tercero"


    val secuencia = sequenceOf(1, 2, 3, 4)
    val resultado = secuencia
        .map { it * it }
        .filter { it > 5 }
        .toList()

    println("Resultados de la secuencia: $resultado")  // [9, 16]
}