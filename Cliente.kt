class Cliente (val nome: String, val cpf: String, val dataNascimento: String){
    fun apresentar(){
        println("O nome do cliente é $nome, o cpf $cpf e a data de nascimento $dataNascimento")
    }
}
