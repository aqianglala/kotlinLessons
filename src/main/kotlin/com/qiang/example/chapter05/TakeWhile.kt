package com.qiang.example.chapter05

fun main(args: Array<String>) {
    // takeWhile 取到第一个不合符条件的就结束
    (0..6).takeWhile { it % 2 == 0 }.forEach(::println)
}