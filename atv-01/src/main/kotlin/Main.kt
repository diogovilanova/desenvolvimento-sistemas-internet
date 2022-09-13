fun main() {
    var soma = 0
    for (numero in 1..500 step 1) {
        //verificar se o número é impar e se o número é divisivel por 3
        if (numero % 2 != 0){
            if (numero % 3 == 0) {
                //somar o valor inicial da variavel soma com o valor da varivel de numero
                soma += numero
            }
        }
    }
    println("A soma de todos os números ímpares multiplos de três entre 1 até 500 é: $soma")
}