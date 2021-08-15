package exercicioClasseAbstrata

class ingressoPadrao (valor: Double): ingresso(valor) {
    override fun imprimeIngresso() {
        println("Ingresso padrão: R$ ${valor}")
    }
}