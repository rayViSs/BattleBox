class Soldier(
    maxHealth: Int = 100,
    evasion: Int = 15,
    accuracy: Int = 65,
    weapon: AbstractWeapon = Weapons.createPistol()
): AbstractWarrior(
    maxHealth,
    evasion,
    accuracy,
    weapon
) {
    override fun toString(): String {
        return "Soldier"
    }
}