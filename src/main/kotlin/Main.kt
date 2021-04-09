import bicicleta.Bicicleta
import bicicleta.BicicletaEletrica
import caminhao.Caminhao
import caminhao.CaminhaoEtanol
import carro.Carro
import carro.CarroAGas
import motocicleta.Moto
import motocicleta.MotoEletica

fun main(){

    val bicicletaVermelha = Bicicleta(cor = "Vermelho", tamanho = "Media", quantidadeRodas = 2)
    val biclicletaAzul = BicicletaEletrica(cor = "Azul", tamanho = "Pequena", quantidadeRodas = 2)
    val CaminhaoBranco = Caminhao(quantidadeRodas = 8, tamanho = "Grande", cor = "Branco")
    val CaminhaoPreto = CaminhaoEtanol(quantidadeRodas = 6, tamanho = "MuitoGrande", cor = "Preto")
    val carroVerde = Carro(quantidadeRodas = 4, tamanho = "Compacto", cor = "Verde")
    val carroRosa = CarroAGas(quantidadeRodas = 4, tamanho = "Grande", cor = "Rosa")
    val motocicletaVermelha = MotoEletica(cor = "Vermelho", tamanho = "Media", quantidadeRodas = 2)
    val motocicletaaAzul = Moto(cor = "Azul", tamanho = "Pequena", quantidadeRodas = 2)
}