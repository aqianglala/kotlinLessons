package com.qiang.example.chapter05

val add5 = { i: Int -> i + 5 }// f(x)

val multiplyBy2 = { i: Int -> i * 2 }// g(x)

/**
 * g(f(x)) = (i + 5) * 2
 */
infix fun <P1, P2, R> Function1<P1, P2>.andThen(function: Function1<P2, R>): Function1<P1, R> {
    return fun(p1: P1): R {
        return function.invoke(this.invoke(p1))
    }
}

/**
 * f(g(x)) = i * 2 + 5
 */
infix fun <P1, P2, R> Function1<P2, R>.compose(function: Function1<P1, P2>): Function1<P1, R> {
    return fun(p1: P1): R {
        return this.invoke(function.invoke(p1))
    }
}

/**
 * 函数复合需要结合中缀表达式infix和FunctionN的扩展函数来使用
 */
fun main(args: Array<String>) {
    // (8 + 5) * 2
    println(multiplyBy2(add5(8)))
    val add5AndThenMultiplyBy2 = add5 andThen multiplyBy2// g(f(x))
    println(add5AndThenMultiplyBy2(8))
    val add5composeMultiplyBy2 = add5 compose multiplyBy2// f(g(x))
    println(add5composeMultiplyBy2(8))
}