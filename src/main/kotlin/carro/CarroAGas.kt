package carro

import veiculo.Veiculo


class CarroAGas (quantidadeRodas: Int, cor: String, tamanho: String): Veiculo(quantidadeRodas, cor, tamanho) {

    override fun abastecer() = "Abastendendo com Gás "
    override fun acelerar() = "Acelerando"
    fun ligar() = "Ligando"
    fun freiar() = "Freiando"
}