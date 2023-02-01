fun main(){
    try {
    println("Введите количество рекламаций на первый товар")
    var n1 = readLine()!!.toInt()
    println("Введите количество рекламаций на второй товар")
    var n2 = readLine()!!.toInt()
    println("Введите количество рекламаций на третий товар")
    var n3 = readLine()!!.toInt()
    if (n1<5&&n2<5&&n3<5){
        println("Все товары хорошие")
    }
    else{
        println("Есть плохие товары")
    }
    }catch (e:Exception){
        println("Неверный ввод")
    }

}