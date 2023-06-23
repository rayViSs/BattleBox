class General(
    maxHealth: Int = 20,
    evasion: Int = 40,
    accuracy: Int = 85,
    weapon: AbstractWeapon = Weapons.createAwp()
): AbstractWarrior(
    maxHealth,
    evasion,
    accuracy,
    weapon
) {
    override fun toString(): String {
        return "General"
    }
}