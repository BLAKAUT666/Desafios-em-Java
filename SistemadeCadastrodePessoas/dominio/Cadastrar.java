package SistemadeCadastrodePessoas.dominio;
import java.util.ArrayList;
import java.util.List;

public class Cadastrar {
    // metodo criar a lista e os dados da pessoa
    public void adicionar(Pessoas pessoa){
        List<String> pessoas = new ArrayList<>();
        // adicionar o nome, idade, cpf a lista
        pessoas.add("Nome: " + pessoa.getNome() + " Idade: " + pessoa.getIdade() + " cpf: " + pessoa.getCpf());

        // percorendo a lista
        for(int i = 0; i < pessoas.size(); i++){
            System.out.println(pessoas.get(i));
        }
    }
}
