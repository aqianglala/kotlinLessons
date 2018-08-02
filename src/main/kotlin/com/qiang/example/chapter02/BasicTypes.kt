package com.qiang.example.chapter02

var aBoolean: Boolean = false
var aByte: Byte = 127
var aMaxByte: Byte = Byte.MAX_VALUE
var aMinByte: Byte = Byte.MIN_VALUE
var aShort: Short = 32767
var aMaxShort: Short = Short.MAX_VALUE
var aMinShort: Short = Short.MIN_VALUE
var aInt: Int = 8
var aMaxInt: Int = Int.MAX_VALUE
var aMinInt: Int = Int.MIN_VALUE
var aLong: Long = 8
var aMaxLong: Long = Long.MAX_VALUE
var aMinLong: Long = Long.MIN_VALUE
var aFloat: Float = 8.0f // 小数会被默认当成是Double类型，因此要加f
var aMaxFloat: Float = Float.MAX_VALUE
var aMinFloat: Float = Float.MIN_VALUE // 最小的非0正数
var aDouble: Double = 8.0
var aMaxDouble: Double = Double.MAX_VALUE
var aMinDouble: Double = Double.MIN_VALUE // 最小的非0正数

var aChar: Char = '0' // 两个字节，表示一个16为的unicode字符

// 基本数据类型的转换：不可隐式转换
var bInt:Int = 8
//var bLong:Long = bInt 编译不通过
var bLong: Long = bInt.toLong()

var aString: String = "HelloWorld"
var fromCharArray: String = String(charArrayOf('H','e','l','l','o','W','o','r','l','d'))

var rawString: String = """
    aaa
    $aString
"""

fun main(args: Array<String>) {
    // kotlin中不区分基本类型和装箱类型，内部会自动判断
    println("boolean: $aBoolean")
    // 以下都为Number的子类
    println("max byte: $aMaxByte")
    println("min byte: $aMinByte")

    println("max short: $aMaxShort")
    println("min short: $aMinShort")

    println("max int: $aMaxInt")
    println("min int: $aMinInt")

    println("max long: $aMaxLong")
    println("min long: $aMinLong")

    println("max float: $aMaxFloat")
    println("min float: $aMinFloat")

    println("max double: $aMaxDouble")
    println("min double: $aMinDouble")

    println("aChar: $aChar")

    // ==比较的是内容，相当于java中的equals，===比较的是引用值
    println(aString == fromCharArray)
    println(aString === fromCharArray)

    // 原始字符串，但仍可使用字符串模板，如果要转义字符串模板中的$，$和后面的变量名之间要有空格
    println(rawString)
}