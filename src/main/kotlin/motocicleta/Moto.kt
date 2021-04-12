package motocicleta

import veiculo.Veiculo

interface Moto : Veiculo {

    override fun abastecer() = "Abastendendo com gasolina "
    override fun acelerar() = "Acelerando"
    fun ligar() = "Ligando"
    fun freiar() = "Freiando"
}