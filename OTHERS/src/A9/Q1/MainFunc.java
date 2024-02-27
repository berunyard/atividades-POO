import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();
        funcionarios.add(new Funcionario("Felipe", 70000, 21));
        funcionarios.add(new Funcionario("Maria", 15000, 50));
        funcionarios.add(new Funcionario("Lady", 500000, 20));
        funcionarios.add(new Funcionario("Isobel", 51000, 28));
        funcionarios.add(new Funcionario("Feto", 0, 1));

        int tam = funcionarios.size();

        for (int i = 0; i < tam; i++) {
            // Funcionario funcionario = funcionarios.get(i);
            // System.out.println(funcionario.getNome());
            if (funcionarios.get(i).getSalarioAnual() > 50000 && funcionarios.get(i).getIdade() < 30) {
                System.out.println(funcionarios.get(i).getNome());
            }
        }
    }
}
