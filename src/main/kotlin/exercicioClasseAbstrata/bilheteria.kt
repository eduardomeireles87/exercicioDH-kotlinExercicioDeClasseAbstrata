package exercicioClasseAbstrata

fun main(){

    val preco:Double = 150.0

    println("Qual o tipo de ingresso você deseja adquirir? " +
            "Digite a opção númerica que corresponde a opção desejada: " +
            "\n1 para selecionar Ingresso Padrão" +
            "\n2 para selecionar Ingresso VIP")

    when(readLine()!!){
        "1" -> {
            var ingressoPadrao = ingressoPadrao(preco)
            ingressoPadrao.imprimeIngresso()
        }
        "2" -> {
            var ingressoVip = ingressoVip(preco)
            ingressoVip.imprimeIngresso()
        }
        else -> println("Opção não cadastrada. Por favor, execute novamente selecionando as opções cadastradas: número 1 para Ingresso Padrão ou 2 para Ingresso VIP.")
    }
}