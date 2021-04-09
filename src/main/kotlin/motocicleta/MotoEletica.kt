package motocicleta

import veiculo.Veiculo

class MotoEletica (quantidadeRodas: Int, cor: String, tamanho: String): Veiculo(quantidadeRodas, cor, tamanho) {

    override fun acelerar() = "Acelerando"
    override fun abastecer() = "Recarregando"
    fun ligar() = "ligando"
    fun freiar() = "freaindo"
}