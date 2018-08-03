package com.qiang.example.chapter03

fun main(args: Array<String>) {
    vararg(1.0, 1, 2, 3, string = "hello")
    val ints = intArrayOf(1, 2, 3)
    // * spread operator，只可以展开数组，只可以用于变长参数的场景，不可以重载
    // 当产生歧义时使用具名参数
    // 第一个参数使用默认参数时，后面的参数会产生歧义，因此只能使用具名参数
    vararg(ints = * ints, string = "hello")
}

fun vararg(double: Double = 0.0, vararg ints: Int, string: String) {
    ints.forEach(::println)
}