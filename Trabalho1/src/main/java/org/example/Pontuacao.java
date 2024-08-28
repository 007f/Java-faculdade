package org.example;

public class Pontuacao {
    private int pontos;

    public Pontuacao() {
        this.pontos = 0;
    }


    public int getPontuacao(){
        return pontos;
    }

    public void adicionarPontos(int valor) {
        pontos = pontos+valor;
    }


    public void removerPontos(int valor) {
        if(valor>pontos){
            System.out.println("Valor é maior que a pontuação.");
        }else{
            pontos = pontos-valor;
        }
    }
}
