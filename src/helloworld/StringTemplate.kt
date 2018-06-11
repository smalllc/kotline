package helloworld
/**
$ 表示一个变量名或者变量值

$varName 表示变量值

${varName.fun()} 表示变量的方法返回值:

 */

fun ret():Int{
    return 45;
}
fun main(args: Array<String>) {
    var a : String = "1";
    // 模板中的简单名称：
    val s1 = "a is $a"
    a = "小2";
    // 模板中的任意表达式：
    val s2 = "${s1.replace("is", "was")}" +" but now is $a"
    println(s1)
    println(s2)
    println("${ret()}")
}