package bicicleta

import veiculo.Veiculo

class BicicletaEletrica (quantidadeRodas: Int, cor: String, tamanho: String): Veiculo(quantidadeRodas, cor, tamanho) {

    override fun acelerar() = "Acelerando"
    override fun abastecer() = "Recarregando"
    fun ligar() = "ligando"
    fun freiar() = "freaindo"
}