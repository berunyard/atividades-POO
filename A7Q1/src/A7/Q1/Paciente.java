package Q1;
public class Paciente {
    private String codigo;
    private String nome;
    private String dataNascimento;
    private char sexo;
    private String planoSaude;
    private char alergia;
    private String tipoSanguineo;

    public Paciente(String codigo, String nome, String dataNascimento, char sexo, String planoSaude, char alergia,
            String tipoSanguineo) {
        this.codigo = codigo;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.sexo = sexo;
        this.planoSaude = planoSaude;
        this.alergia = alergia;
        this.tipoSanguineo = tipoSanguineo;
    }

    public void modificarPaciente(String codigon, String nomen, String dataNascimenton, char sexon, String planoSauden,
            char alergian,
            String tipoSanguineon) {
        this.codigo = codigon;
        this.nome = nomen;
        this.dataNascimento = dataNascimenton;
        this.sexo = sexon;
        this.planoSaude = planoSauden;
        this.alergia = alergian;
        this.tipoSanguineo = tipoSanguineon;
    }

    @Override
    public String toString() {
        return this.codigo + " " + this.nome + " " + this.dataNascimento + " " + this.sexo + " " + this.planoSaude + " "
                + this.alergia + " " + this.planoSaude;
    }
}
