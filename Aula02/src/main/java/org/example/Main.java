package org.example;
    /*package apresenta as pastas origens do sistema, elas permitem que classe
acessem atributos e metodos de outras classes de mesma origem dependendo da visibilidade
do elemento (public: qualquer um pode ler e usar; private: apenas a o objeto pode acessar;
caso não seja apresentado, o java entendera como protegido, logo apenas sistemas e classe
de mesma origem ou de dentro da origem que podem acessar o elemento, classes e objetos de
origem externa não conseguem.*/

public class Main {
    //definice a classe com a extrutura acima
    //abaixo tem o procedimento main padrão qual n necessita de comando externo para executar
    public static void main(String[] args) {
        //new Pessoa().nome = "Joao";
        /*ao criar um obj Pessoa definindo o nome Joao a memoria é reservada, contudo
        o obj em si não possui um referencial/ponteiro.*/

        /*para isso definimos uma variavel do tipo da classe a qual chamara o obj e dele iremos
        alterar as variaveis e executar seu metodos*/
        Pessoa joao = new Pessoa();
        joao.nome = "Joao";
        joao.caminhar();

        /*abaixo vemos que mesmo chamando o constructor de mesmo nome, ao enviarmos
        parametros desejados, podemos definir qual dos constructor desejamos usar na classe Pessoa
        */
        Pessoa karen = new Pessoa("Karen", "Maringa");

        /*no caso, não é possivel enviar parametros de forma inconpleta, por exemplo
        Pessoa karen = new Pessoa("Karen"); o obj karen não será criado afirmando não existir
        um constructor que receba especificamente tais parametros.*/
    }
}