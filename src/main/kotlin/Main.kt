fun main(args: Array<String>) {


    fun changeDoor(exper: Int) {
        var changeAndWin = 0
        var skipAndWin = 0

        for (i in 1..exper) {

            val monty = Monty()

            println(monty.listOfGifts)
            val choosenDoor = monty.chooseDoor()
            println("Выбор: $choosenDoor - ${monty.listOfGifts[choosenDoor]}")
            val openedDoor = monty.openDoor(choosenDoor)
            println("Открываем дверь: $openedDoor")

            if (i % 2 == 0) {
                if (monty.listOfGifts[choosenDoor] == "Автомобиль") {
                    skipAndWin ++
                    println("Оставил и выиграл\n")
                } else {
                    println("Оставил и проиграл\n")
                }
            } else {
                monty.listOfGifts.removeAt(choosenDoor)
                if (monty.listOfGifts.contains("Автомобиль")) {
                    println("Поменял и выиграл\n")
                    changeAndWin ++
                } else {
                    println("Поменял и проиграл\n")
                }
            }
        }
        println("_________________________________________________________________")
        println("Оставил и выиграл: $skipAndWin")
        println("Поменял и выиграл: $changeAndWin")
        println("Всего раз: $exper\n")
        println("В процентах")
        println("Оставил и выиграл: ${skipAndWin.toDouble() / exper * 100}%")
        println("Поменял и выиграл: ${changeAndWin.toDouble() / exper * 100}%")
    }

    changeDoor(100)
}