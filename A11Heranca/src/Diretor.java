public class Diretor extends Funcionario {
    private String segTurno;

    public Diretor(String nome, int inscricao, double salario, String turno, String segTurno) {
        super(nome, inscricao, salario, turno);
        this.segTurno = segTurno;
    }

    public String getSegTurno() {
        return segTurno;
    }

    public void setSegTurno(String segTurno) {
        this.segTurno = segTurno;
    }

    public void criarDescontos() {

    }

    public void encomendarFardas() {

    }

    public void gerenciarProfessores() {

    }
}
