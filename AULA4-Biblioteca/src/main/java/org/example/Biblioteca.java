package org.example;

public class Biblioteca {
    /*a definição de procedimento como 'main' permite a execução do codigo sem a necessidade
    * de sua chamada*/
    public static void main(String[] args) {

        int numero = 100; // Tipo primitivo `int`
        String nome = "Joao"; // String (utiliza a classe `String` própria do Java)
        Livro livro = new Livro("Dom Casmurro", "Machado de Assis", "1899"); /* Cria novo objeto (instância) da classe `Livro`
															    e o inicializa com os 3 parâmetros p/ o construtor */

        Livro livro2 = new Livro("Código Limpo", "Robertão", "1998"); // Cria e inicializa mais um outro objeto

        System.out.println("--> Qual o nome do livro? " + livro.getTitulo() + "\n--> Qual o livro2? " + livro2.getTitulo());
        System.out.println("--> Qual o autor do livro? " + livro.getAutor());
        System.out.println("--> Qual o ano? " + livro.getAnoPublicacao());
        System.out.println("--> Está disponível? " + livro.isDisponibilidade());
    }
}