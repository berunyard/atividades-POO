/* (a) Implemente a classe Funcionário. Esta classe deverá ter os seguintes atributos: matrícula (String),
nome (String), cargo (String), salário (double) e ano de contratação (int). Implemente o construtor, os
métodos get para todos os atributos, os métodos set para todos os atributos (exceto para o atributo
matrícula), o método toString e o método compareTo (lembre-se de declarar que a classe Funcionário
implementa a classe Comparable). O atributo matrícula identifica unicamente um funcionário,
portanto deve ser utilizado pelo método compareTo para diferenciar dois funcionários.
A classe Funcionário deve ter o método público aplicarAumento para permitir a alteração do salário do
funcionário. Este método deverá receber como parâmetro o percentual de aumento que será dado ao
funcionário. */

public class Funcionario implements Comparable<Funcionario> {
    private String matricula;
    private String nome;
    private String cargo;
    private double salario;
    private int anoContrato;

    public Funcionario (String matricula, String nome, String cargo, double salario, int anoContrato){
        
    }

    public double aplicarAumento (double aumento){
        double numAumento = (this.salario/10) * (aumento/10);
        double newSalario = numAumento + this.salario;
        return newSalario;
    }

    public String getMatricula() {
        return this.matricula;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return this.cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return this.salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getAnoContrato() {
        return this.anoContrato;
    }

    public void setAnoContrato(int anoContrato) {
        this.anoContrato = anoContrato;
    }

    //
    @Override
    public String toString(){
        return String.format("");
    }

    @Override
    public int compareTo(Funcionario f) {
        int rt;
        rt = this.matricula.compareTo(f.matricula);
        return rt;
    }
}



