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
}
