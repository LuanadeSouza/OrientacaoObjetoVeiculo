package carro

import veiculo.Veiculo

class Carro (quantidadeRodas: Int, cor: String, tamanho: String): Veiculo(quantidadeRodas, cor, tamanho) {

    override fun abastecer() = "Abastendendo com Alcool "
    override fun acelerar() = "Acelerando"
    fun ligar() = "Ligando"
    fun freiar() = "Freiando"
}