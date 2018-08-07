package com.qiang.example.chapter05

fun main(args: Array<String>) {
    // 相当于reduce加了个初始值
    println((0..6).fold(1) { acc, i -> acc + i })
}