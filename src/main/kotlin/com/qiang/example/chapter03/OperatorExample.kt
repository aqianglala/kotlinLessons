package com.qiang.example.chapter03

class Complex(var real: Double, var imaginary: Double) {
    /**
     * 运算符的重载要求函数名一致，参数个数能对的上，参数类型和返回值类型不care
     */
    operator fun plus(other: Complex): Complex {
        return Complex(real + other.real, imaginary + other.imaginary)
    }

    override fun toString(): String {
        return "$real + ${imaginary}i"
    }
}

fun main(args: Array<String>) {
    val c1 = Complex(1.0, 2.0)
    val c2 = Complex(3.0, 4.0)
    println(c1 + c2)
}