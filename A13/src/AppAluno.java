//import java.util.ArrayList;
//import java.util.Scanner;

public class AppAluno {
    public static void main(String[] args) {
        // Scanner in = new Scanner(System.in);

        CadastroAluno cadastrar = new CadastroAluno();
        cadastrar.addAluno(new Aluno(1, "Cenoura", 0, "Horticultura"));
        cadastrar.addAluno(new Aluno(3, "Morrow", 85, "História"));
        cadastrar.addAluno(new Aluno(6, "Pipi", 2, "Medicina Veterinária"));
        cadastrar.addAluno(new Aluno(15, "Argamassa", 40, "Pedreiro"));
        // Mais 6 alunos...!

        cadastrar.printListaAlunos(); // método 1
        // System.out.println(cadastrar.getListaAlunos()); // método 2

    }
}
