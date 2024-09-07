package org.example;

public class Mago extends Personagem{
    private int mana;
    private int PoderMagico;

    public Mago(String nome, int nivel, int HP, int ATK, int DEF, int mana, int poderMagico) {
        super(nome, nivel, HP, ATK, DEF);
        this.mana = mana;
        PoderMagico = poderMagico;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public int getPoderMagico() {
        return PoderMagico;
    }

    public void setPoderMagico(int poderMagico) {
        PoderMagico = poderMagico;
    }

    @Override
    public void atacar(Personagem alvo) {
        int dano = this.PoderMagico - alvo.getDEF();
        alvo.receberDano(dano);
    }

    @Override
    public int receberDano(int dano) {
        this.setHp(getHp() - dano);
        return getHp();
    }

    public void lancarMagia(Personagem alvo) {
        if(this.mana<10){
            System.out.println("Mana insuficiente");
        }else{
            setMana(getMana() - 10);
            this.atacar(alvo);
        }
    }

    @Override
    public void exibirStatus() {
        super.exibirStatus();
        System.out.println("Mana: " + getMana() + "\nPoder Magico: " + getPoderMagico()+ "\n-----------\n");
    }
}
