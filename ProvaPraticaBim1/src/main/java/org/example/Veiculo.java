package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public abstract class Veiculo {
    private String status;
    private float VolumeAtual;
    private float pesoAtual;
    private List<Encomenda> cargaAtual;

    public Veiculo() {
        this.status = "Disponivel";
        this.cargaAtual = new ArrayList<>();
        VolumeAtual = 0;
        pesoAtual = 0;
    }

    //-----------------------------------------
    public List<Encomenda> getCargaAtual() {
        return cargaAtual;
    }

    public void setCargaAtual(Encomenda encomenda) {
        cargaAtual.add(encomenda);
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }


    public float getVolumeAtual() {
        return VolumeAtual;
    }

    public void setVolumeAtual(float volumeAtual) {
        VolumeAtual = volumeAtual;
    }

    public float getPesoAtual() {
        return pesoAtual;
    }

    public void setPesoAtual(float pesoAtual) {
        this.pesoAtual = pesoAtual;
    }


    public void CarregarProduto(Encomenda produto){
        if(Objects.equals(getStatus(),"Disponivel")){
            atribuir(produto);
        } else if (Objects.equals(getStatus(),"Manutenção")) {
            System.out.println("Veiculo em manutenção");
        }else{
            System.out.println("Veiculo em rota");
        }
    }

    public void Descarregar(Encomenda produto){
        cargaAtual.remove(produto);
        setVolumeAtual(getVolumeAtual()- produto.getVolume());
        setPesoAtual(getPesoAtual()- produto.getPeso());
    }

     abstract void atribuir(Encomenda produto);

}
