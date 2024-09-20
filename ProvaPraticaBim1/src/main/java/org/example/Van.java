package org.example;

public class Van extends Veiculo{
    public Van() {
    }

    @Override
    void atribuir(Encomenda produto) {
        if(getVolumeAtual()+produto.getVolume() < 5 && getPesoAtual() + produto.getPeso() < 500){
            setCargaAtual(produto);
        }else {
            System.out.println("Falta de espaço ou excesso de peso");
        }
    }
}
