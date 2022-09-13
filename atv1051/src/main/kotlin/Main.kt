import java.util.Scanner

fun main() {
    val ler = Scanner(System.`in`)
    val salario = ler.nextDouble()

    when {
        salario >= 0.00 && salario <= 2000.00 -> println("Insento")
        salario >= 2000.01 && salario <= 3000.00 -> {
            val imposto = 0.08 * (salario - 2000.00)
            val printImposto = String.format("%.2f", imposto)
            println("R$ $printImposto")
        }
        salario >= 3000.01 && salario <= 4500.00 -> {
            val imposto = 0.18 * (salario - 3000.00) + 0.08 * (salario - 2000.00 - (salario - 3000.00))
            val printImposto = String.format("%.2f", imposto)
            println("R$ $printImposto")
        }
        salario > 4500.00 -> {
            val imposto = 0.28 * (salario - 4500.00) + 0.18 * (salario - 3000.00 - (salario - 4500.00)) + 0.08 * (salario - 3500.00 - (salario - 4500.00))
            val printImposto = String.format("%.2f", imposto)
            println("R$ $printImposto")
        }
    }
}