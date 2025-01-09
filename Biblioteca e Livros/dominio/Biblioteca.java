package dominio;

public class Biblioteca{
    private String nome;
    private String endereco;

    // contrutor
    public Biblioteca(String nome, String endereco){
        this.nome = nome;
        this.endereco = endereco;
    }

    // nome
    public void setNome(String nome){ this.nome = nome; }
    public String getNome(){ return this.nome; }

    // endereco
    public void setEndereco(String endereco){ this.endereco = endereco; }
    public String getAutor(){ return this.endereco; }

}