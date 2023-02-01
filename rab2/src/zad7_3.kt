fun main(){
    try {
        println("Введите число a")
        var a = readLine()!!.toDouble()
        println("Введите число b")
        var b = readLine()!!.toDouble()
        println("Введите число c")
        var c = readLine()!!.toDouble()
        println("Введите число d")
        var d = readLine()!!.toDouble()
        println("Введите число n")
        var n = readLine()!!.toDouble()
        var otv = 0.25 * (a - b) / 0.125 - (Math.abs(b) / Math.pow(10.00, n + 3) + Math.log10(b) / c - d).toDouble()
        println(String.format("Ответ - %.3f", otv))
    }catch (e:Exception){
        println("Неверный ввод")
    }
}