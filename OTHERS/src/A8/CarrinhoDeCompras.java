public class CarrinhoDeCompras {
    private int numItens;

    public int getNumItens() {
        return numItens;
    }

    public CarrinhoDeCompras() {
        this.numItens = 0;
    }

    public void adicionar() {
        this.numItens++;
    }

    public void remover() {
        while (this.numItens > 0) {
            this.numItens--;
        }
    }
}
