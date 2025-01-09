package dominio;

public class Livros {
    private String nome;
    private String autor;
    private Biblioteca biblioteca;

     // contrutor
    public Livros(String nome, String autor){
        this.autor = autor;
        this.nome = nome;
    }

    // imprimir os livros e a biblioteca
    public void imprimi(){
        System.out.printf("------------- \n");
        System.out.println("Nome: " + this.nome);
        System.out.println("Autor: " + this.autor);
        if(biblioteca == null){ System.out.println("sem biblioteca no momento!"); return; }
        System.out.println("Biblioteca: " + biblioteca.getNome());
        System.out.println("Endereco: " + biblioteca.getAutor());
    }

    // biblioteca
    public void setBiblioteca(Biblioteca biblioteca){ this.biblioteca = biblioteca; }
    public Biblioteca getBiblioteca(){ return this.biblioteca; }

    // nome
    public void setNome(String nome){ this.nome = nome; }
    public String getNome(){ return this.nome; }

    // autor
    public void setAutor(String autor){ this.autor = autor; }
    public String getAutor(){ return this.autor; }
}
