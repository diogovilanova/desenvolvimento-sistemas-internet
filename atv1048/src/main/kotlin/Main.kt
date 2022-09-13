import java.util.Scanner

fun main() {
    val ler = Scanner(System.`in`)
    val salario = ler.nextDouble()

    if (salario >= 0 && salario <= 400.00) {
        val percentual = 0.15
        val novoSalario = salario + salario * percentual
        val reajuste = "15 %"
        val reajusteGanho = novoSalario - salario

        val reajGanho = String.format("%.2f", reajusteGanho)
        val novoSal = String.format("%.2f", novoSalario)

        println("Novo salário: $novoSal")
        println("Reajuste ganho: $reajGanho")
        println("Em percentual: $reajuste")
    }
    else if (salario >= 400.01 && salario <= 800.00) {
        val percentual = 0.12
        val novoSalario = salario + salario * percentual
        val reajuste = "12 %"
        val reajusteGanho = novoSalario - salario

        val reajGanho = String.format("%.2f", reajusteGanho)
        val novoSal = String.format("%.2f", novoSalario)

        println("Novo salário: $novoSal")
        println("Reajuste ganho: $reajGanho")
        println("Em percentual: $reajuste")
    }
    else if (salario >= 800.01 && salario <= 1200.00) {
        val percentual = 0.10
        val novoSalario = salario + salario * percentual
        val reajuste = "10 %"
        val reajusteGanho = novoSalario - salario

        val reajGanho = String.format("%.2f", reajusteGanho)
        val novoSal = String.format("%.2f", novoSalario)

        println("Novo salário: $novoSal")
        println("Reajuste ganho: $reajGanho")
        println("Em percentual: $reajuste")
    }
    else if (salario >= 1200.01 && salario <= 2000.00) {
        val percentual = 0.07
        val novoSalario = salario + salario * percentual
        val reajuste = "7 %"
        val reajusteGanho = novoSalario - salario

        val reajGanho = String.format("%.2f", reajusteGanho)
        val novoSal = String.format("%.2f", novoSalario)

        println("Novo salário: $novoSal")
        println("Reajuste ganho: $reajGanho")
        println("Em percentual: $reajuste")
    }
    else if (salario > 2000.00) {
        val percentual = 0.04
        val novoSalario = salario + salario * percentual
        val reajuste = "4 %"
        val reajusteGanho = novoSalario - salario

        val reajGanho = String.format("%.2f", reajusteGanho)
        val novoSal = String.format("%.2f", novoSalario)

        println("Novo salário: $novoSal")
        println("Reajuste ganho: $reajGanho")
        println("Em percentual: $reajuste")
    }
}