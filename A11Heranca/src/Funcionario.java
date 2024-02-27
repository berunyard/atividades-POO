public class Funcionario {
    private String nome;
    private int inscricao;
    private double salario;
    private String turno;

    public Funcionario(String nome, int inscricao, double salario, String turno) {
        this.nome = nome;
        this.inscricao = inscricao;
        this.salario = salario;
        this.turno = turno;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getInscricao() {
        return inscricao;
    }

    public void setInscricao(int inscricao) {
        this.inscricao = inscricao;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public void horariosDisponiveis() {

    }

    public void horarioTrabalho() {

    }

    public String informacoesFuncionario() {
        return "\nNome" + this.nome + "\nInscrição: " + this.inscricao +
                "\nSalário: " + this.salario + "\nTurno: " + this.turno + "\n";
    }

    public void funcaoDesempenhar() {

    }
}
