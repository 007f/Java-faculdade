package org.example;

public class Guerreiro extends Personagem{
    private int ForcaExtra;
    private int Armadura;

    public Guerreiro(String nome, int nivel, int HP, int ATK, int DEF, int forcaExtra, int armadura) {
        super(nome, nivel, HP, ATK, DEF);
        ForcaExtra = forcaExtra;
        Armadura = armadura;
    }

    public int getForcaExtra() {
        return ForcaExtra;
    }

    public void setForcaExtra(int forcaExtra) {
        ForcaExtra = forcaExtra;
    }

    public int getArmadura() {
        return Armadura;
    }

    public void setArmadura(int armadura) {
        Armadura = armadura;
    }

    @Override
    public void atacar(Personagem alvo) {
        int dano = this.getATK() + ForcaExtra - alvo.getDEF();
        alvo.receberDano(dano);
    }

    @Override
    public int receberDano(int dano) {
        this.setHp(getHp() - dano);
        return getHp();
    }

    @Override
    public void exibirStatus() {
        super.exibirStatus();
        System.out.println("Forca: " + getForcaExtra() +"\nArmadura: " + getArmadura() + "\n-----------\n");
    }
}
