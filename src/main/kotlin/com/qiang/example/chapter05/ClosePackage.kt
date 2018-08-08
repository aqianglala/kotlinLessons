package com.qiang.example.chapter05

fun main(args: Array<String>) {
    // 每次调用的返回值都不一样
    // 闭包持有函数的运行状态
    var x = makeFun()
    x()
    x()
    x()
    x()
    x()
}

fun makeFun(): () -> Unit {
    var count = 0
    return fun() {
        println(++count)
    }
}