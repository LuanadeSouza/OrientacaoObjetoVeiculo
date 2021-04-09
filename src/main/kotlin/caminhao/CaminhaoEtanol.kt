package caminhao

import veiculo.Veiculo

class CaminhaoEtanol (quantidadeRodas: Int, cor: String, tamanho: String): Veiculo(quantidadeRodas, cor, tamanho) {

    override fun abastecer() = "Abastendendo com Etanol "
    override fun acelerar() = "Acelerando"
    fun ligar() = "Ligando"
    fun freiar() = "Freiando"
}