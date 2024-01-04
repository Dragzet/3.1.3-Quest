package Buisness

import Character
import MainPhase

class ThirdPhase(val character: Character) : MainPhase() {

    fun main(): Int {
        newPhasePrint(3)

        println("Вы взяли кредит и определяетесь с бизнесом. В чем именно вы хотите прогореть?")
        choicesPrint(
            "1. Заняться нефтеперерабатываемым бизнесом (Требуется огромный вклад, у вас точно хватит денег?" +
                    "\n2. Открыть сеть магазинов обуви" +
                    "\n3. Открыть несколь ПВЗ OZON (Вкладываться почти не прийдется. На этом точно можно заработать?)"
        )

        val choice = readLine()?.toIntOrNull() ?: 0
        character.reputation += 10
        Thread.sleep(500)

        when (choice){
            1 -> {
                println("Поздравляю! Вы выкупили несколько нефтеперерабатывающих завода и заправок. В вашем кошельке почти не осталось денег.")
                Thread.sleep(500)
                negativePrint("Activs: 10")
                positivePrint("Reputation: +10")
                character.activs = 10
                return 1
            }
            2 -> {
                println("Вы выкупили несколько пунктов на рынке и несколько магазинов. В ближайшее время у вас ожидается поставка из Китая.")
                Thread.sleep(500)
                negativePrint("Activs: -120")
                positivePrint("Reputation: +10")
                character.activs -= 120
                return 2
            }

            3 -> {
                println("Поздравляю! Вы стали счастливым обаладателем 3-х ПВЗ OZON в густонаселенном районе... Вы сильно вложились в помещение, чтобы превзойти конкурентов.")
                Thread.sleep(500)

                negativePrint("Activs: -100")
                positivePrint("Reputation: +10")
                return 3
            }
            else -> return 0
        }
    }


}