public class Livro extends ItemBiblioteca {
    private String autor;

    public Livro(String titulo, int anoPublicado, int copiasDisponiveis, String autor) {
        super(titulo, anoPublicado, copiasDisponiveis);
        this.autor = autor;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public void calcular_multa(int qtdDias) {
        double multa;
        multa = qtdDias * 0.3;
        System.out.println("Sua multa é de R$" + multa + ".");
    }

    @Override
    public String toString() {
        return super.toString() + "\nAutor: " + this.autor + "\n";
    }
}
