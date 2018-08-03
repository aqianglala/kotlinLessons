package com.qiang.example.chapter03

fun main(args: Array<String>) {
    // 异常捕获和java完全一样，但是还可以作为表达式使用
    val sum = try {
        val arg0 = args[0].toInt()
        val arg1 = args[1].toInt()
        arg0 + arg1
    } catch (e: Exception) {
        e.printStackTrace()
        0
    }
    println("sum = $sum")
}