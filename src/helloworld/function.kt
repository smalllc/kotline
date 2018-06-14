package helloworld

/**
 * @Description: 函数的运用
 * @param:
 * @return:
 * @author: 晓风过境
 * @ProjectName:function.kt
 * @Date: 2018/6/13
 * @Time:16:19
**/
/*打印一个菱形*/
fun main(args: Array<String>) {
    printlnDiamond(7)
}
fun printlnDiamond(number : Int ){
    val total:Int =(number/2)+1 //首列行数
    for (row in 1..number ){
       var  count:Int=total+(row-1); //定义每行需要的列数
        if(row>total){
            count=count-(2*(row-total))
        }
        var columSpace=Math.abs(row - total);//每行需要的空格
        for ( column in 0..count ){
            if(column<columSpace){
                print(" ")
            }else{
                print("*")
            }
        }
            println()//换行计算
    }
}