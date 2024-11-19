package com.devpaul.patrones.algoritms


fun main() {
    // Crear listas enlazadas de ejemplo
    val l1 = ListNode(2)
    l1.next = ListNode(4)
    l1.next?.next = ListNode(3)

    val l2 = ListNode(5)
    l2.next = ListNode(6)
    l2.next?.next = ListNode(4)

    // Llamar a la función addTwoNumbers
    val solution = Solution()
    val result = solution.addTwoNumbers(l1, l2)

    // Imprimir el resultado
    printList(result)
}

// Función auxiliar para imprimir una lista enlazada
fun printList(node: ListNode?) {
    var current = node
    while (current != null) {
        print("${current.value} ")
        current = current.next
    }
    println()
}

class ListNode(var value: Int) {
    var next: ListNode? = null
}

class Solution {
    fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
       val dummyHead = ListNode(0)
        var p: ListNode? = l1
        var q: ListNode? = l2
        var curr = dummyHead
        var carry = 0

        while (p != null || q != null) {
            val x = p?.value ?: 0
            val y = q?.value ?: 0
            val sum = carry + x + y
            carry = sum / 10
            curr.next = ListNode(sum % 10)
            curr = curr.next!!
            if (p != null) p = p.next
            if (q != null) q = q.next
        }
        if (carry > 0) {
            curr.next = ListNode(carry)
        }
        return dummyHead.next
    }
}
