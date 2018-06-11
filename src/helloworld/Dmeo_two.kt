package helloworld//包声明
import java.util.*;
import kotlin.collections.ArrayList

/**
 * @Description: Kotlin的基本语法
 * @param:
 * @return:
 * @author: 晓风过境
 * @ProjectName:Dmeo_two.kt
 * @Date: 2018/6/11
 * @Time:15:41
**/
/*
  这是常用的包
* kotlin.*
*kotlin.annotation.*
*kotlin.collections.*
*kotlin.comparisons.*
*kotlin.io.*
*kotlin.ranges.*
*kotlin.sequences.*
*kotlin.text.*
* */
fun test(){}
class Demo_two{

}
//函数的定义  //与golang相对比  a String == a : String
//fun  sum(a:Int,b:Int) : Int {
//    return a+b;
//}
//第二种定义形式
//fun sum(a:Int,b:Int) = a+b;
//第三种定义的这种形式
public fun sum(a: Int, b: Int) : Int = a + b   // public 方法则必须明确写出返回类型
//无参数返回形式
fun printSum(a: Int, b: Int): Unit {
    print(a + b)
}
// 如果是返回 Unit类型，则可以省略(对于public方法也是这样)：
//public fun printSum(a: Int, b: Int) {
//    print(a + b)
//}

//可变长参数 vararg 关键字
public fun vars(vararg values: Int){
    for (value in values){//这是一种类似于foreach的写法但是比foreach要更快
        println(value);
    }
}
fun main(args: Array<String>) {
    print(sum(4,87));
    printSum(78,454);
    vars(1,2,3,4,5,78,45,64,6,12,3,78);
}
