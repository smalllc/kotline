package helloworld
/**
 * @Description: 数组Arrays
 * @author: 晓风过境
 * @ProjectName:array.kt
 * @Date: 2018/6/11
 * @Time:20:07
**/
fun main(args: Array<String>) {
    //第一种数值的创建方式
    var array= arrayOf(1,2,3,4,5);
    for(a in array){
    print(a);
    }
    println()
    //第二种情况
    val b = Array(3, { i -> (i * 2) }) //采用的是工厂模式 // 利用lamdba表达式
    for(v in b){
        print(v);
    }
    println(array.getOrNull(0))//若下标越界就采用一个新的数值返回的空值处理一下
    var stc:String="测试文字";
    for(v in stc){
        println(v)
    }


}
