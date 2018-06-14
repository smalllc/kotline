package helloworld

/** 接口的扩展学习
 * @Description:
 * @param:
 * @return:
 * @author: 晓风过境
 * @ProjectName:extend_interface.kt
 * @Date: 2018/6/14
 * @Time:17:05
**/
class User(var name:String)
/**扩展函数**/
/**
 * User 代表扩展传入的类型
 * Print是方法的名称
 *(params) params
 * */
fun User.Print(address:String){
    print("用户名 $name")
}


// 扩展函数 swap,调换不同位置的值
fun MutableList<Int>.swap(index1: Int, index2: Int) {
    val tmp = this[index1]     //  this 对应该列表
    this[index1] = this[index2]
    this[index2] = tmp
}

fun main(args: Array<String>) {

    val l = mutableListOf(1, 2, 3)
    // 位置 0 和 2 的值做了互换
    l.swap(0, 2) // 'swap()' 函数内的 'this' 将指向 'l' 的值

    println(l.toString())

    var user = User("testName")
    user.Print("beijing")
}