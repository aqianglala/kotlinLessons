package com.qiang.example.chapter03

/**
 * 属性的访问控制
 */
class A {
//    protected var A = 0 // 默认帮我们实现了getter和setter方法
//        protected get// 修改访问权限
//        // 覆写getter和setter
//        get() {
//            println("get")
//            return field
//        }
//        set(value) {
//            println("set")
//            field = value
//        }

}

class X

/**
 * 属性初始化
 */
class B {
    var b0: String? = null // 不推荐使用
    lateinit var b1: String // 后面使用的时候自己考虑后果
    val b2: X by lazy {
        println("初始化了b2")
        X()
    }
}

fun main(args: Array<String>) {
    val b = B()
    println(b.b0?.length)
    b.b1 = "b1"
    println(b.b1)
    println(b.b2)
}