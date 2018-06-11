package helloworld
/**
 * @Description: lamdba表达式的实现
 * @param:
 * @return:
 * @author: 晓风过境
 * @ProjectName:lambda.kt
 * @Date: 2018/6/11
 * @Time:17:12
**/
fun main(args : Array<String>){
    val lambdaSum:(Int,Int)->Int = {a,b->a+b}
    println(lambdaSum(1,2));
    printSum(2,3);
    /**
     * var 与 val的区别
     * var 修饰的是可变变量 是可以读写的 类似java中函数的简单读写 就是常量的定义
     * val 是修饰不可变的变量 是只读的 类似java中被final修饰的变量一样 最后是不可修改的
     * */
}