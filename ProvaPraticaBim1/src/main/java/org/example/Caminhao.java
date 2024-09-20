package org.example;

public class Caminhao extends Veiculo{
    public Caminhao() {
    }

    @Override
    void atribuir(Encomenda produto) {
        if(getVolumeAtual()+produto.getVolume() < 30 && getPesoAtual() + produto.getPeso() < 5000){
            setCargaAtual(produto);
        }else {
            System.out.println("Falta de espaço ou excesso de peso");
        }
    }
}
