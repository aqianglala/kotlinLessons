package com.qiang.example.chapter04

interface A1 {
    fun a1() = 1
}


interface A2 {
    fun a1() = -1
}

/**
 * 接口冲突处理，签名和返回值都相同才会产生冲突，可以使用super<T>来指定接口的默认实现
 */
class B1(private val b1: Int) : A1, A2 {
    override fun a1(): Int {
        return if (b1 > 0) {
            super<A1>.a1()
        } else {
            super<A2>.a1()
        }
    }

}

fun main(args: Array<String>) {
    println(B1(1).a1())
    println(B1(-1).a1())
}