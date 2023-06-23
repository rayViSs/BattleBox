sealed class BattleState {

    object Progress : BattleState() {
        init {
            println("progress")
            println("__________________________")
        }
    }

    object FirstTeamWin : BattleState() {
        init {
            println("__________________________")
            println("FirstTeamWin")
        }
    }

    object SecondTeamWin : BattleState() {
        init {
            println("__________________________")
            println("SecondTeamWin")
        }
    }

    object Draw : BattleState() {
        init {
            println("__________________________")
            println("Draw")
        }
    }

}