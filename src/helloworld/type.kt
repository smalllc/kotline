package helloworld

import java.lang.reflect.Type

/**
 * @Description: 类型的检测和转换
 * @param:
 * @return:
 * @author: 晓风过境
 * @ProjectName:type.kt
 * @Date: 2018/6/11
 * @Time:17:58
 **/
/**在kotlin中 is 是判断变量是否是某个变量的实例 类似java中的 instanceof*/
fun getStringlength(obj: Any): String? {//顺便检测不能为空
    if (obj is String) {
        //通过类型判断之后obj的类型会自动的转换成为String
        println(obj::class);//获取当前的对象的类型
        return "" + obj.length;
    }
    return "testLenght";
}

fun main(args: Array<String>) {
    println(getStringlength("你是不知道啊"));
    println(getStringLength(true));
    println(getstringLength("false"));
}

fun getStringLength(obj: Any): Int? {
    if (obj !is String){
        println(obj::class);
        return null;
    }
    // 在这个分支中, `obj` 的类型会被自动转换为 `String`
    return obj.length
}
fun getstringLength(obj: Any): Int? {
    // 在 `&&` 运算符的右侧, `obj` 的类型会被自动转换为 `String`
    if (obj is String && obj.length > 0)
        return obj.length
    return null;
}