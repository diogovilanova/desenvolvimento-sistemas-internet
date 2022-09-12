import java.util.Scanner

fun main() {
    val ler = Scanner(System.`in`)
    println("O primeiro termo da PG: ")
    var valorInicial = ler.nextInt()
    println("O valor da razão: ")
    val razao = ler.nextInt()

    for (x in 1..10){
        valorInicial *= razao

        println(valorInicial)
    }
}