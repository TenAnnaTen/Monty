class Monty() {

    var listOfGifts: MutableList<String> = mutableListOf("Коза", "Автомобиль", "Коза")

    init {
        listOfGifts.shuffle()
    }

    fun chooseDoor(): Int{
        return listOfGifts.indexOf(listOfGifts.random())
    }

    fun openDoor(choosenDoor: Int): Int{
        var indexDoor = 0
        for (i in 0..< listOfGifts.size) {
            if (i != choosenDoor && listOfGifts[i] == "Коза"){
                indexDoor = i
                break
            }
        }
        return indexDoor
    }

}