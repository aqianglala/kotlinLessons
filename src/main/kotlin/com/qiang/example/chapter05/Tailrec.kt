package com.qiang.example.chapter05

data class ListNode(var value: Int, var next: ListNode?)

/**
 * 递归后没有其他操作的递归可以使用tailrec关键字进行尾递归优化，否则可能出现Stack Overflow
 */
tailrec fun findListNode(head: ListNode?, value: Int): ListNode? {
    head ?: return null
    if (head.value == value) return head
    return findListNode(head.next, value)
}

/**
 * 不是尾递归，使用tailrec关键字时编译器会提示
 */
fun factorial1(n: Int): Int {
    if (n == 0) return 1
    return n * factorial1(n - 1)
}