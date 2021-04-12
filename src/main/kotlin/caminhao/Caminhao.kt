package caminhao

import veiculo.Veiculo

interface Caminhao : Veiculo {

    override fun abastecer() = "Abastendendo com gasolina "
    override fun acelerar() = "Acelerando"
    fun ligar() = "Ligando"
    fun freiar() = "Freiando"
}