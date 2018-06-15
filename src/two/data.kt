package two

import java.sql.Timestamp
import java.util.*

/** 数据类和封装类
 * @Description: TODO
 * @param:
 * @return:
 * @author: 晓风过境
 * @ProjectName:data.kt
 * @Date: 2018/6/14
 * @Time:17:37
**/
data class testClass(var data:String,var date:Date,var timestamp: Number)

fun main(args: Array<String>) {
    var demo=testClass("时间",Date(),System.currentTimeMillis())
    println(demo.toString())

}

//密封类
sealed class Expr
data class Const(val number: Double) : Expr()
data class Sum(val e1: Expr, val e2: Expr) : Expr()
object NotANumber : Expr()

fun eval(expr: Expr): Double = when (expr) {
    is Const -> expr.number
    is Sum -> eval(expr.e1) + eval(expr.e2)
    NotANumber -> Double.NaN
}