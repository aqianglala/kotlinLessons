package com.qiang.example.chapter05

fun main(args: Array<String>) {
    // filter接收(T) -> Boolean，而CharSequence.isNotEmpty()并没有接收参数，但还是可以使用函数引用的写法简化Lambda
    // 表达式，原因是扩展方法会有一个参数是自己的实例，相当于CharSequence.isNotEmpty(str:String)
    args.filter(String::isNotEmpty)

    // 使用实例去调用方法就不会有隐藏的参数了，因为已经有实例了
    val pdfPrinter = PdfPrinter()
    args.forEach(pdfPrinter::printPdf)
}

class PdfPrinter {
    fun printPdf(any: Any) {
        println(any)
    }
}