import java.util.Scanner;

public class AppPolimorfismo {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);

        String titulo, titulo2, titulo3, autor, edicao;
        int op, anoPubli, anoPubli2, anoPubli3, numCopias, numCopias2, numCopias3, duracao;

        System.out.println("Digite...");
        System.out.println("1 - Para registrar um livro.");
        System.out.println("2 - Para registrar um DVD.");
        System.out.println("3 - Para registrar uma revista.");
        op = Integer.parseInt(in.nextLine());

        switch (op) {
            case 1:
                System.out.println("\n- LIVRO -");
                System.out.println("Informe o título do livro:");
                titulo = in.nextLine();
                System.out.println("Informe o ano de publicação do livro:");
                anoPubli = Integer.parseInt(in.nextLine());
                System.out.println("Informe o número de cópias do livro:");
                numCopias = Integer.parseInt(in.nextLine());
                System.out.println("Informe o autor do livro:");
                autor = in.nextLine();
                System.out.println("\n");
                Livro livro = new Livro(titulo, anoPubli, numCopias, autor);
                System.out.println(livro.toString());
                break;

            case 2:
                System.out.println("\n- DVD -");
                System.out.println("Informe o título do DVD:");
                titulo2 = in.nextLine();
                System.out.println("Informe o ano de publicação do DVD:");
                anoPubli2 = Integer.parseInt(in.nextLine());
                System.out.println("Informe o número de cópias do DVD:");
                numCopias2 = Integer.parseInt(in.nextLine());
                System.out.println("Informe a duração do DVD (em minutos):");
                duracao = Integer.parseInt(in.nextLine());
                System.out.println("\n");
                DVD dvd = new DVD(titulo2, anoPubli2, numCopias2, duracao);
                System.out.println(dvd.toString());
                break;

            case 3:
                System.out.println("\n- REVISTA -");
                System.out.println("Informe o título da revista:");
                titulo3 = in.nextLine();
                System.out.println("Informe o ano de publicação da revista:");
                anoPubli3 = Integer.parseInt(in.nextLine());
                System.out.println("Informe o número de cópias da revista:");
                numCopias3 = Integer.parseInt(in.nextLine());
                System.out.println("Informe a edição da revista:");
                edicao = in.nextLine();
                System.out.println("\n");
                Revista revista = new Revista(titulo3, anoPubli3, numCopias3, edicao);
                System.out.println(revista.toString());
                break;

            default:
                System.out.println("Não foi possível executar o programa. Insira uma opção válida.");
                break;
        }
    }
}
