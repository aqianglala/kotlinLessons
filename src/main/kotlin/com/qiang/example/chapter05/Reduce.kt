package com.qiang.example.chapter05

fun main(args: Array<String>) {
    val listOf = listOf(1, 2, 3, 4, 5)
    // 求和
    println(listOf.reduce { acc, i -> acc + i })

    println(factorial(5))
}

fun factorial(n: Int): Int {
    return if (n == 0) {
        1
    } else {
        (1..n).reduce { acc, i -> acc * i }
    }
}