package Buisness

import MainPhase
import Character

class OZONPhase(val character: Character): MainPhase() {

    fun main(){
        newPhasePrint(4)
        statisticPrint(character)
        separatorPrint()
        Thread.sleep(500)

        println("Ваш первый день. Клиентов нет. Кажется, открыть ПВЗ в Мухосранске была не лучшей идеей..")
        Thread.sleep(5000)
        for (i in 2..50){
            println("День $i. Клиентов нет.")
            Thread.sleep(100)
        }

        println("Вы решаете закрыть все пункты. Выкупать их никто не хочет. Кажется, вы просто потеряли деньги.")
        negativePrint("Activs: -200")
        character.activs -= 200
        Thread.sleep(1500)
        negativePrint("Вы решили пойти в копропативное русло и забыть про любой бизнес.")
        separatorPrint()
        statisticPrint(character)


    }

}