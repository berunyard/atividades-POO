import java.util.ArrayList;

public class ItemPedido {
    private int numero;
    private String nomePeca;
    private double valor;

    public ItemPedido(int numero, String nomePeca, double valor) {
        this.numero = numero;
        this.nomePeca = nomePeca;
        this.valor = valor;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNomePeca() {
        return nomePeca;
    }

    public void setNomePeca(String nomePeca) {
        this.nomePeca = nomePeca;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

}
