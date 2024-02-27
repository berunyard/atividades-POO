import java.util.HashMap;
import java.util.Scanner;

public class TesteMapaAluno {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        Integer matricula;

        // Aluno a1 = new Aluno(1, "Karina", 22, "aespa");
        // Aluno a2 = new Aluno(2, "Giselle", 22, "aespa");
        // Aluno a3 = new Aluno(3, "Winter", 22, "aespa");
        // Aluno a4 = new Aluno(4, "NingNing", 20, "aespa");
        // Aluno a5 = new Aluno(5, "Garam", 18, "LE SSERAFIM");

        HashMap<Integer, Aluno> mapaAlunos = new HashMap<Integer, Aluno>();
        mapaAlunos.put(1, new Aluno(1, "Karina", 22, "aespa"));
        mapaAlunos.put(2, new Aluno(2, "Giselle", 22, "aespa"));

        System.out.println("Digite uma matrícula: ");
        matricula = in.nextInt();
        pesquisar(matricula);

    }

    public static String pesquisar(Integer matricula) {
        HashMap<Integer, Aluno> mapaAlunos = new HashMap<Integer, Aluno>();

        if (mapaAlunos.containsKey(matricula)) {
            Aluno aluno = mapaAlunos.get(matricula);
            return "\nMatricula: " + aluno.getMatricula() + "\nNome: " + aluno.getNome() + "\nIdade: "
                    + aluno.getIdade() + "\nCurso: " + aluno.getCurso() + "\n";
        } else {
            System.out.println("Aluno não encontrado.");
            return null;
        }

    }

}
