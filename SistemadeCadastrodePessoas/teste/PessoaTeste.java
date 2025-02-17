package SistemadeCadastrodePessoas.teste;
import SistemadeCadastrodePessoas.dominio.Cadastrar;
import SistemadeCadastrodePessoas.dominio.Pessoas;

public class PessoaTeste {
    public static void main(String[] args) {
        Pessoas pessoa02 = new Pessoas("Marcos", 18, "58008992077");
        Pessoas pessoa01 = new Pessoas("Alex", 17, "58497105826");
        Cadastrar cadastro = new Cadastrar();

        cadastro.adicionar(pessoa01);
        cadastro.adicionar(pessoa02);
        cadastro.remove(pessoa01);
    }
}
