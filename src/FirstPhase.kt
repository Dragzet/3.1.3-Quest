class FirstPhase(val character: Character) : MainPhase() {

    fun main(): Int{
        newPhasePrint(1)
        println("Выберите ветвь развития:")

        choicesPrint("1. Корпоративный путь" +
                "\n2. Свой бизнес" +
                "\n3. Фриланс")


        val choice = readLine()?.toIntOrNull() ?: 0

        when (choice){
            1 -> {
                println("Поздравляю! Вы выбрали стабильный заработок и стали настоящим трудягой!")
                character.career = 2
                return 1
            }

            2 -> {
                println("Хммм... Достаточно трудный путь выбрал ты. В ближайшем будущем ты откроешь свой бизнес и утонешь в долгах (или нет, кто его знает)")
                character.activs = 200
                return 2
            }

            3 -> {
                println("Поздравляю! Вы выбрали путь саморазвития и фриланса, все в ваших руках, работайте усердно и заработаете много денег")
                character.reputation = 100
                return 3
            }

            else -> {
                println("Кажется, вы ошиблись в выборе. Завершение игры.")
                separatorPrint()
                return 0
            }
        }
    }

}