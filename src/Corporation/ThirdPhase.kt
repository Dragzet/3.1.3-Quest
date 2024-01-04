package Corporation

import Character
import MainPhase

class ThirdPhase(val character: Character) : MainPhase() {

    fun main(): Int{
        newPhasePrint(3)
        println("Кажется, удача сегодня на вашей стороне! Вы прошли предвыборные кампании сразу 3-х компаний! Где вы хотите работать?")
        choicesPrint( "1. Amazon (Мега-компания, луший выбор! Но все ли там так хорошо?...)" +
                "\n2. Yandex (Компания среднего класса. Вас точно начнут уважать, если вы устроитесь здесь.")


        val choice = readLine()?.toIntOrNull() ?: 0

        separatorPrint()
        character.career += 1
        Thread.sleep(500)
        when (choice){
            1 -> {
                println("Поздравляю! С завтрашнего дня вы выходите на свою новую работу в Amazon")
                positivePrint("Career: +1")
                return 1
            }

            2 -> {
                println("Поздравляю! С завтрашнего дня вы выходите на свою новую работву в Yandex. Кажется, вас и вправду начали уважать чуть больше.")
                positivePrint("Career: +1")
                positivePrint("Reputation: +10")
                character.reputation += 10
                return 2
            }

            else -> {
                println("Кажется, вы ошиблись в выборе. Завершение игры.")
                separatorPrint()
                return 0
            }
        }

    }

}