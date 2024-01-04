package Buisness

import MainPhase
import Character

class ShoesPhase(val character: Character) : MainPhase(){

    fun main(){
        var isOP = false
        var isHelp = false
        newPhasePrint(4)
        statisticPrint(character)
        separatorPrint()
        Thread.sleep(500)

        println("Ваш первый день. У вас огромная очередь, покупатели льются рекой (Ваша сеть - единственные обувные магазины в городе). Но с увеличением потока, увеличивается процент краж. Кажется, вы совсем забыли про охранну. Но вам повезло, в данный момент в магазине находится крупный мужчина. Может предложить ему работу охранной?")

        choicesPrint("1. Возьму его охранником и у меня перестанут воровать!" +
                "\n2. Зачем мне охранна, моя прибыль в разы превышает убыток.")

        var choice = readLine()?.toIntOrNull() ?: 0
        Thread.sleep(500)

        if (choice == 1){
            isOP = true
            println("Поздравляем! У вас появлился новый охранник. Процент краж значительно снизился!")
            positivePrint("Activs: +30")
            character.activs += 30
        }else{
            println("Кажется, народ начал что-то промышлять. Процент краж многократно возрос, вы скоро можеет уйти в убытки.")
            negativePrint("Activs: -30")
            character.activs -= 30
        }
        separatorPrint()
        Thread.sleep(500)

        println("В середине рабочего дня к вам приходит пожилая женщина и слезно просит у вас отдать пару обуви для ее дочери бесплатно. Сделаете ли вы 100% скидку?")

        choicesPrint("1. От 1 пары ничего не будет. Конечно сделаю!" +
                "\n2. Я ничего не отдам! Пускай идет работает!!!")

        choice = readLine()?.toIntOrNull() ?: 0
        Thread.sleep(600)

        if (choice == 1){
            println("Получив пару, женщина вас отблагодарила и ушла.")
            negativePrint("Activs: -30")
            positivePrint("Reputation: +10")
            character.activs -= 30
            character.reputation -= 10
            isHelp = true
        }else{
            println("Услышав отказ, девушка закатила истерику. Вам пришлось выставить ее за дверь.")
            positivePrint("Activs: +10")
            negativePrint("Reputation: -10")
            character.activs += 10
            character.reputation -= 10
        }
        separatorPrint()
        Thread.sleep(500)

        if (!isHelp){
            if (isOP){
                println("В конце дня та женщина вернулась и попыталась украсть пару обуви. Увидев это, ваш охранник не рассчитал силы и сломал руку женщины.")
                Thread.sleep(1000)
                println("Муж женщины оказался отличным адвокатом. Всю оставшуюся часть дня вы провели в суде. У вас отсудили всю вашу компанию и обязали выплатить огромный штраф.")
                negativePrint("Activs: -1000")
                character.activs -= 1000
                Thread.sleep(500)
                negativePrint("Всю оставшуюся жизнь вы были вынуждены работать на заводе, чтобы покрыть штраф.")
            }
            else{
                println("В конце дня вы пошли есть в макдональдсе и оставили магазин открытым. Та женщина вернулась, но уже не одна. Она привела с собой всех своих 20 детишек, и они вынесли вес магазин. \n Вы остались без товара.")
                negativePrint("Activs: -1000")
                character.activs -= 1000
                Thread.sleep(500)
                negativePrint("Вы решаете продать свой бизнес. На полученные деньги вы открываете приют для животных, ведь теперь вы поняли как важно оказывать помощь другим.")
                positivePrint("Reputation: +1000")
                character.reputation += 1000
            }
        }else{
            if (isOP){
                println("О вашем поступке написали в газетах. К вам приезжат из соседних городов, чтобы закупиться у вас в живую. Ваш единственный охраник следит за всей вашей сетью и не дает воровать.")
                Thread.sleep(500)
                positivePrint("Вы стали миллионером!")
                positivePrint("Reputation: +1000")
                positivePrint("Activs: +1000")
                positivePrint("Career: +1000")
                character.activs += 1000
                character.career += 1000
                character.reputation += 1000
            }
            else{
                println("С пустя время народ понял, что можно воровать безнаказанно.")
                Thread.sleep(500)
                negativePrint("Вы потерпели большие убытки из-за воровства. Ваш бизнес закрылся.")
                negativePrint("Activs: -1000")
                negativePrint("Career: 0")
                character.activs -=1000
                character.career = 0
            }
        }
        separatorPrint()
        statisticPrint(character)
    }

}