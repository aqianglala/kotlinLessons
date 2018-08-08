package com.qiang.example.chapter05

import java.io.File

fun main(args: Array<String>) {
    File("build.gradle").readText().toCharArray().filterNot(Char::isWhitespace)
            .groupBy {
                it
            }.map {
                it.key to it.value.size
            }.forEach(::println)
}