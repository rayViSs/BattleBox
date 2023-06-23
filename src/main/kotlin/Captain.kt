class Captain(
    maxHealth: Int = 135,
    evasion: Int = 30,
    accuracy: Int = 80,
    weapon: AbstractWeapon = Weapons.createAk47()
): AbstractWarrior(
    maxHealth,
    evasion,
    accuracy,
    weapon
) {
    override fun toString(): String {
        return "Captain"
    }
}