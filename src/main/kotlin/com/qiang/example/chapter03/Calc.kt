package com.qiang.example.chapter03

fun main(args: Array<String>) {
    while (true) {
        println("请输入算式，例如 3 + 4")
        val input = readLine()
        if (input != null) {
            try {
                val split = input.trim().split(" ")
                if (split.size < 3) {
                    throw IllegalArgumentException("参数个数不对")
                }
                val arg1 = split[0].toDouble()
                val op = split[1]
                val arg2 = split[2].toDouble()
                println("$arg1 + $arg2 = ${Operator(op)(arg1, arg2)}")
            } catch (e: NumberFormatException) {
                e.printStackTrace()
                println("您确定输入的是数字吗？")
            } catch (e: IllegalArgumentException) {
                e.printStackTrace()
                println("您确定输入的是三个参数吗？或者您确定使用空格分隔的吗？")
            } catch (e: UnsupportedOperationException) {
                e.printStackTrace()
                println("不支持的运算符${e.message}")
            } catch (e: Exception) {
                e.printStackTrace()
                println("未知异常")
            }

            println("再来一次？[Y]")
            val cmd = readLine()
            if (cmd == null || "y" != cmd.toLowerCase()) {
                break
            }
        }
    }
    println("感谢您使用我们的计算器")

}

class Operator(op: String) {
    private val opFun: (l: Double, r: Double) -> Double

    init {
        opFun = when (op) {
            "+" -> { l, r -> l + r }
            "-" -> { l, r -> l - r }
            "*" -> { l, r -> l * r }
            "/" -> { l, r -> l / r }
            "%" -> { l, r -> l % r }
            else -> {
                throw UnsupportedOperationException(op)
            }
        }
    }

    operator fun invoke(l: Double, r: Double): Double {
        return opFun(l, r)
    }
}