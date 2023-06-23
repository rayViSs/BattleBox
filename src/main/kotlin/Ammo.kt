enum class Ammo(val damageGun: Int, val criticalHitChance: Int, val criticalDamageRatio: Double) {
    PistolAmmo(damageGun = 23, criticalHitChance = 70, criticalDamageRatio = 3.14),
    RifleAmmo(damageGun = 32, criticalHitChance = 30, criticalDamageRatio = 1.61),
    SniperAmmo(damageGun = 74, criticalHitChance = 10, criticalDamageRatio = 3.57);

    fun getCurrentDamage(): Int { //получение урона
        val currentDamage: Int
        if (criticalHitChance.chance()) {
            currentDamage = (damageGun * criticalDamageRatio).toInt()
            print("критический урон -$currentDamage ")
        } else {
            currentDamage = damageGun
            print("урон -$currentDamage ")
        }
        return currentDamage
    }
}