object Weapons {
    fun createPistol(): AbstractWeapon {
        return object : AbstractWeapon(
            fireType = FireType.Single,
            maxAmmo = 6,
//                typeAmmo = Ammo.PistolAmmo
        ) {
            override fun createAmmo(): Ammo = Ammo.PistolAmmo
        }
    }

    fun createAk47(): AbstractWeapon {
        return object : AbstractWeapon(
            fireType = FireType.Burst(3),
            maxAmmo = 12,
//                typeAmmo = Ammo.RifleAmmo
        ) {
            override fun createAmmo(): Ammo = Ammo.RifleAmmo
        }
    }

    fun createM4A4(): AbstractWeapon {
        return object : AbstractWeapon(
            fireType = FireType.Burst(3),
            maxAmmo = 15,
//                typeAmmo = Ammo.RifleAmmo
        ) {
            override fun createAmmo(): Ammo = Ammo.RifleAmmo
        }
    }

    fun createAwp(): AbstractWeapon {
        return object : AbstractWeapon(
            fireType = FireType.Single,
            maxAmmo = 5,
//                typeAmmo = Ammo.SniperAmmo
        ) {
            override fun createAmmo(): Ammo = Ammo.SniperAmmo
        }
    }
}