class Team(private val name: String, private val countWarriors: Int) {
    var allWarriors = mutableListOf<AbstractWarrior>()

    init {
        for (i in 1..countWarriors) {
            if (10.chance()) allWarriors.add(General())
            else if (40.chance()) allWarriors.add(Captain())
            else allWarriors.add(Soldier())
        }
    }

}