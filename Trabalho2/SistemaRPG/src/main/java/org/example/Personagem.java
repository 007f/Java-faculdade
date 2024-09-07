package org.example;

public abstract class Personagem {
    private String nome;
    private int hp;
    private int ATK;
    private int DEF;
    private int nivel;

    public Personagem(String nome,int nivel, int HP, int ATK, int DEF ) {
        this.nome = nome;
        this.nivel = nivel;
        this.hp = HP;
        this.ATK = ATK;
        this.DEF = DEF;
    }

    public int getNivel() {
        return nivel;
    }

    public int getDEF() {
        return DEF;
    }

    public int getATK() {
        return ATK;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public void setATK(int ATK) {
        this.ATK = ATK;
    }

    public void setDEF(int DEF) {
        this.DEF = DEF;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public abstract void atacar(Personagem alvo);

    public abstract int receberDano(int dano);

    public void exibirStatus(){
        System.out.println("Nome: " + nome +"\nNivel: " + nivel +"\nHP: " + hp + "\nATK: " + ATK + "\nDEF: " +DEF);
    }

    public boolean estaVivo() {
        if (hp<=0){
            return false;
        }else {
            return true;
        }
    }
}
