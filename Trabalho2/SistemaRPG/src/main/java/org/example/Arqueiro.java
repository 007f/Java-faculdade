package org.example;

public class Arqueiro  extends Personagem{
    private int precisao;
    private int alcance;

    public Arqueiro(String nome, int nivel, int HP, int ATK, int DEF, int precisao, int alcance) {
        super(nome, nivel, HP, ATK, DEF);
        this.precisao = precisao;
        this.alcance = alcance;
    }

    public int getPrecisao() {
        return precisao;
    }

    public void setPrecisao(int precisao) {
        this.precisao = precisao;
    }

    public int getAlcance() {
        return alcance;
    }

    public void setAlcance(int alcance) {
        this.alcance = alcance;
    }

    @Override
    public void atacar(Personagem alvo) {
        int dano = this.getATK() + precisao - alvo.getDEF();
        alvo.receberDano(dano);
    }

    @Override
    public int receberDano(int dano) {
        this.setHp(getHp() - dano);
        return getHp();
    }

    public void atirarFlecha(Personagem alvo) {
        atacar(alvo);
    }

    @Override
    public void exibirStatus() {
        super.exibirStatus();
        System.out.println("Precisao: " + getPrecisao()+"\nAlcance: " + getAlcance()+ "\n--------\n");
    }
}
