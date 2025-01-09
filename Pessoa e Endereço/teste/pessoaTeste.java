package teste;
import dominio.Endereco;
import dominio.Pessoa;

public class pessoaTeste {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("Alexandre", 20);
        Pessoa pessoa2 = new Pessoa("Marcos", 22);

        Endereco endereco1 = new Endereco("Carapicuiba", "Avenida Brasil", 110);
        Endereco endereco2 = new Endereco("Belo Horisonte", null, 340);

        pessoa1.setEndereco(endereco1);
        pessoa1.imprimi();


        pessoa2.setEndereco(endereco2);
        pessoa2.imprimi();
    }
}
