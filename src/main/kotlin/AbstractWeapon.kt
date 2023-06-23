abstract class AbstractWeapon(
    val maxAmmo: Int,                            //Максимальное количество патронов в магазине.
    var fireType: FireType,                      //Вид стрельбы (FireType).
    private var magazinAmmo: Stack<Ammo> = Stack(),      //Магазин патронов.
    var magazinIsEmpty: Boolean = true,          //Факт наличия патронов в магазине.
) {

    open fun isEmptyMagazin(): Boolean {
        magazinIsEmpty = magazinAmmo.isEmpty()
        return magazinIsEmpty
    }

    abstract fun createAmmo(): Ammo         //создание патрона необходимого типа;

    open fun reload(): Stack<Ammo> {             //перезарядка — создаётся новый магазин и заполняется патронами с помощью функции создания патрона;
        for (i in magazinAmmo.stack.size until maxAmmo) {
            magazinAmmo.push(createAmmo())
        }
        magazinIsEmpty = false
        return magazinAmmo
    }

    open fun getAmmo(): Stack<Ammo> {            //получение патронов для выстрела
        val bullets: Stack<Ammo> = Stack()
        when (fireType) {
            is FireType.Single -> {
                if (!isEmptyMagazin())
                    magazinAmmo.pop()?.let { bullets.push(it) }
            }

            is FireType.Burst -> {
                if (magazinAmmo.stack.size >= (fireType as FireType.Burst).amountBullets)
                    for (i in 1..(fireType as FireType.Burst).amountBullets)
                        magazinAmmo.pop()?.let { bullets.push(it) }
                else
                    for (i in 1..magazinAmmo.stack.size)
                        magazinAmmo.pop()?.let { bullets.push(it) }
            }
        }
        isEmptyMagazin()
        return bullets
    }
}

