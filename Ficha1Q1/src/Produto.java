public class Produto {
    private String codigo;
    private String fornecedor;
    private double preco;
    private int qtdEstoque;

    public Produto(String codigo, String fornecedor, double preco, int qtdEstoque){
        setCodigo(codigo); // duas maneiras;
        this.fornecedor = fornecedor; // aqui;
        this.preco = preco; //ex, o preço vai ser jogado no this.preco para o objeto na classe principal;
        this.qtdEstoque = qtdEstoque;
    }
    public void setCodigo(String codigo){ //método chamado pra digitar o código
        this.codigo = codigo;
        // pega o código do produto digitado e joga no this.codigo;
    }
    public String getCodigo(){
        return this.codigo;
    }
    public void status(){
        System.out.println("Código: " + this.codigo);
        System.out.println("Fornecedor: " + this.fornecedor);
        System.out.println("Preço: " + this.preco);
        System.out.println("Quantidade em estoque: " + this.qtdEstoque);
    }

    public void aplicarDesconto (double desconto){
        double d;
        d = this.preco * (desconto/100);
        this.preco = this.preco - d;
    }
    public void aplicarAumento (double aumento){
        double a;
        a = this.preco * (aumento/100);
        this.preco = this.preco + a;
    }
    public void atualizarEstoque (int qtdEstoque){
        this.qtdEstoque = this.qtdEstoque + qtdEstoque;
    }
    public void venderProduto (int qtdEstoque){
        this.qtdEstoque = this.qtdEstoque - qtdEstoque;
    }
}
