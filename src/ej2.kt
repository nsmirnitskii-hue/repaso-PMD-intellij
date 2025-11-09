
data class Veiculos(var tipo: String, var marca: String,  var precio: Int )
var tipo = ""
var marca= ""
var precio = 0
fun main() {
    var respuesta: String = ""
    var listamoto = mutableListOf<Veiculos>()
    var listacoche = mutableListOf<Veiculos>()

while(true){
        println("Introduce el tipo de veiculo ")
        tipo = readln()
        if(tipo == "moto") {
            listamoto.add(Veiculos(tipo, "", 0))
            println("Introduce marca de tu veiculo")
            marca = readln()
            listamoto.add(Veiculos("",marca, 0))
            println("Introduce precio del veiculo")
            precio = readln().toInt()
            listamoto.add(Veiculos("","",precio))
            println("Quere seguir metiemdo los datos del veiculo?")
            respuesta = readln()
            if(respuesta == "no"){
                println("Tipo : $tipo\n Macra : $marca\n Precio : $precio")
                break
            }
        }else if(tipo =="coche"){
            listacoche.add(Veiculos(tipo, "", 0))
            println("Introduce marca de tu veiculo")
            marca = readln()
            listacoche.add(Veiculos("",marca, 0))
            println("Introduce precio del veiculo")
            precio = readln().toInt()
            listacoche.add(Veiculos("","",precio))
            println("Quere seguir metiemdo los datos del veiculo?")
            respuesta = readln()
            if(respuesta == "no"){
                println("Tipo : $tipo\n Macra : $marca\n Precio : $precio")
                break
            }
        }else{
            println("El tipo de coche no valido, puede ser solo o moto o coche")
            continue
        }
    }

}


