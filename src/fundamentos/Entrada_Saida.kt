package fundamentos


fun main() {
    print("Digite seu nome: ")
    var nome = readLine()

    print("Digite sua idade: ")
    var idade = readLine()?.toInt()

    println("Nome: $nome" +
            ", Idade: $idade")

}