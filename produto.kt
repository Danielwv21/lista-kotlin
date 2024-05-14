class Produto(var nome: String, var preco: Double, var quantidade: Int) {
    fun apresentar(): String {
        return "Nome: $nome\nPreço: R$$preco\nQuantidade: $quantidade unidades"
    }
}
