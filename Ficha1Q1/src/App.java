public class App {
    public static void main(String[] args) throws Exception {
        Produto p1 = new Produto("1234", "Adidas", 300, 20);
        p1.status();
        p1.aplicarDesconto(20);
        p1.atualizarEstoque(5);
        p1.status();
        p1.aplicarAumento(100);
        p1.venderProduto(10);
        p1.status();
    }
}
