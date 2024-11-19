package com.devpaul.patrones

import java.util.Locale

fun areAnagrams(str1: String, str2: String): Boolean {
    // Normalizar los strings: eliminar espacios y convertir a minúsculas
    val normalizedStr1 = str1.replace("\\s".toRegex(), "").toLowerCase(Locale.ROOT)
    val normalizedStr2 = str2.replace("\\s".toRegex(), "").toLowerCase(Locale.ROOT)

    // Ordenar los caracteres de los strings normalizados
    val sortedStr1 = normalizedStr1.toCharArray().sorted().joinToString("")
    val sortedStr2 = normalizedStr2.toCharArray().sorted().joinToString("")

    // Comparar los strings ordenados
    return sortedStr1 == sortedStr2
}

fun main() {
    val str1 = "Listen"
    val str2 = "Silent"

    if (areAnagrams(str1, str2)) {
        println("$str1 y $str2 son anagramas")
    } else {
        println("$str1 y $str2 no son anagramas")
    }
}
