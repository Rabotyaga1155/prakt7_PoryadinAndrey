fun main(){
    try {
        println("Введите сторону треугольника a")
        var a = readLine()!!.toDouble()
        println("Введите сторону треугольника b")
        var b = readLine()!!.toDouble()
        println("Введите сторону треугольника c")
        var c = readLine()!!.toDouble()
        var p = (a + b + c) / 2!!.toDouble()
        println("p = $p")
        var h = 2 / a * Math.sqrt(p * (p - a) * (p - b) * (p - c).toDouble())
        println(String.format("Высота - %.2f", h))
        var m = Math.sqrt(2 * b * b + 2 * c * c - a * a) * 0.5
        println(String.format("Медиана - %.2f", m))
        var bs = 2 * Math.sqrt(b * c * p * (p - a)) / (b + c).toDouble()
        println(String.format("Биссектриса - %.2f", bs))
    }catch (e:Exception){
        println("Неверный ввод")}
}