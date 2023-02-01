fun main(){
    try {


    var sum = 0
    println("Введите первое число прогрессии")
var k = readLine()!!.toDouble()
    println("Введите знаменатель")
    var p = readLine()!!.toDouble()
    println("Введите первое число прогрессии")
var one = readLine()!!.toDouble()
    println("Введите номер второго элемента")
var two = readLine()!!.toDouble()
    var s = one+two
    var a:Double
    if (one<two)
    {
    for(q in one.toInt()..two.toInt())
    {
if (q==1)
{
    a=k
    sum = (sum + a).toInt()
}
        if (q>1){
            a=k*Math.pow(p,(q-1).toDouble())
            sum = (sum+a).toInt()
        }
    }
println(sum)}
    else print("Номер 1 должен быть меньше номера 2")
    }catch (e:Exception){
        println("Неверный ввод")
    }
}
