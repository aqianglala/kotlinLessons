package com.qiang.example.chapter03

/**
 * Lambda表达式其实就是匿名函数
 * 写法为{[参数列表] -> [方法体，最后一行是返回值]}
 * Lambda表达式的简化
 * 1. 先优化Lambda
 * 2. 看Lambda表达式是否作为最后一个参数
 * 3. 是否只有一个Lambda
 * 4. 是否可以函数引用
 */
fun main(args: Array<String>) {
    // 两者等价
//    println(sumLambda(1, 2))
//    println(sumLambda.invoke(1, 2))
//    // 01
//    args.forEach({ it -> println(it)})
//    // 02 如果Lambda表达式只有一个参数，可以不写，默认是it
//    args.forEach({ println(it)})
//    // 03 当函数的最后一个参数是Lambda表达式，大括号可以移到小括号外边
//    args.forEach (){ println(it) }
//    // 04 如果函数参数只有一个Lambda，可以省略()
//    args.forEach { println(it) }
//    // 05 如果传入函数(指Lambda表达式中的函数)的参数类型与Lambda表达式的参数类型一致，可以使用函数引用的方式作为实参传入
//    args.forEach(::println)

//    // 终止Lambda表达式
//    args.forEach forEach@{
//        if (it == "3") return@forEach
//        println(it)
//    }
//    println("程序结束了")

    // Function2<java.lang.Integer, java.lang.Integer, java.lang.Integer>
    println(sumLambda)
}

// val sumLambda = fun(arg0:Int, arg1:Int):Int = arg0 + arg1
// 类型为(Int, Int) -> Int
val sumLambda = { arg0: Int, arg1: Int -> arg0 + arg1 }