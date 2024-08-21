package org.example;

public class Pessoa {
    /*uma Classe é apresentada como uma abertura de estrutura classe
    seus atributos podem ser apresentados como publico privado ou apenas o tipo e nome referente.
    como mostrado abaixo*/
    //atributos
    public String nome;
    public String endereco;
    private int idade;

    /*um construtor é uma função que recebe os dados do main ou outra classe e cria um objeto colocando os valores
    nas */
    //construtor
    public Pessoa(){

    }
    //construtor
    public Pessoa(String p1, String p2){
        this.nome = p1;
        this.endereco = p2;
    }


    //metodos
    public void caminhar(){

    }
}
