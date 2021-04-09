package veiculo

open class Veiculo (val quantidadeRodas: Int, val cor: String, val tamanho: String): Combustivel {

    override fun abastecer() = "Abastendendo "
    open fun acelerar() = "Acelerando"
}