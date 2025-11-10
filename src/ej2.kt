/*Desarrolla un programa de listado de vehículos en Kotlin:
● Pida datos de nuevos vehículos hasta que el usuario indique lo contrario.
● Los vehículos pueden ser de distintos tipos: Coche, Moto, Bicicleta, ... Pero el
programa descartará todos los que no sean tipo Coche o Moto.
● Una vez que se termine la introducción de nuevos vehículos, se visualizarán:
● Las motos listadas de mayor a menor precio y la cantidad de motos.
● Los coches listados alfabéticamente de la A a la Z según su marca y la cantidad de coches.*/
data class Vehiculos(var tipo: String, var marca: String,  var precio: Int )

fun main() {
    var tipo = ""
    var marca= ""
    var precio = 0

    var respuesta: String = ""
    var listamoto = mutableListOf<Vehiculos>()
    var listacoche = mutableListOf<Vehiculos>()

    while(true){
        try {
            println("Introduce el tipo de veiculo ")
            tipo = readln()

            if(tipo == "moto" || tipo=="coche") {
                println("Introduce marca de tu vehiculo")
                marca = readln()
                println("Introduce precio del vehiculo")
                precio = readln().toInt()
                if (tipo == "moto"){
                    listamoto.add(Vehiculos(tipo,marca, precio))
                }else{
                    listacoche.add(Vehiculos(tipo,marca, precio))
                }
                println(listamoto)
            }else{
                println("El tipo de coche no valido, puede ser solo o moto o coche")
                continue
            }

            println("Quere seguir metiemdo los datos del vehiculo?")
            respuesta = readln()
            if(respuesta == "no"){
                imprimirDatosFinal(listamoto, listacoche)
                break
            }
        }catch (e:Exception){
            println("Has añadido algun dato mal")
        }

    }
}

fun imprimirDatosFinal(listaM: MutableList<Vehiculos>, listaC: MutableList<Vehiculos>) {
    val listaMOrdenada = listaM.sortedBy { it.precio }
    listaMOrdenada.forEach {
        println(" - tipo " + it.tipo + " marca "+ it.marca +" precio " + it.precio+" cantidad "+listaMOrdenada.size)
    }
    val listaCOrdenado = listaC.sortedBy { it.marca }
    listaC.forEach {
        println(" - tipo " + it.tipo + " marca "+ it.marca +" precio " + it.precio+ " cantidad "+listaCOrdenado.size)
    }
}

