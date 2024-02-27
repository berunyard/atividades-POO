import java.util.HashSet;
import java.util.Scanner;

public class TesteHashSetCPF {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);

        String cpf;
        HashSet<String> cpfs = new HashSet<String>();

        for (int i = 0; i < 10; i++){
        System.out.println("Digite um CPF: ");
        cpf = in.nextLine();
        cpfs.add(cpf);
        }
        System.out.println(cpfs);
        
    }
}
