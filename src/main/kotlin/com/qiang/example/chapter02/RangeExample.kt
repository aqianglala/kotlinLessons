package com.qiang.example.chapter02

val range:IntRange = 0..100 // [0,100]
val rangExclusive: IntRange = 0 until 100 // [0,100)
val emptyRange:IntRange = 0..-1

fun main(args: Array<String>) {
    // 以下两种方式等价
    println(range.contains(1))
    println(1 in range)
    // 遍历
    for (i in range){
        println("$i,")
    }
}