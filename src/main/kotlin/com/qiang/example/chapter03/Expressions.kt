package com.qiang.example.chapter03

class Book {
    /**
     * 中缀表达式，常用于dsl，允许类似运算符的方式来调用方法，比较少用
     */
    infix fun on(any: Any): Boolean {
        return false
    }
}

class Desk

fun main(args: Array<String>) {
    // 中缀表达式
    if (Book() on Desk()) {
        println("book on desk")
    }
    // 分支语句和分支表达式
    // 分支表达式有返回值，即每个分支的最后一句话，分支必须完备
    val mode = if (args.isEmpty()) {
        1
    } else {
        2
    }
    // when表达式，也可以作为表达式
    val x = 5
    val y = when (x) {
        6 -> println("x == 6")
        in 0..100 -> println("$x in 0..100")
        else -> println("不要解决不了的问题都弄到我这里来")
    }
}