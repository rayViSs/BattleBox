import kotlin.random.Random

fun main() {
    val battle = Battle(5, "Красные", "Синие")
    while (battle.getState() is BattleState.Progress)
        battle.iterationBattle()

}

fun Int.chance(): Boolean {  //   1. Функция-расширение для типа Int.
    val randomInt = Random.nextInt(1, 101)
    return randomInt <= this
}