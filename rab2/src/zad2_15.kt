fun main(){
    try {
    println("Введите целое трехзначное число")
    var x = readLine()!!.toInt()
    var a = x/100!!.toInt()
    var c = x%10!!.toInt()
    var b = x% 100/10!!.toInt()
    println(a)
    println(b)
    println(c)
    if (a<b&&b<c)
    {
        println("Организуют упорядоченную последовательность")
    }
    else println("Не организуют")
    }catch (e:Exception) {
        println("Неверный ввод")
    }
}