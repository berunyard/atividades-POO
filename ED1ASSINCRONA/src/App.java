import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        int opcao;
        ListaFilmes listaFilmes = new ListaFilmes();
        do {
            exibirMenu();
            System.out.print("Escolha uma opção: ");
            opcao = in.nextInt();
            in.nextLine();

            switch (opcao) {
                case 1:
                    String titulo, genero, classi;
                    int ano;
                    System.out.println("1. Cadastar novo filme: ");
                    System.out.println("Insira seu título: ");
                    titulo = in.nextLine();
                    in.nextLine();
                    System.out.println("Insira seu gênero: ");
                    genero = in.nextLine();
                    in.nextLine();
                    System.out.println("Insira sua classificação: ");
                    classi = in.nextLine();
                    in.nextLine();
                    System.out.println("Insira seu ano de lançamento: ");
                    ano = in.nextInt();
                    in.nextLine();
                    Filme newFilme = new Filme(titulo, genero, classi, ano);
                    listaFilmes.adicionarFilme(newFilme);
                    break;
                case 2:
                    removerFilme();
                    break;
                case 3:
                    System.out.println("Opção 3 escolhida: Exibir dados de um filme.");
                    exibirDadosFilme();
                    break;
                case 4:
                    editarFilme();
                    break;
                case 5:
                    System.out.println("Opção 5 escolhida: Exibir todos os filmes.");
                    listaFilmes.exibirFilmes();
                    break;
                case 6:
                    exibirFilmesPorCategoria();
                    listaFilmes.exibirFilmes();
                    break;
                case 0:
                    System.out.println("Programa encerrado.");
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        } while (opcao != 0);
    }

    private static void exibirMenu() {
        System.out.println("\nMenu: ");
        System.out.println("1 - Cadastrar novo filme.");
        System.out.println("2 - Remover filme.");
        System.out.println("3 - Exibir dados de um filme.");
        System.out.println("4 - Editar dados de um filme.");
        System.out.println("5 - Exibir todos os filmes.");
        System.out.println("6 - Exibir filmes por categoria.");
        System.out.println("0 - Sair.\n");
    }

    private static void cadastrarFilme() {

    }

    private static void removerFilme() {

        System.out.println("Opção 2 escolhida: Remover filme.");
    }

    private static void exibirDadosFilme() {

    }

    private static void editarFilme() {

        System.out.println("Opção 4 escolhida: Editar dados de um filme.");
    }

    private static void exibirTodosFilmes() {

        System.out.println("Opção 5 escolhida: Exibir todos os filmes.");
    }

    private static void exibirFilmesPorCategoria() {

        System.out.println("Opção 6 escolhida: Exibir filmes por categoria.");
    }
}