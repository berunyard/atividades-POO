public class Produto implements Comparable <Produto> {
    private String codigo;
    private String desc;
    private String fornecedor;
    private double preco;
    private int qtdEstoque;

    public Produto(String codigo, String desc, String fornecedor, double preco, int qtdEstoque) {
        this.codigo = codigo;
        this.desc = desc;
        this.fornecedor = fornecedor;
        this.preco = preco;
        this.qtdEstoque = qtdEstoque;
    }

    public Produto(String codigo) {
        this.codigo = codigo;
    }

    public void aplicarDesconto(double desconto) {
        this.preco = this.preco - (this.preco * (desconto / 100));
    }

    public void aplicarAumento(double aumento) {
        this.preco = this.preco + (this.preco * (aumento / 100));
    }

    public void atualizarEstoque(int qtd) {
        this.qtdEstoque = this.qtdEstoque + qtd;
    }

    public void venderProduto(int qtd) {
        this.qtdEstoque = this.qtdEstoque - qtd;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(String fornecedor) {
        this.fornecedor = fornecedor;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQtdEstoque() {
        return qtdEstoque;
    }

    public void setQtdEstoque(int qtdEstoque) {
        this.qtdEstoque = qtdEstoque;
    }

    @Override
    public String toString() {
        return this.codigo + " " + this.desc + " " + this.fornecedor + " " + this.preco + " " + this.qtdEstoque;
    }

    @Override
    public int compareTo(Produto outro) {
        int retorno;
        double dif;
        if (this.codigo == outro.codigo) {
            retorno = 0;
        }
        else if (this.codigo != outro.codigo){
            retorno = 1;
        }
        return retorno;
    }
}
