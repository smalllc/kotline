package helloworld

/**
 * @Description: kotlin中的条件控制语句
 * @author: 晓风过境
 * @ProjectName:control.kt
 * @Date: 2018/6/11
 * @Time:20:36
**/
/**
 *
 *  以前写的的条件控制语句
 *
 * */
fun main(args: Array<String>) {
//    var max : Int;
    var a:Int = 115;
    var b:Int = 45;
//    if (a<b){
//        max=a;
//    }else{
//        max=b;
//    }
    //这是新一套的写法
    var max=if( a> b){
        a
    }else{
        b
    }
    println(max);
//    when的写法
//    var x:Int=1325;
//    when(x){
//        1->println("x=1");
//        2->println("x=2");
//        else->{//这块的写法是比较特殊的
//            println("不是一也不是二");
//        }
//    }
//综合实例
    var x = 0
    when (x) {
        0, 1 -> println("x == 0 or x == 1")
        else -> println("otherwise")
    }

    when (x) {
        1 -> println("x == 1")
        2 -> println("x == 2")
        else -> { // 注意这个块
            println("x 不是 1 ，也不是 2")
        }
    }

    when (x) {
        in 0..10 -> println("x 在该区间范围内")
        else -> println("x 不在该区间范围内")
    }

    val items = setOf("apple", "banana", "kiwi")//定义了一个集合
    when {
        "orange" in items -> println("juicy")
        "apple" in items -> println("apple is fine too")
    }
}
