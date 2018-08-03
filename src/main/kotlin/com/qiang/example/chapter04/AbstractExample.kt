package com.qiang.example.chapter04

/**
 * 使用abstract修饰相当于使用了open修饰，子类可以继承
 * 默认的类和方法都是final，即不可继承或覆写
 */
abstract class Person{
    abstract fun work()
}

class Worker:Person(){
    override fun work() {

    }

}