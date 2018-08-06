package com.qiang.example.chapter04

/**
 * 密封类：子类可数
 * 枚举类：实例可数
 */
sealed class Father {
    class Child01 : Father()

    class Child02 : Father()
}