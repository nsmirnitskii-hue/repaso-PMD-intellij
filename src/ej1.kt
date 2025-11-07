//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    var num: String = ""
    var listaEnteros = mutableListOf<Int>()
    var listaNegativos = mutableListOf<Int>()
    var listaCero = mutableListOf<Int>()
    var pregunta: String = ""

    while (true) {
        println("Introduce un numero: ")
        num = readln()
        if (num.isNotEmpty()) {
            try {
                val numEntero = num.toInt()
                if (numEntero > 0) {
                    listaEnteros.add(numEntero)
                } else if (numEntero < 0) {
                    listaNegativos.add(numEntero)
                } else {
                    listaCero.add(numEntero)
                }
            } catch (e: Exception) {
                println("Caracter no valido")
                println("Lista Enteros: "+listaEnteros.size + " " +listaEnteros )
                println("Lista negativos: "+listaNegativos.size +" "+listaNegativos)
                println("Lista ceros: "+listaCero.size)
                pregunta = preguntarSalida()
                if(pregunta=="no") {break}
            }
        }else{
            println("Introduce un numero")
        }
    }


}
fun preguntarSalida() : String {
    var respuesta = ""
    while (true) {
        println("Deseas contituar introducindo los numeros si/no")
        respuesta = readln()
        if (respuesta == "no" ) {
            return "no"
        }
        if (respuesta=="si") {
            return "si"
        }
    }

}
