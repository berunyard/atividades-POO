import java.util.ArrayList;

public class Pedido {
    private int numero;
    private ArrayList<ItemPedido> itens = new ArrayList<>();
    private double valorTotal;
    // private ArrayList<Pedido> pedidos;

    public Pedido(int numero, ArrayList<ItemPedido> itens) {
        this.numero = numero;
        this.itens = itens;
        this.valorTotal = total();
    }

    public double total() {
        double total = 0;
        for (int i = 0; i < itens.size(); i++) {
            total = total + itens.get(i).getValor();
        }
        return total;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public ArrayList<ItemPedido> getItens() {
        return itens;
    }

    public void setItens(ArrayList<ItemPedido> itens) {
        this.itens = itens;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }
}
