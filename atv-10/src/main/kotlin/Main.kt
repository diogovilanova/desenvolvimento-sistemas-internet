import java.util.Scanner

fun main() {
    val ler = Scanner(System.`in`)
    val valorInicial = ler.nextInt()
    var fatorial = 1L
    for(valor in 1..valorInicial) {
        fatorial *= valor.toLong()

        println(valor)
    }
    println("O fatorial de $valorInicial ! = $fatorial")
}
