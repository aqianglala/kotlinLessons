package com.qiang.example.chapter04

interface A{
    // 可以声明属性，但是相当于声明了getter和setter方法，需要由实现类覆写
    var j:Int
    // 可以有默认实现，这样实现类可以不覆写该方法
    fun a(){
        println("a")
    }
}

class B(override var j: Int) :A