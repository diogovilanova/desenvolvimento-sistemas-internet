import java.util.Scanner

fun main() {
    val ler = Scanner(System.`in`)
    val a = ler.nextInt()
    val b = ler.nextInt()

    if(a % b == 0 || b % a == 0) {
    println("São Multiplos")
    } else {
        println("Não são Multiplos")
    }
    return
}