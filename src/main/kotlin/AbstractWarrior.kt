abstract class AbstractWarrior(
    private val maxHealth: Int,
    override val evasion: Int,
    private val accuracy: Int,
    private val weapon: AbstractWeapon,
    private var currentHealth: Int = maxHealth
) : Warrior {

    override var isKilled: Boolean = false
        get() = currentHealth <= 0

    override fun attack(warrior: Warrior) {
        if (weapon.magazinIsEmpty) {
            println("Магазин пуст..Перезарядка")
            weapon.reload()
        } else {
            print("Стрельба: ")
            weapon.getAmmo().stack.forEach {
                if (accuracy.chance()) {
                    if (warrior.evasion.chance()) {
                        print("Противник уклонился ")
                    } else {
                        val damage = it.getCurrentDamage()
                        warrior.getDamage(damage)
                    }
                } else {
                    print("Промах ")
                }
            }
            println()
        }
    }

    override fun getDamage(amountOfDamage: Int) {
        currentHealth -= amountOfDamage
        isKilled = currentHealth <= 0
    }

}