import Corporation.AmazonStage
import Freelance.FreelanceStage
import Corporation.YandexStage
import Buisness.NeftPhase
import Buisness.OZONPhase
import Buisness.ShoesPhase

class Game {

    val character: Character = Character("David", 1, 50, 100)

    fun main(){

        val branchNumber = FirstPhase(character).main()
        Thread.sleep(500)
        if (branchNumber == 0) return

        SecondPhase(character).main()
        Thread.sleep(500)
        when (branchNumber){
            1 -> {
                val corporationChoice = Corporation.ThirdPhase(character).main()
                Thread.sleep(500)
                when (corporationChoice){
                    1 -> AmazonStage(character).main()
                    2 -> YandexStage(character).main()
                }
            }

            2 -> {
                val buisnessChoice = Buisness.ThirdPhase(character).main()
                when (buisnessChoice){
                    1 -> {NeftPhase(character).main()}
                    2 -> {ShoesPhase(character).main()}
                    3 -> {OZONPhase(character).main()}
                }
            }
            3 -> {
                FreelanceStage(character).main()
            }
        }




    }

}