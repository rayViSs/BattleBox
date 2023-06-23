class Battle(teamSize: Int, private val teamName1: String, private val teamName2: String) {
    private val team1 = Team(teamName1, teamSize)
    private val team2 = Team(teamName2, teamSize)
    private var battleIsOver: Boolean = false

    fun getState(): BattleState {   //Состояние битвы
        return if (team1.allWarriors.size == 0 && team2.allWarriors.size == 0) {
            BattleState.Draw
        } else if (team1.allWarriors.size == 0) {
            BattleState.SecondTeamWin
        } else if (team2.allWarriors.size == 0) {
            BattleState.FirstTeamWin
        } else {
            BattleState.Progress
        }
    }

    private fun getInfoAlive() {
        println("Осталось живых бойцов: $teamName1 - (${team1.allWarriors.size}) | $teamName2 - (${team2.allWarriors.size})\n")
    }

    fun iterationBattle() {
        while (!battleIsOver) {
            val warriorTeam1 = team1.allWarriors.random()
            val warriorTeam2 = team2.allWarriors.random()
            println("$teamName1 | ($warriorTeam1)")
            warriorTeam1.attack(warriorTeam2)
            if (warriorTeam2.isKilled) {
                team2.allWarriors.remove(warriorTeam2)
                print("xXx $warriorTeam2 убит\n")
            }
            println("$teamName2 | ($warriorTeam2)")
            warriorTeam2.attack(warriorTeam1)
            if (warriorTeam1.isKilled) {
                team1.allWarriors.remove(warriorTeam1)
                print("xXx $warriorTeam1 убит\n")
            }
            if (team1.allWarriors.isEmpty() || team2.allWarriors.isEmpty())
                battleIsOver = true
            println(">Раунд окончен")
            getState()
            getInfoAlive()
        }
    }
}