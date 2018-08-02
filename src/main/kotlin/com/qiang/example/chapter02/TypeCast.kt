package com.qiang.example.chapter02

open class Parent
class Child:Parent(){
    fun getName():String{
        return "小强"
    }
}

fun main(args: Array<String>) {
    // 智能类型转换
//    val p:Parent = Child()
//    if (p is Child){
//        println(p.getName())
//    }
    // 类型转换
    val p:Parent = Parent()
//    val c:Child = p as Child // 类似java的类型转换

    val c:Child? = p as? Child // 安全的类型转换，如果转换失败，不报错，返回为空
    println(c)
}