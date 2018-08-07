package com.qiang.example.chapter05

data class Person(val name:String, val age:Int){
    fun work(){
        println("$name is working!!")
    }
}
fun main(args: Array<String>) {
    findPerson()?.let {
        println(it.name)
        println(it.age)
    }

    // apply里面调用成员相当于在Person里面
    findPerson()?.apply {
        println(name)
        println(age)
    }

    // with和apply的区别在于，apply是扩展方法，with是包级函数，一个是receiver作为调用者，一个是作为参数
    with(findPerson()){
        println(this!!.name)
    }
}

fun findPerson():Person?{
    return null
}