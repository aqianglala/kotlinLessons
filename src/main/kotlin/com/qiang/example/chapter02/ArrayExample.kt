package com.qiang.example.chapter02

var arrayOfInt: IntArray = intArrayOf(1, 3, 5, 7)
var arrayOfChar: CharArray = charArrayOf('h', 'i')
var arrayOfString: Array<String> = arrayOf("我", "是码农")
var arrayOfChild: Array<Child> = arrayOf(Child(), Child())

fun main(args: Array<String>) {
    // 为避免装箱和拆箱的开销，kotlin为基本数据类型定制了数组，例如IntArray、CharArray
    // 输出第i个成员
    println(arrayOfChar[1])
    // 给第i个成员赋值
    arrayOfChar[1] = 's'
    println(arrayOfChar[1])
    // 长度
    println(arrayOfChar.size)
    // joinToString
    println(arrayOfChar.joinToString(""))
    // 切片
    println(arrayOfInt.slice(1..2))

}