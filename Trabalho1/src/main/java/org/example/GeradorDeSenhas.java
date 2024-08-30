package org.example;

import java.util.Random;
public class GeradorDeSenhas {
    private int quantCarac;
    private boolean minus;
    private boolean maius;
    private boolean numb;
    private boolean esp;

    public GeradorDeSenhas(){
        this.quantCarac = 0;
        this.minus = false;
        this.maius = false;
        this.numb = false;
        this.esp = false;
    }

    public String gerarSenha(int quantCarac, boolean minus, boolean maius, boolean numb, boolean esp) {
        this.quantCarac = quantCarac;
        this.minus = minus;
        this.maius = maius;
        this.numb = numb;
        this.esp = esp;
        String A="abcdefghijklmnopqrstuvwxyz";
        String B="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String C="01234567890123456789";
        String D="!@#$%^&*()-_=+[]{}|;:',.<>?/";
        String sorteio = "";
        String senha = "";
        int x;

        if(minus){
            sorteio += A;
        }
        if(maius){
            sorteio += B;
        }
        if (numb){
            sorteio += C;
        }
        if (esp){
            sorteio += D;
        }
        Random gerador = new Random();
        StringBuilder strBuild = new StringBuilder(quantCarac);
        for(x=0; x<quantCarac; x++){

            int L = gerador.nextInt(sorteio.length());
            strBuild.append(sorteio.charAt(L));


        }
        senha = strBuild.toString();
        return senha;
    }
}
