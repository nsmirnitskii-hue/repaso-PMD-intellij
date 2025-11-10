/*● Pide números enteros hasta conseguir 20 números positivos (>0) y únicos (no debehaber duplicados).
● Separe los primos de los compuestos (no primos) en dos arrays.
● Cuente cuántos son primos y cuántos compuestos.
● Muestre por pantalla los primos en orden descendente e indique cuántos son.
● Muestre por pantalla los compuestos en orden ascendente e indique cuántos son.*/
fun main() {
     var numeros: String = ""
    var listaPrimos = mutableListOf<Int>()
    var listaNoPrimos = mutableListOf<Int>()
    while (true) {
        try {
            println("Introduce 20 numeros, enteros")
            for (i in 0..19){
                numeros = readln()
                if(esPrimo(numeros.toInt())){
                    listaPrimos.add(numeros.toInt())
                }else{
                    listaNoPrimos.add(numeros.toInt())
                }
            }
            println("Numeros Primos: ${listaPrimos.sortedDescending()}, total de numeros: ${listaPrimos.size}\n " +
                    "Numeros No Primos: ${listaNoPrimos.sorted()}, total numeros: ${listaNoPrimos.size}")
        }catch (e: Exception){
            println("puedes meter solo numeros")
        }
        break
    }

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