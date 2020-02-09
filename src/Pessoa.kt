class Pessoa(
    val nome: String,
    val idade: Int
)

fun main() {
    val pessoa1: Pessoa = Pessoa("Douglas", 28)
    val pessoa2: Pessoa = Pessoa("Diogo", 23)

    println("Pessoa 1: ${pessoa1.nome}")
    println("Pessoa 2: ${pessoa2.nome}")


}