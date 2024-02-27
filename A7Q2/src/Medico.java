package Q2;
public class Medico {
    private String codigo;
    private String nome;
    private char sexo;
    private String especialidade;
    private Endereco endereco;

    public Medico(String codigo, String nome, char sexo, String especialidade, Endereco endereco) {
        this.codigo = codigo;
        this.nome = nome;
        this.sexo = sexo;
        this.especialidade = especialidade;
        this.endereco = endereco;
    }

    public void medicoNovo (String codigon, String nomen, char sexon, String especialidaden, Endereco enderecon) {
        this.codigo = codigon;
        this.nome = nomen;
        this.sexo = sexon;
        this.especialidade = especialidaden;
        this.endereco = enderecon;
    }

    @Override
    public String toString() {
        return this.codigo + " " + this.nome + " " + this.sexo + " " + this.especialidade + " " + this.endereco;
    }
}
