package dominio;

public class Endereco {
    private String cidade;
    private String rua;
    private int numero;

    public Endereco(String cidade, String rua,int numero){
        this.cidade = cidade;
        this.rua = rua;
        this.numero = numero;
    }

    public String getRua() {
        return this.rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getCidade() {
        return this.cidade;
    }

    public void setEndereco(String cidade) {
        this.cidade = cidade;
    }
}
