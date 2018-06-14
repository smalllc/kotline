package two

import helloworld.C

/** 这是静态的扩展函数
 * @Description: TODO
 * @param:   
 * @return:  
 * @author: 晓风过境
 * @ProjectName:static_interface.kt
 * @Date: 2018/6/14 
 * @Time:17:20
**/
//
//open class C
//
//class D: C()
//
//fun C.foo() = "c"   // 扩展函数 foo
//
//fun D.foo() = "d"   // 扩展函数 foo
//
//fun printFoo(c: C) {
//    println(c.foo())  // 类型是 C 类
//}
//class C {
//    fun foo() { println("成员函数") }
//}
//
//fun C.foo() { println("扩展函数") }
//

fun Any?.toString(): String {
    if (this == null) return "null"
    // 空检测之后，“this”会自动转换为非空类型，所以下面的 toString()
    // 解析为 Any 类的成员函数
    return toString()
}

fun main(arg:Array<String>){
//    printFoo(D())
    var c = C()
    c.foo()

    var t = null
    println(t.toString())

}
