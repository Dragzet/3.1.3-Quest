package Corporation

import Character
import MainPhase

class AmazonStage(val character: Character) : MainPhase() {



    fun main(){
        var isHelp: Boolean = false
        newPhasePrint(4)
        statisticPrint(character)
        separatorPrint()

        println("Растяпа! Ваш первый рабочий день, через 20 мин вам надо быть на работе, а вы еще в кровати. Быстро собравшись, вы садитесь в свою машину. К вам подходит бездомный и просит у вас на еду. Что вы ответите?")
        choicesPrint("1. У меня нет денег! Отвали!" +
                "\n2. Конечно, держи на еду.")

        var choice = readLine()?.toInt()
        Thread.sleep(500)
        when (choice){
            1 -> {
                println("Вы успешно добрались до работы. Ваш первый день начнется без опозданий.")

            }

            2 -> {
                negativePrint("Activs: -10")
                println("Вы успешно добрались до работы, но на 20 мин позже. Ваш первый день начинается с выговора.")
                negativePrint("Reputation: -10")
                character.reputation -= 10
                character.activs -= 10
                isHelp = true
            }
        }
        Thread.sleep(500)
        separatorPrint()

        println("Во время перерыва вы случайно подслушали разговор двух директоров и узнали о нелегальном секрете Amazon. Ваши действия?")
        choicesPrint("1. Доложить обо всем в правохранительные органы (Репутация хорошего человека вам обеспечена)" +
                "\n2. Начать шантажировать директоров. (Горы денег вам обеспечены)")

        choice = readLine()?.toInt()
        Thread.sleep(500)
        when (choice){
            1 -> {
                println("После вашей заявки в органы компанию закрыли. О вас напечатали статью в газетах, теперь каждая компания хочет пригласить вас к себе.")
                Thread.sleep(500)
                positivePrint("Reputation: +1000")
                negativePrint("Career: 0")
                character.reputation += 1000
                character.career = 0
            }

            2 -> {
                println("Вы получили достаточно большую сумму денег от директоров. Но вот незадача, помимо вас этот секрет слышала еще половина штата. Органы закрыли компанию и забрали у вас все деньги. О вашем поступке написали в газетах, теперь ни одна компания не хочет связываться с вами.")
                Thread.sleep(500)
                negativePrint("Reputation: 0")
                negativePrint("Activs: 0")
                negativePrint("Career: 0")
                character.career = 0
                character.reputation = 0
                character.activs = 0
            }
        }

        println("Вот и закончился ваш рабочий день. Вы садитесь в свою машину и едете домой. На дворе уже ночь.")
        separatorPrint()
        Thread.sleep(500)
        if (!isHelp){
            println("Подъхав к дому и выйдя из машины, вы становитесь жертвой нападения. Из свидетелей только тот бездомный, но он не хочет помогать вам.")
            negativePrint("Вы погибаете не дожив и до 20")
            separatorPrint()
            statisticPrint(character)
        }
        else{
            println("Подъхав к дому и выйдя из машины, вы становитесь жертвой нападения. Из свидетелей только тот бездомный, он заступается за вас и прогоняет нападавшего.")
            if (character.reputation == 0){
                negativePrint("Вы лишились работы и всех денег. Ни одна компания не хочет брать вас к себе. Вы вынуждены жить с родителями всю жизнь")
                separatorPrint()
                statisticPrint(character)
            }
            else{
                positivePrint("Вы устроились на новую работу и заработали миллионы!")
                character.activs += 1000
                character.career += 1000
                separatorPrint()
                statisticPrint(character)
            }
        }

    }

}