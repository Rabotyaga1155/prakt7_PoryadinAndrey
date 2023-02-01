fun main(){
    try {
        println("Введите первое целое число")
        var one = readLine()!!.toInt()
        println("Введите первое целое число")
        var two = readLine()!!.toInt()
        if (one % 2 == 0 && two % 2 == 0) {
            println("Оба четные")
        } else if (one % 2 != 0 && two % 2 != 0) {
            println("Оба нечетные")
        } else if (one % 2 == 0 && two % 2 != 0) {
            println("Одно четное а другое нет")
        } else if (one % 2 != 0 && two % 2 == 0) {
            println("Одно четное а другое нет")
        }
    }catch (e:Exception){
        println("Неверный ввод")}

    }


