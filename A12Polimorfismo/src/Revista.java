public class Revista extends ItemBiblioteca {
    private String edicao;

    public Revista(String titulo, int anoPublicado, int copiasDisponiveis, String edicao) {
        super(titulo, anoPublicado, copiasDisponiveis);
        this.edicao = edicao;
    }

    public String getEdicao() {
        return edicao;
    }

    public void setEdicao(String edicao) {
        this.edicao = edicao;
    }

    @Override
    public void calcular_multa(int qtdDias) {
        double multa;
        multa = qtdDias * 0.5;
        System.out.println("Sua multa é de R$" + multa + ".");
    }

    @Override
    public String toString() {
        return super.toString() + "\nEdição: " + this.edicao + "\n";
    }
}
