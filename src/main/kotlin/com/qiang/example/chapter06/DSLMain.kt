package com.qiang.example.chapter06

fun main(args: Array<String>) {
    // <Html id="HtmlId" ><head id="headId" ></head><body id="bodyId" class="bodyClass" ><a href="http://www.baidu.com" ></a><div></div></body></Html>
//    val Html = Tag("Html")
//    Html.properties["id"] = "HtmlId"
//
//    val head = Tag("head")
//    head.properties["id"] = "headId"
//
//    val body = Tag("body")
//    body.properties["id"] = "bodyId"
//    body.properties["class"] = "bodyClass"
//    val a = Tag("a")
//    a.properties["href"] = "http://www.baidu.com"
//    val div = Tag("div")
//    body.children.add(a)
//    body.children.add(div)
//
//    Html.children.add(head)
//    Html.children.add(body)
//
//    Html.render().let(::println)

    html {
        "id"("HtmlId")
        "head"{
            "id"("headId")
        }
        body {
            id = "bodyId"
            `class` = "bodyClass"

            "a"{
                "href"("https://www.kotliner.cn")
                + "Kotlin 中文社区"
            }
        }
    }.render().let(::println)
}