import java.util.ArrayList;
import java.util.Scanner;

public class MainAluno {
    public static void main(String[] args) {
        ArrayList<Aluno> alunos = new ArrayList<>();
        Aluno x = new Aluno("Edu", 100);
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.println("Digite a nota " + (i + 1) + "° para o " + (alunos.size() + 1) + "° aluno:");
            double nota = input.nextDouble();
            x.setNotas(nota);
        }

        alunos.add(x);

        for (Aluno aluno : alunos) {
            if (aluno.calcularMedia() >= 7) {
                System.out.println(aluno.toString() + "aprovado");
            } else {
                System.out.println(aluno.toString() + "reprovado");
            }
        }
        input.close();
    }
}
