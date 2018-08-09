package com.qiang.example.chapter06

fun html(block: Tag.() -> Unit): Tag {
    return Tag("Html").apply(block)
}

fun Tag.body(block: Body.() -> Unit) {
    this + Body().apply(block)
}

class Body : Tag("body") {
    var id by MapDelegate(properties)
    var `class` by MapDelegate(properties)
}

class StringNode(val content: String) : Node {
    override fun render() = content
}