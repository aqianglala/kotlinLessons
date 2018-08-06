package com.qiang.example.chapter04

import kotlin.reflect.KProperty

/**
 * 属性代理
 * 写法：var/val <property name>: <Type> by 代理者
 * 代理者需要实现相应的getValue和setValue方法
 */
class Delegate {
    val hello by lazy { "hello world" }
    val hello2 by X()
    var hello3 by X()
}

class X {
    private var value: String? = null

    operator fun getValue(thisRef: Any?, property: KProperty<*>): String {
        return value ?: ""
    }

    operator fun setValue(delegate: Delegate, property: KProperty<*>, s: String) {
        value = s
    }
}

fun main(args: Array<String>) {
    val delegate = Delegate()
    println(delegate.hello)
    println(delegate.hello2)
    delegate.hello3 = "aaaa"
    println(delegate.hello3)
}