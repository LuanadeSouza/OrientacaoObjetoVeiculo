package bicicleta

import veiculo.Veiculo

class Bicicleta (quantidadeRodas: Int, cor: String, tamanho: String): Veiculo(quantidadeRodas, cor, tamanho) {

    fun ligar() = "pedalando"
    fun freiar() = "freaindo"
}