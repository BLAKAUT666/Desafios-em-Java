package SistemadeCadastrodePessoas.dominio;
import java.util.ArrayList;

public class Cadastrar {
    // metodo criar a lista e os dados da pessoa
    public void adicionar(Pessoas pessoa){
        // adicionar o nome, idade, cpf a lista
        ArrayList<String> pessoas = new ArrayList<>();
        pessoas.add("Nome: " + pessoa.getNome() + " idade: " + pessoa.getIdade() + " cpf: " + pessoa.getCpf());

        // percorendo a lista
        for(int i = 0; i < pessoas.size(); i++){
            System.out.println(pessoas.get(i));
        }
    }
}
