import java.util.*

class Celular (modelo: String, preco: Float){
    var marca: String = ""
    var modelo: String = ""
    var preco: Float = 0f
    var desconto: Float = 0f

    init {
        this.modelo = modelo.uppercase(Locale.getDefault())
        this.preco = preco
    }

    // Primeiro Construtor
    constructor(marca: String, modelo: String, preco: Float, desconto: Float):this(modelo, preco){
        this.marca = marca.uppercase(Locale.getDefault())
        this.modelo = modelo.uppercase(Locale.getDefault())
        this.preco = preco
        this.desconto = desconto
    }

    fun precoDesconto():Float{
        return preco - (preco * desconto)/100
    }

    fun printarDetalhes(){
        println("Especificações do celular:")
        println("Marca: $marca")
        println("Modelo: $modelo")
        println("Preço: R\$$preco")
        println("Desconto: ${desconto}%")
    }
}

fun main() {
    val celular1 = Celular("Apple", "Iphone 13 PRO 128GB", 7999.0f, 7f)
    celular1.printarDetalhes()
    println("O preço com desconto é: ${celular1.precoDesconto()}")

    println()

    val celular2 = Celular("Google", "Pixel 6 Pro 256GB", 8999.00f, 12f)
    celular2.printarDetalhes()
    println("O preço com desconto é: ${celular2.precoDesconto()}")

    println()

    val celular3 = Celular("Xiaomi","POCO X3 Pro 128GB", 2599.00f, 5f)
    celular3.printarDetalhes()
    println("O preço com desconto é: ${celular3.precoDesconto()}")
}