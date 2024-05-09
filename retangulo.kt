class Retangulo( val base: Double, val altura: Double) {

    fun calcularArea(): Double {
        return base * altura
    }

    fun calcularPerimetro(): Double {
        return 2 * (base + altura)
    }
}
