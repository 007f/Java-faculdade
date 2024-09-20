package org.example;

public class Motocicleta extends Veiculo{
    public Motocicleta() {
    }

    @Override
    void atribuir(Encomenda produto) {
        if(getVolumeAtual()+produto.getVolume() < 1 && getPesoAtual() + produto.getPeso() < 30){
            setCargaAtual(produto);
        }else {
            System.out.println("Falta de espaço ou excesso de peso");
        }
    }
}
