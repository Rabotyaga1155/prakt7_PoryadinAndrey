import kotlin.math.sqrt

fun main(){
    try {
    println("Введите число k1")
    var k1 = readLine()!!.toDouble()
    println("Введите число k2")
    var k2 = readLine()!!.toDouble()
    println("Введите число a")
    var a = readLine()!!.toDouble()
    println("Введите число b")
    var b = readLine()!!.toDouble()
    println("Введите число c")
    var c = readLine()!!.toDouble()


    var d = (b*b)-(4*a*c).toDouble()
    if (d<0)
    {
        println("Дискриминант меньше 0")
    }
    else {
        var x2 = (-b+Math.sqrt(d))/(2*a).toDouble()
        var x1 = (-b-Math.sqrt(d))/(2*a).toDouble()
        println(String.format("x1 - %.3f", x1))
        println(String.format("x2 - %.3f", x2))
        if (k1<x1&&x1<k2&&k1<x1&&x1<k2){
            println("Корни входят в интервал")
        }

    }
    }catch (e:Exception){
        println("Неверный ввод")
    }
}