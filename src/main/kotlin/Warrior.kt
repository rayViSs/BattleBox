interface Warrior {
    var isKilled: Boolean
    val evasion: Int

    fun attack(warrior: Warrior)
    fun getDamage(amountOfDamage: Int)
}