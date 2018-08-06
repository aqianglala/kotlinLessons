package com.qiang.example.chapter04

/**
 * kotlin中的单例写法，相当于java中的饿汉式
 */
object MusicPlayer{

    fun start(url: String){
        println("开始播放：$url")
    }
}

fun main(args: Array<String>) {
    MusicPlayer.start("http://...")
}