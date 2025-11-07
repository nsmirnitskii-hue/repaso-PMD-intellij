fun main() {

}

fun esPrimo(numero: Int): Boolean {
    if (numero <= 1) return false
    if (numero == 2) return true
    if (numero % 2 == 0) return false

    for (i in 3..Math.sqrt(numero.toDouble()).toInt() step 2) {
        if (numero % i == 0) return false
    }

    return true
}