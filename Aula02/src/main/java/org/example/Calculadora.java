package org.example;

public class Calculadora {
    // Atributos:
    private int numeroA;
    private int numeroB;

    // Metodo Construtor:
    public Calculadora(int a, int b) {
        this.numeroA = a;
        this.numeroB = b;
    }

    public int getNumeroA() {
        return this.numeroA;
    }

    public void setNumeroA(int a) {
        this.numeroA = a;
    }

    public int getNumeroB() {
        return this.numeroB;
    }

    public void setNumeroB(int b) {
        this.numeroB = b;
    }

    // Metodos:
    public int somar() {
        return this.numeroA + this.numeroB;
    }

    public int subtrair() {
        return this.numeroA - this.numeroB;
    }
}