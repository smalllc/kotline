package helloworld
/**
 * @Description: TODO
 * @param:
 * @return:
 * @author: 晓风过境
 * @ProjectName:range.kt
 * @Date: 2018/6/11
 * @Time:19:39
**/
fun main(args: Array<String>) {
    var i:Int =44;
    for (i in 1..4) print(i) // 输出“1234”
    println("------------------------------老子是分隔线---------------------------------------")
    for (i in 4..1) print(i) // 什么都不输出
    println("------------------------------老子是分隔线---------------------------------------")
    //override fun contains(value: Int): Boolean = first <= value && value <= last
    if (i in 1..10) { // 等同于 1 <= i && i <= 10
        print(i)
    }
    println("------------------------------老子是分隔线---------------------------------------")
// 使用 step 指定步长
    for (i in 1..4 step 2) print(i) // 输出“13”
    println("------------------------------老子是分隔线---------------------------------------")
    for (i in 4 downTo 1 step 2) print(i) // 输出“42”
    println("------------------------------老子是分隔线---------------------------------------")
// 使用 until 函数排除结束元素
    for (i in 1 until 10) {   // i in [1, 10) 排除了 10
        print(i)
    }
    println("------------------------------老子是分隔线---------------------------------------")
    var byte:Byte=1;
    var g:Int=byte.toInt();//这里会抛出一个错误 说的就是类型不匹配 所以我会采用toInt()的函数




}