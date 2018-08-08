package com.qiang.example.chapter05

import java.nio.charset.Charset

val makeString = fun(byteArray: ByteArray, charset: Charset): String {
    return String(byteArray, charset)
}

/**
 * 通过扩展方法得到偏函数
 * 偏函数就是固定某些参数后的函数
 */
fun <P1, P2, R> Function2<P1, P2, R>.partial2(p2: P2) = fun(p1: P1) = this(p1, p2)

fun main(args: Array<String>) {
    val str = "我是中国人"
    println(makeString(str.toByteArray(charset("GBK")), charset("GBK")))
    val makeStringFromGbkBytes = makeString.partial2(charset("GBK"))
    println(makeStringFromGbkBytes(str.toByteArray(charset("GBK"))))
}