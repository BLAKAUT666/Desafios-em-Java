public class teste{
    public static void main(String[] args) {
        Clientes clientes = new Clientes("Alexandre", "Av. Brasil, 204c");
        Produtos produtos1 = new Produtos("Bola", "Bola de futebol nova", 20.50);
        Produtos produtos2 = new Produtos("Tenis", "Tenis nike, preto", 140);
        Produtos[] produtos = {produtos1, produtos2};
        Pedidos pedidos = new Pedidos(clientes, produtos);

        System.out.println(pedidos);
        
    }
}
