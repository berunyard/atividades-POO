import java.util.Scanner;

public class App01 {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        String nome;
        int num;
        System.out.println("Nome: ");
        nome = in.nextLine();
        System.out.println("Número: ");
        num = in.nextInt();
        System.out.println();
        
        try{
        ConversaoNome c = new ConversaoNome(nome, num);
        System.out.println(nome.charAt(num));
        }
        catch(RuntimeException e){
            System.out.println(e.getMessage());
        }
    }
}
