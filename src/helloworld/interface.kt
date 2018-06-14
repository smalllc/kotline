package helloworld

/**
 * @Description:kotlin中对于接口的支持
 * @param:
 * @return:
 * @author: 晓风过境
 * @ProjectName:interface.kt
 * @Date: 2018/6/14
 * @Time:16:46
**/
interface Itest{
        var name:String //定义属性
        fun bar()    // 未实现
        fun foo() {  //已实现
            // 可选的方法体
            println("foo")
        }
//        fun gg(name:String)
}
class  iTestImpl :  Itest{
    override var name:String ="testName"//这是对于属性的重写
    //方法体
    override fun bar() {//重写的方法
        println(name)
    }
}

//多方法的重写
interface A {
    fun foo() { print("A") }   // 已实现
    fun bar()                  // 未实现，没有方法体，是抽象的
}

interface B {
    fun foo() { print("B") }   // 已实现
    fun bar() { print("bar") } // 已实现
}

class C : A {
    override fun bar() { print("bar") }   // 重写
}

class D : A, B {
    override fun foo() {
        super<A>.foo()
        super<B>.foo()
    }

    override fun bar() {
        super<B>.bar()
    }
}


fun main(args: Array<String>) {
    //测试
    var iTestImpl=iTestImpl()
    println(iTestImpl.name)
    iTestImpl.bar()
    iTestImpl.foo()
    //多方法的重写
    val d =  D()
    d.foo();
    d.bar();
}