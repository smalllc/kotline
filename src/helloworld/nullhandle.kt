package helloworld

import java.lang.Integer.parseInt

/**
 * @Description: 空值处理
 * @param:
 * @return:
 * @author: 晓风过境
 * @ProjectName:nullhandle.kt
 * @Date: 2018/6/11
 * @Time:17:42
**/
fun main(args: Array<String>) {

//类型后面加?表示可为空
    var age: String? = "23"
//抛出空指针异常
    val ages = age!!.toInt()
//不做处理返回 null
    val ages1 = age?.toInt()
//age为空返回-1
    val ages2 = age?.toInt() ?: -1
    println(age+"\n"+ages+"\n"+ages1+"\n"+ages2);
    var x:Int= parseInt(args[0])
    var y:Int=45;
    // 直接使用 `x * y` 会导致错误, 因为它们可能为 null.
    if (x != null && y != null) {
        // 在进行过 null 值检查之后, x 和 y 的类型会被自动转换为非 null 变量
        print(x * y)
    }

}
fun gg() : Int? {
    return null;
}
