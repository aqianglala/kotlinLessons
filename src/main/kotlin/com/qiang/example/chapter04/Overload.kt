package com.qiang.example.chapter04

/**
 * 方法重载：名称相同，参数列表不同（即签名不同）
 * 默认参数：定义函数参数的时候给上默认值
 *
 * 避免定义关系不大的重载
 */
class Overloads{
    /**
     * 要想在java中也使用默认参数的特性，可以加JvmOverloads注解
     */
    @JvmOverloads
    fun a(int:Int = 0){

    }
}