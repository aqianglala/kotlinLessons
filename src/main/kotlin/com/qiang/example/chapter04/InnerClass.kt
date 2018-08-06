package com.qiang.example.chapter04

class Outter {
    /**
     * 静态内部类与非静态内部类的区别在于非静态内部类持有外部类的状态
     * kotlin默认是静态内部类，如果要作为非静态内部类，那可以在前面加inner修饰
     * 使用this@外部类名.属性名的方式区分与内部类的同名属性
     */
    val a: Int = 0

    inner class Inner {
        val a: Int = 1
        fun hello() {
            println(this@Outter.a)
        }
    }
}

interface OnClickListener {
    fun onClick()
}

class View {
    var onClickListener: OnClickListener? = null
}

fun main(args: Array<String>) {
    val outter = Outter()
    val inner = outter.Inner()

    val view = View()
    // 匿名内部类，比java好的地方就是还可以继承和实现
    view.onClickListener = object : OnClickListener {
        override fun onClick() {

        }
    }
}