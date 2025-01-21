package enumeracao.Execiceos.NíveisdeAcesso.dominio;
import java.util.Scanner;

public class Acesso {
    private Niveis nivel;
    private String nome;

    public Acesso(String nome, Niveis nivel){
        this.nome = nome;
        this.nivel = nivel;
    }

    @Override
    public String toString(){
        return "Acesso{ " +
                " Nivel: " + this.getNivel().Conta +
                " }";
    }

    public void Acesso(){
        if(Niveis.ADIMIN == this.getNivel()) {
            System.out.println("[ 1 ] Deletar Pessoas ");
            System.out.println("[ 2 ] Adicionar Pessoas ");
            System.out.println("[ 3 ] Excluir Conta de Pessoas");
            System.out.println("[ 4 ] Modificar o Sistema");
            System.out.println("[ 5 ] Mudar Nome");
        }
        else if(Niveis.USER == this.nivel){
            System.out.println("[ 1 ] Adicionar Amigos");
            System.out.println("[ 2 ] Ver Perfis");
            System.out.println("[ 3 ] Ver Reels");
            System.out.println("[ 4 ] Excluir Pessoas");
            System.out.println("[ 5 ] Criar Nova Conta");
        }
        else{
            System.out.println("[ 1 ] Ver Reels");
            System.out.println("[ 2 ] Criar Conta");
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Niveis getNivel() {
        return nivel;
    }

    public void setNivel(Niveis nivel) {
        this.nivel = nivel;
    }
}
