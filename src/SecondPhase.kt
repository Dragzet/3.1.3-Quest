class SecondPhase(val character: Character) : MainPhase() {


    fun main(){

        newPhasePrint(2)
        println("Давай определимся с твоим именем, как тебя зовут?")

        val name = readlnOrNull() ?: "David"
        character.name = name

        separatorPrint()

        statisticPrint(character)
    }

}