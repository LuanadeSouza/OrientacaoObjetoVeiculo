package bicicleta

import veiculo.Veiculo

interface Bicicleta : Veiculo {

    fun ligar() = "pedalando"
    fun freiar() = "freaindo"
}