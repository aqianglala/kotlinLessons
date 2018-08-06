package com.qiang.example.chapter04

enum class LogLevel{
    A, B, C
}

fun main(args: Array<String>) {
    println(LogLevel.A)
    println(LogLevel.A.name)
    println(LogLevel.A.ordinal)
    println(LogLevel.valueOf("B"))
    LogLevel.values().forEach(::println)
}