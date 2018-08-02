package com.qiang.example.chapter02

fun main(args: Array<String>) {
//    如果一个方法可能返回null，那么编译器会提示你进行声明，这样在调用该方法时，编译器会提示你该方法可能会返回空，
//    需要你进行非空判断或者强制执行
    println(getName()?.length)
    println(getName()!!.length)
    // 判断为空就return
    var name = getName()?: return
}

// 如果有可能返回null，则需要在返回值类型后加?
fun getName(): String? {
    return null
}