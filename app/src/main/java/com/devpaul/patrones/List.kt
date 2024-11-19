package com.devpaul.patrones

//fun main() {
//    // Lista inmutable
//    val listaInmutable = listOf("manzana", "banana", "cereza")
//    println("Lista Inmutable: $listaInmutable")
//
//    // Intentar modificar una lista inmutable resultará en un error de compilación
//    // listaInmutable.add("durazno")  // Esto es un error
//
//    // Lista mutable
//    val listaMutable = mutableListOf("manzana", "banana", "cereza")
//    println("Lista Mutable Original: $listaMutable")
//
//    // Agregar elementos a la lista mutable
//    listaMutable.add("durazno")
//    println("Lista Mutable después de agregar 'durazno': $listaMutable")
//
//    // Modificar un elemento específico
//    listaMutable[1] = "kiwi"  // Cambia "banana" por "kiwi"
//    println("Lista Mutable después de cambiar 'banana' por 'kiwi': $listaMutable")
//
//    // Eliminar un elemento por su valor
//    listaMutable.remove("manzana")
//    println("Lista Mutable después de eliminar 'manzana': $listaMutable")
//
//    // Eliminar un elemento por su índice
//    listaMutable.removeAt(1)  // Elimina el elemento en el índice 1 (actualmente "durazno")
//    println("Lista Mutable después de eliminar el elemento en índice 1: $listaMutable")
//
//    // Acceder a un elemento específico
//    val elemento = listaMutable[0]  // Accede al primer elemento, que ahora es "kiwi"
//    println("Acceso al primer elemento de la lista mutable: $elemento")
//}

class AdditionalData(
    val key: String,
    val value: Boolean
)

fun main() {
    val status = listOf(
        AdditionalData(
            key = "aprobado",
            value = false
        ),
        AdditionalData(
            key = "pendiente",
            value = false
        ),
        AdditionalData(
            key = "negado",
            value = false
        ),
        AdditionalData(
            key = "rechazado",
            value = true
        ),
    )

    val approvedValue = status.firstOrNull { it.key == "aprobado" }?.value

    if (approvedValue != false) {
        println("Valor de 'aprobado': $approvedValue")
    } else {
        println("No se encontró un valor para 'aprobado'")
    }
}