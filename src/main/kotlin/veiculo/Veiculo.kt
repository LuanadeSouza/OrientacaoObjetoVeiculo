package veiculo

interface Veiculo : Combustivel {

    override fun abastecer() = "Abastendendo "
    fun acelerar() = "Acelerando"
}