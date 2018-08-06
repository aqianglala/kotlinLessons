package com.qiang.example.chapter04

/**
 * 使用data修饰class，编译器会自动生成get，set，toString，hashCode等方法，还有componentN方法
 * 坑：
 * 1. final
 * 2. 没有无参的构造方法
 * 解决：官方出了allOpen和noArg插件
 */
data class Country(val id: Int, val name: String)

fun main(args: Array<String>) {
    val country = Country(1, "中国")
    println(country)
    val (id, name) = country
    println("$id, $name")

    val componentX = ComponentX()
    val (a, b) = componentX
    println("$a, $b")
}

class ComponentX {
    operator fun component1(): Int {
        return 1
    }

    operator fun component2(): String {
        return "hello world"
    }
}