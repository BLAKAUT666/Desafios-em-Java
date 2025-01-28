import java.util.Arrays;

public class Pedidos{
    private Clientes cliente;
    private Produtos[] itens;

    public Pedidos(Clientes cliente, Produtos[] itens){
        this.cliente = cliente;
        this.itens = itens;
    }

    @Override
    public String toString() {
        return "Pedidos [cliente=" + cliente.nome + ", itens=" + Arrays.toString(itens) + "]";
    }

    // set and get in clientes
    public void setCliente(Clientes cliente){
        this.cliente = cliente;
    }

    public Clientes getCliente(){
        return this.cliente;
    }

    // set and get in Produtos
    public void setItens(Produtos[] itens){
        this.itens = itens;
    }

    public Produtos[] getItens(){
        return this.itens;
    }
}
