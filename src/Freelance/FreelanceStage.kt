package Freelance

import MainPhase
import Character

class FreelanceStage(val character: Character) : MainPhase() {

    fun main(){
        newPhasePrint(4)
        statisticPrint(character)
        separatorPrint()

        println("Ваш первый день на фрилансе. Клиентов нет, вы вынуждены подрабатывать дворником. (для продолжения введите что-либо)")
        val need = readLine()
        for (i in 2..365){
            negativePrint("День $i. Клиентов нет.")
            Thread.sleep(30)
        }
        negativePrint("Спустя год клиентов нет, зато вас повысили до старшего дворника.")
        negativePrint("Career: 1")
        negativePrint("Activs: 10")
        negativePrint("Reputation: 10")
        character.career = 1
        character.activs = 10
        character.reputation = 10
        Thread.sleep(1000)
        separatorPrint()
        statisticPrint(character)
    }

}