package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Gerenciador gerenciador = new Gerenciador();
        Motocicleta moto = new Motocicleta();
        Caminhao cami = new Caminhao();
        Van van = new Van();

        String prio;
        float peso;
        float volume;
        int prazo;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a prioridade do produto: ");
        prio = scanner.next();
        System.out.print("Digite o peso do produto: ");
        peso = scanner.nextFloat();
        System.out.print("Digite o Volume do produto: ");
        volume = scanner.nextFloat();
        System.out.print("Digite o prazo do produto: ");
        prazo = scanner.nextInt();
        Encomenda produto = new Encomenda(prio, volume, peso, prazo);
        gerenciador.atribuirProd(produto, moto, cami, van);

        if (produto.getVeiculo()=="cami") {
            gerenciador.DescarregarProd(cami ,produto);
        } else if (produto.getVeiculo()=="van") {
            gerenciador.DescarregarProd(van ,produto);
        } else {
            gerenciador.DescarregarProd(moto ,produto);
        }


    }


}