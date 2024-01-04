package Corporation

import Character
import MainPhase

class YandexStage(val character: Character): MainPhase() {

    fun main(){
        var isHelp = false
        newPhasePrint(4)
        statisticPrint(character)
        separatorPrint()

        println("Ваш первый день. Вы встаете заранее, собираетесь и садитесь в машину. У вас еще полно времени до начала рабочего дня. К вам подходит мужчина и просит довезти его. Его пункт назначения находится в другом коцне города. Что вы сделаете?")
        choicesPrint("1. Подвезу мужика, не оставлять же его (100% опоздание на работу)" +
                "\n2. Отказать (работа важнее)")
        Thread.sleep(500)

        var choice = readLine()?.toInt()
        if (choice == 1){
            isHelp = true
            println("Из-за мужчины вы опоздали на работу и получили выговор.")
            negativePrint("Reputation: -10")
        }else{
            println("Вы успешно начали свой рабочий день")
        }
        separatorPrint()
        Thread.sleep(500)

        println("Работая над своим проектом, вы увидели того мужчину. Оказывается, он является директором Яндекса.")
        Thread.sleep(500)
        if (isHelp){
            println("Увидев вас, он сразу благодарит вас за вашу доброту. Директор предлагает 80% компании, вы конечно же соглашаетесь!")
            positivePrint("Activs: +1000")
            character.activs += 1000
            character.career += 1000
            Thread.sleep(500)
            positivePrint("Вы стали самым перспективным человеком до 20 лет по мнению Forbes. Вы живете на дивиденты и у вас все отлично!")
            separatorPrint()
            statisticPrint(character)
        }else{
            println("Увидев вас, он сразу же уволняет вас (да, он так может).")
            negativePrint("Career: 0")
            character.career = 0
            Thread.sleep(500)
            negativePrint("Так глупо упустив ваш шанс, вы загоняетесь в себе и больше не собираетесь работать. Вы становитесь безработным и скитаетесь по мусоркам.")
            character.activs = 0
            character.reputation = 0
            separatorPrint()
            statisticPrint(character)
        }
}


}