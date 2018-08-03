package com.qiang.example.chapter04

interface Drive {
    fun drive()
}

interface Write {
    fun write()
}

class Manager : Drive, Write {
    override fun write() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun drive() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}

/**
 * 接口代理
 */
class SeniorManager(driver: Drive, writer: Write) : Drive by driver, Write by writer

class Driver : Drive {
    override fun drive() {
        println("开车")
    }

}

class Writer : Write {
    override fun write() {
        println("写作")
    }

}

fun main(args: Array<String>) {
    val driver = Driver()
    val writer = Writer()
    val seniorManager = SeniorManager(driver, writer)
    seniorManager.drive()
    seniorManager.write()
}