package helloworld
/**
 * @Description: 循环
 * @param:
 * @return:
 * @author: 晓风过境
 * @ProjectName:loop.kt
 * @Date: 2018/6/12
 * @Time:16:26
**/
fun main(args:Array<String>){
/***
 * 新一代的循环写法
 ***/
   //先创建一个数值出来
//    var array=Array(10,{i->(i*2)});
//    for (t in array)
//        print(" "+t);
//    println("over")
    //通过索引遍历一个数组或者一个 list，
//    for (i in array.indices){
//        print(" "+i); //这个获取到的是一个下表
//    }
    var array=Array(4,{i->("老"+(i+1))})//工厂创建数组
    for ((index,value) in array.withIndex()){
        println(value+"+"+index);
    }
    //对于集合的迭代
    var list = mutableListOf<String>();
    list.add("老子是大")
    list.add("老子是二")
    list.add("老子是三")
    list.add("老子是四")
//    //可以对元素进行迭代 这是用区间的方式
//    for (element in list ){
//        println(element)
//    }
    println(list)
    //也可以通过标的形式开始进行遍历
    for (index in list.indices){
        println("下标是$index 的元素是${list[index]}")
    }
    println("----------------------老子是分隔线--------------------------------")

    println("----while 使用-----")
    var x = 5
    while (x > 0) {
        println( x--)
    }
    println("----do...while 使用-----")
    var y = 5
    do {
        println(y--)
    } while(y>0)

}