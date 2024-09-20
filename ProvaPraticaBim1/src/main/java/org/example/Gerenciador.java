package org.example;

import java.util.Scanner;

public class Gerenciador {

    public Gerenciador(){

    }


    public DefinirStatus(Veiculo veiculo){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite novo status do veiculo: ");
        String n = scanner.next();
        veiculo.setStatus(n);
    }


    public void atribuirProd(Encomenda prod, Veiculo moto, Veiculo cami, Veiculo van){
        if(prod.getPrioridade().toUpperCase() == "ALTA" && moto.getVolumeAtual()< 1 && moto.getPesoAtual() < 30 && moto.getStatus().toUpperCase() == "DISPONIVEL"){
            moto.CarregarProduto(prod);
            prod.setVeiculo("moto");
        } else if (prod.getPrazo()>30) {
            cami.CarregarProduto(prod);
            prod.setVeiculo("cami");
        }else {
            van.CarregarProduto(prod);
            prod.setVeiculo("van");
        }
    }

    public void DescarregarProd(Veiculo veiculo, Encomenda prod){
        veiculo.Descarregar(prod);
    }
}
