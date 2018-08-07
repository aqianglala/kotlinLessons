package com.qiang.example.chapter05

fun main(args: Array<String>) {
    val listOf = listOf(
            0..3,
            2..9,
            3..20
    )

//    val flatList = listOf.flatMap {
//        it
//    }
    val flatList = listOf.flatMap {
        it.map {
            "No.$it"
        }
    }

    flatList.forEach(::println)
}