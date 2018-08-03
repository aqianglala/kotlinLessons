package com.qiang.example.chapter03

fun main(args: Array<String>) {
    for (arg in args) {
        println(arg)
    }

    // 以下两种方式等效，IndexedValue可以写成(index, value)，原因是IndexedValue有data关键字修饰
    for ((index, value) in args.withIndex()) {
        println("$index -> $value")
    }

    for (IndexedValue in args.withIndex()) {
        println("${IndexedValue.index} -> ${IndexedValue.value}")
    }

    // for循环接收的数据只要重载了iterator操作符方法，就可以
    val list = MyIntList()
    list.add(1)
    list.add(2)
    list.add(3)
    for (i in list) {
        println(i)
    }
    // while循环，多层嵌套循环如何跳出
    var x = 5
    Outer@ for (i in 1..5) {
        Inner@ while (x > 0) {
            if (x == 3) {
                break@Outer
            }
            x--
        }
    }

}

class MyIterator(val iterator: Iterator<Int>) {
    operator fun next(): Int {
        return iterator.next()
    }

    operator fun hasNext(): Boolean {
        return iterator.hasNext()
    }
}

class MyIntList {
    private val list = ArrayList<Int>()

    fun add(i: Int) {
        list.add(i)
    }

    fun remove(i: Int) {
        list.remove(i)
    }

    operator fun iterator(): MyIterator {
        return MyIterator(list.iterator())
    }
}