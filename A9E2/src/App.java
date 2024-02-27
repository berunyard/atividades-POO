import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<ItemPedido> itens1 = new ArrayList<>();
        itens1.add(new ItemPedido(1, "Cenoura", 5));
        itens1.add(new ItemPedido(2, "Cavalo", 600));
        itens1.add(new ItemPedido(3, "Cacto", 50));

        ArrayList<ItemPedido> itens2 = new ArrayList<>();
        itens2.add(new ItemPedido(1, "Cenoura", 5));
        itens2.add(new ItemPedido(4, "Bobo", 6));
        itens2.add(new ItemPedido(5, "Baba", 8));
        
        ArrayList<Pedido> pedidos = new ArrayList<>();
        pedidos.add(new Pedido(1, itens1));
        pedidos.add(new Pedido(2, itens2));

        int tam = pedidos.size();
        for (int i = 0; i < tam; i++){
            if (pedidos.get(i).total() > 500) {
                System.out.println(pedidos.get(i).getNumero());
            }
        }
    }
}
