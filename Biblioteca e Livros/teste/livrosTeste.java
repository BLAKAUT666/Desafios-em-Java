package teste;

import dominio.Biblioteca;
import dominio.Livros;

public class livrosTeste {
    public static void main(String[] args) {
        // livros e biblioteca
        Biblioteca biblioteca = new Biblioteca("Parque Ibirapuera", "Vila Mariana, São Paulo - SP, 04094-050");
        Livros livros = new Livros("as dores do mundo", "Arthur Schopenhauer");
        livros.setBiblioteca(biblioteca);
        livros.imprimi();

        Livros livros2 = new Livros("a arte de ligar o foda-se", "Mark Manson");
        livros2.imprimi();

        Livros livros3 = new Livros("365 meditaçoes de marcos aurerio", "Marcos Aurerio");
        Biblioteca biblioteca2 = new Biblioteca("Centro Cultural São Paulo", "Rua Vergueiro, 1.000, próximo a estação Vergueiro do Metrô");
        livros3.setBiblioteca(biblioteca2);
        livros3.imprimi();
    }
}
