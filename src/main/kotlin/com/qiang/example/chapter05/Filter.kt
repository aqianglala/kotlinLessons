package com.qiang.example.chapter05

fun main(args: Array<String>) {
    // fileter只保留Lambda表达式为true的元素
    (0..6).filter { it % 2 == 1 }.forEach(::println)
}