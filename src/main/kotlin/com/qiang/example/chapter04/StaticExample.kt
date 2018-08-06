package com.qiang.example.chapter04

class Utils private constructor() {
    /**
     * 伴生对象的成员类似java的静态成员
     * 静态成员优先考虑包级函数、变量替代
     */
    companion object {
        /**
         * 使用JvmStatic是为了java里面调用该方法时就不用Utils.companion.checkString(...)了，直接和kotlin一样调用
         */
        @JvmStatic
        fun checkString(str: String?): String {
            return str ?: ""
        }

        // 使用const修饰，相当于static final，因此不用再加@JvmFiled修饰了
        const val TAG: String = "tag"
    }
}

fun main(args: Array<String>) {
    println(Utils.checkString(null))
    println(Utils.TAG)
}