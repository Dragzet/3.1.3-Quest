package Buisness

import MainPhase
import Character

class NeftPhase(val character: Character): MainPhase() {

    fun main(){
        var isHelp = false
        newPhasePrint(4)
        statisticPrint(character)
        separatorPrint()
        Thread.sleep(500)

        println("Ваш первый день. Ого! Ваши заправки пользуются огромным спросом. У вас есть шанс заполучить огромную базу клиентов, но для этого необходимо увеличить объемы производства. К сожалению, у вас совсем не осталось денег, возьмете ли вы очередной кредит?")

        choicesPrint("1. Конечно возьму! Я выплачу его на следующий день!" +
                "\n2. Кредит - зло. Лучше повременю с этим.")

        var choice = readLine()?.toIntOrNull() ?: 0
        Thread.sleep(500)

        if (choice == 1){
            println("Банк поздравляет вас с очередным кредитом. Вы увеличили объем перерабатываемой нефти, клиенты довольны. Дела идут в гору!")
            negativePrint("Activs: -1000")
            positivePrint("Reputation: +20")
            character.activs -= 1000
            character.reputation += 20
        }else{
            println("Бензин на ваших заправках быстро закончился, многие клиенты разочарованы. Вы смогли сохранить выручку, но потеряли много клиентов.")
            negativePrint("Reputation: -30")
            positivePrint("Activs: +100")
            character.reputation -= 30
            character.activs += 100
        }
        separatorPrint()
        Thread.sleep(500)

        println("Ваша компания показывает достаточно хорошую статистику. Вам предлагает сотрудничество более мелкая компания (Ваш конкурент). Согласитесь ли вы?")
        choicesPrint("1. Думаю, стоит объединиться с моим конкурентом." +
                "\n2. Ни к чему мне союзники, я сам справлюсь!")

        choice = readLine()?.toIntOrNull() ?: 0
        Thread.sleep(500)

        if (choice == 1){
            isHelp = true
            println("Поздравляем! У вас появился надежный союзник, который поможет вам в ваших начинаниях.")
            positivePrint("Reputation: +10")
            character.reputation += 10
        }else{
            println("Услышав грубый отказ, представитель компании ушел. Кажется, у вас появился противник.")
        }
        separatorPrint()
        Thread.sleep(500)

        if (isHelp){
            println("Вот и закончился ваш первый день. Но вот незадача, акции вашей компании резко обрушились, из-за перехода на электротранспорт. Ваш бизнес больше никому не нужен.")
            negativePrint("Activs: -100")
            negativePrint("Reputation: -10")
            separatorPrint()
            Thread.sleep(500)
            character.reputation -= 10
            character.activs -= 100
            if (character.activs <= 0){
                negativePrint("Вы залезли в большие долги, которые никогда не сможете покрыть. Видимо, бизнес - не ваше.")
            }else{
                positivePrint("Вы продали свой бизнес за копейки, потеряв на нем почти все. Но вас устроил к знакому представитель той компании, благодаря чему вы ведете вполне обычную жизнь.")
            }
        }else{
            println("В первый день вы знатно заработались и возвращаетесь домой поздно ночью. Вот незадача! Около вашего дома вас поджидали киллеры, кажется, они были посланы той компанией...")
            separatorPrint()
            negativePrint("Вы умираете, не дожив и до 20")
        }
        separatorPrint()
        statisticPrint(character)



    }

}