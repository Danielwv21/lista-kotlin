class ContaCorrente(var numerodaConta: int, var saldo double){
     fun depositar(valor: Double) {
        saldo += valor
    }
    
    fun sacar(valor: Double) {
        saldo -= valor
        
    }
}
