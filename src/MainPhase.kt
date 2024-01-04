open class MainPhase {

    val red = "\u001b[31m"
    val colorReset = "\u001b[0m"
    val green = "\u001B[32m"
    val white = "\u001B[97m"
    val yellow = "\u001B[93m"

    fun choicesPrint(forPrint: String){
        println(white + forPrint + colorReset)
    }

    fun positivePrint(forPrint: String){
        println(green + forPrint + colorReset)
    }

    fun negativePrint(forPrint: String){
        println(red + forPrint + colorReset)
    }

    fun newPhasePrint(stage: Int){
        println("=" .repeat(20) + "Этап: $stage" + "=".repeat(20))
    }

    fun separatorPrint(){
        println("=".repeat(47))
    }

    fun statisticPrint(character: Character){
        println("${character.name}, Твоя статистика: " + yellow +
                "\nРепутация: ${character.reputation}" +
                "\nАктивы: ${character.activs}" +
                "\nКарьера: ${character.career}" + colorReset)
    }

}