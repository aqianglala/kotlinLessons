package com.qiang.example.chapter03

const val HELLO_WORLD = "Hello world"// val表示value，类似java中的final，但前面加上const才与final等价，成为编译器常量
fun main(args: Array<String>) {
    // 计算器
    if (args.size != 2) {
        println("请输入两个参数，例如1 2")
    }
    val arg0 = args[0].toInt()// 类型推导
    val arg1 = args[1].toInt()
    println("$arg0 + $arg1 = ${sum1(arg0, arg1)}")
}

/**
 * 如果方法体是一个表达式，可以简写
 */
fun sum(arg0: Int, arg1: Int): Int = arg0 + arg1

/**
 * 匿名函数
 */
val sum1 = fun(arg0: Int, arg1: Int): Int = arg0 + arg1