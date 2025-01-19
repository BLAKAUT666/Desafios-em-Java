package variaveisFinal.dominio;

import com.sun.source.tree.UsesTree;

public class Pessoa {
    private final String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void imprimi(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade + " Anos");
    }

    public void setIdade(int idade){ this.idade = idade; }
    public int getIdade(){ return this.idade; }
}
