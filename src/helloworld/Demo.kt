package helloworld
/**
 * @Description: TODO
 * @param:
 * @return:
 * @author: 晓风过境
 * @ProjectName:Demo.kt
 * @Date: 2018/6/11
 * @Time:15:17
 **/
//this is one Demo
/**
 * 为什么要使用kotlin
 * 简洁: 大大减少样板代码的数量。
 * 安全: 避免空指针异常等整个类的错误。
 * 互操作性: 充分利用 JVM、Android 和浏览器的现有库。
 * 工具友好: 可用任何 Java IDE 或者使用命令行构建。
 */

//面向对象的操作
class get(val name:String){
    fun getter(vname: String){
        println("the name is $name"+vname)
    }
}
fun main(agrs:Array<String>){
     get("smallcc").getter("smallchuan");

}