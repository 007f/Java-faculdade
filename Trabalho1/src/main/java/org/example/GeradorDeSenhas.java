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
        String A="felipesaueressigmello";
        String B="FELIPESAUERESSIGMELLO";
        String C="012345678910112233556";
        String D="!@#$%^&*()-_=+[]{}|;:',.<>?/";
        String sorteio="";
        String Senha = "";
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
        for(x=0, x<quantCarac x++){
            int L = Random();



        }
    }
}
