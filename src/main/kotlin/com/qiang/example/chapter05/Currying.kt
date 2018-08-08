package com.qiang.example.chapter05

import java.io.OutputStream

fun log(tag: String, target: OutputStream, message: Any?) {
    target.write("[$tag] $message\n".toByteArray())
}

/**
 * 柯里化
 */
//fun log(tag: String) = fun(target: OutputStream) = fun(message: Any?) = target.write("[$tag] $message\n".toByteArray())

/**
 * 柯里化的模板方法
 */
fun <P1, P2, P3, R> Function3<P1, P2, P3, R>.curried() = fun(p1: P1) = fun(p2: P2) = fun(p3: P3) = this(p1, p2, p3)

fun main(args: Array<String>) {
    log("currying", System.out, "hello world!")
//    log("currying")(System.out)("hello world!")
    ::log.curried()("currying")(System.out)("hello world!")
}