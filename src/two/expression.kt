package two

import java.awt.event.MouseAdapter
import java.awt.event.MouseEvent
import javax.swing.JComponent

/**
 * @Description: 对象表达式和伴生对象
 * @param:
 * @return:
 * @author: 晓风过境
 * @ProjectName:expression.kt
 * @Date: 2018/6/15
 * @Time:16:22
**/

open class A(x: Int) {
    public open val y: Int = x
}

interface B {}

val ab: A = object : A(1), B {//通过这个方式我们就可以不要使用对象从新创建对象
    override val y = 15
}
//如果超类型有一个构造函数，则必须传递参数给它。多个超类型和接口可以用逗号分隔。
//
//通过对象表达式可以越过类的定义直接得到一个对象：
fun main(args: Array<String>) {
    val site = object {
        var name: String = "smallcc"
        var url: String = "www.smalllc.top"
    }
    println(site.name)
    println(site.url)
}
//匿名对象可以用作只在本地和私有作用域中声明的类型。如果你使用匿名对象作为公有函数的 返回类型或者用作公有属性的类型，那么该函数或属性的实际类型 会是匿名对象声明的超类型，如果你没有声明任何超类型，就会是 Any。在匿名对象 中添加的成员将无法访问。
class Cla {
    // 私有函数，所以其返回类型是匿名对象类型
    private fun foo() = object {
        val x: String = "x"
    }

    // 公有函数，所以其返回类型是 Any
    fun publicFoo() = object {
        val x: String = "x"
    }

    fun bar() {
        val x1 = foo().x        // 没问题
        //val x2 = publicFoo().x  // 错误：未能解析的引用“x”
    }
}
//在对象表达中可以方便的访问到作用域中的其他变量:
fun countClicks(window: JComponent) {
    var clickCount = 0
    var enterCount = 0

    window.addMouseListener(object : MouseAdapter() {
        override fun mouseClicked(e: MouseEvent) {
            clickCount++
        }

        override fun mouseEntered(e: MouseEvent) {
            enterCount++
        }
    })
    // ……
}