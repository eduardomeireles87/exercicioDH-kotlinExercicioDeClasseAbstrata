package exercicioClasseAbstrata

class ingressoVip (valor: Double): ingresso(valor) {
    var taxaExtra: Double = 0.3

    override fun imprimeIngresso() {
        var precoVip = valor*(1+taxaExtra)
        println("Ingresso VIP: R$ ${precoVip}")
    }
}