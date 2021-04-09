package motocicleta

import veiculo.Veiculo

class Moto (quantidadeRodas: Int, cor: String, tamanho: String): Veiculo(quantidadeRodas, cor, tamanho) {

    override fun abastecer() = "Abastendendo com gasolina "
    override fun acelerar() = "Acelerando"
    fun ligar() = "Ligando"
    fun freiar() = "Freiando"
}