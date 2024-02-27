package Q2;
public class Endereco {
    private String rua;
    private int numero;
    private String complemento;
    private String bairro;
    private String cidade;
    private String uf;
    private String cep;

    public Endereco(String rua, int numero, String complemento, String bairro, String cidade, String uf,
            String cep) {
        this.rua = rua;
        this.numero = numero;
        this.complemento = complemento;
        this.bairro = bairro;
        this.cidade = cidade;
        this.uf = uf;
        this.cep = cep;
    }

    public void modificarEnd(String ruan, int numeron, String complementon, String bairron, String cidaden, String ufn,
            String cepn) {
        this.rua = ruan;
        this.numero = numeron;
        this.complemento = complementon;
        this.bairro = bairron;
        this.cidade = cidaden;
        this.uf = ufn;
        this.cep = cepn;
    }

    @Override
    public String toString() {
        return this.rua + " " + this.numero + " " + this.complemento + " " + this.bairro + " " + this.cidade + " "
                + this.uf + " " + this.cep;
    }
}
