package com.qiang.example.chapter04

fun main(args: Array<String>) {
    println("abc".multiply(16))
    println("A".a)
}

/**
 * 扩展方法：只要在方法名前写上给谁扩展的就行了
 * 扩展属性：不能初始化，需要提供get，set方法，没有backing field，接口属性也没有backing field
 */
fun String.multiply(int: Int): String {
    val stringBuilder = StringBuilder()
    for (i in 0 until int) {
        stringBuilder.append(this)
    }
    return stringBuilder.toString()
}

var String.a: String
    get() {
        return "A"
    }
    set(value) {
        // 没有backing field，所以无意义
    }