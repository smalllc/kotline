package helloworld

import java.util.*



//定义类
public class Runoob{
    var name:String="我是大圣" //这个是属性的定义
    var age:Int =20
    var currentTime= Date();
    //定义给一个函数
    fun get() :String{
        println(this.currentTime)
        println(this.currentTime::class)
        return this.name
    }

}
//构造器
//public class Person constructor(name : String){//这里面的参数是一个私有没法直接到方法里面
//        var test:String="老子"
//        var gg=name
//        fun test():String{
//            return this.test+gg;
//        }
//
//}
//定义一个空类
class Empty constructor(name:String){
    init{
        println("FirstName is $name")
    }
} //空类什么都可以不加


fun main(args: Array<String>) {
    val list=ArrayList<String>() // Kotlin 中没有 new 关键字
    list.add("smallcc")
    list.add("smallchuan")

    println(list)
    var rb=Runoob() //在内存中划分出一个空间出来
    println(rb.currentTime)

    println(Runoob().get())//匿名类

//    println(Person("悟空").test())
    Empty("雷打不动") //匿名使用
}