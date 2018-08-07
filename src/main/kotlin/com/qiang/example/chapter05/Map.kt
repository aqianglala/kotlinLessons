package com.qiang.example.chapter05

fun main(args: Array<String>) {
    val list = listOf(1, 2, 3, 4, 5)

    // 传统方式
//    val newList = ArrayList<Int>()
//
//    list.forEach {
//        val newElement = it * 2 + 3
//        newList.add(newElement)
//    }
    // 使用map高阶函数
//    val newList = list.map { it * 2 + 3 }

    // 使用map转换类型
    val newList = list.map(Int::toDouble)

    newList.forEach(::println)
}