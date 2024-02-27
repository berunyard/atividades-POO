import java.util.ArrayList;

public class MainBiblioteca {
    public static void main(String[] args) {
        ArrayList<Livro> livros = new ArrayList<>();
        Livro livro1 = new Livro(true);
        livros.add(livro1);
        livros.add(new Livro(false));
        for (Livro livro : livros) {
            livro.pegarLivro();
        }
    }
}