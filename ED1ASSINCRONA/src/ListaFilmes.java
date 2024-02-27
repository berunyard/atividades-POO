import java.util.Scanner;

public class ListaFilmes {
    private NodeSecundaria primeiro;
    private int qtd;
    private NodeSecundaria ultimo;

    public void adicionarFilme(Filme filme) {
        NodeSecundaria novoNode = new NodeSecundaria(filme);

        if (primeiro == null) {
            primeiro = novoNode;
            ultimo = novoNode;
        } else {
            NodeSecundaria current = primeiro;

            while (current != null && filme.compareTo(current.getInfo()) > 0) {
                current = current.getProx();
            }

            if (current == primeiro) {
                primeiro = novoNode.getProx();
                novoNode = primeiro.getAnte();
                primeiro = novoNode;
            } else if (current == null) {
                novoNode = ultimo.getProx();
                ultimo = novoNode.getAnte();
                ultimo = novoNode;
            } else {
                current.setAnte(novoNode.getAnte());
                current = novoNode.getProx();
                novoNode = current.getAnte().getProx();
                novoNode = current.getAnte();
            }
        }

        qtd++;
    }

    public void removerFilme(Filme filme) {
        NodeSecundaria current = primeiro;

        while (current != null && filme.compareTo(current.getInfo()) != 0) {
            current = current.getProx();
        }

        if (current != null) {
            if (current == primeiro) {
                primeiro = primeiro.getProx();
                if (primeiro != null) {
                    primeiro.setAnte(null);
                } else {
                    ultimo = null;
                }
            } else if (current == ultimo) {
                ultimo = ultimo.getAnte();
                ultimo.setProx(null);
            } else {
                NodeSecundaria ant = current.getAnte();
                NodeSecundaria prox = current.getProx();
                ant.setProx(prox);
                prox.setAnte(ant);
            }

            qtd--;
        }
    }

    public Filme buscarFilme(String descricao) {
        NodeSecundaria current = primeiro;

        while (current != null && !descricao.equals(current.getInfo().getDescricao())) {
            current = current.getProx();
        }

        return current.getInfo();

    }

    private static Scanner in = new Scanner(System.in);
    private static ListaCategorias listaCategorias = new ListaCategorias();

    public static void editarFilme() {
        System.out.print("Informe o título do filme a ser editado: ");
        String tituloFilme = in.nextLine();

        System.out.print("Informe a categoria do filme: ");
        String categoriaDescricao = in.nextLine();

        Categoria categoria = listaCategorias.buscarCategoria(categoriaDescricao);

        if (categoria != null) {
            Filme filmeNode = categoria.getLista().buscarFilme(tituloFilme);

            if (filmeNode != null) {
                System.out.println("Dados atuais do filme:");
                System.out.println(filmeNode.getInfo());

                System.out.println("Informe os novos dados do filme:");

                System.out.print("Novo título: ");
                String novoTitulo = in.nextLine();

                System.out.print("Novo gênero: ");
                String novoGenero = in.nextLine();

                System.out.print("Nova classificação: ");
                String novaClassificacao = in.nextLine();

                System.out.print("Novo ano de lançamento: ");
                int novoAno = in.nextInt();
                in.nextLine();

                Filme novoFilme = new Filme(novoTitulo, novoGenero, novaClassificacao, novoAno);
                categoria.getLista().removerFilme(filmeNode.getInfo());
                categoria.getLista().adicionarFilme(novoFilme);

                System.out.println("Filme editado com sucesso!");
            } else {
                System.out.println("Filme não encontrado na categoria informada.");
            }
        } else {
            System.out.println("Categoria não encontrada.");
        }
    }

    public void exibirFilmes() {
        NodeSecundaria current = primeiro;

        while (current != null) {
            System.out.println(current.getInfo());
            current = current.getProx();
        }
    }
}
