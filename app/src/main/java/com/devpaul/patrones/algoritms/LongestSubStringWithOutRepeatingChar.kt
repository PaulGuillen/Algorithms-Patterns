package com.devpaul.patrones.algoritms

fun main() {
    val s = "abcabcbb"
    val result = lengthOfLongestSubstring(s)
    println("Longitud de la subcadena más larga sin caracteres repetidos: $result")
}

fun lengthOfLongestSubstring(s: String): Int {
    val charIndexMap = mutableMapOf<Char, Int>()
    var maxLength = 0
    var start = 0

    for (end in s.indices) {
        val char = s[end]

        if (charIndexMap.containsKey(char)) {
            start = maxOf(start, charIndexMap[char]!! + 1)
        }

        charIndexMap[char] = end

        maxLength = maxOf(maxLength, end - start + 1)
    }

    return maxLength
}