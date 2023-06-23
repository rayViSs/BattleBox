sealed class FireType {
    object Single : FireType() {}

    data class Burst(val amountBullets: Int) : FireType() {}
}
