public class DVD extends ItemBiblioteca {
    private int duracao;

    public DVD(String titulo, int anoPublicado, int copiasDisponiveis, int duracao) {
        super(titulo, anoPublicado, copiasDisponiveis);
        this.duracao = duracao;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    @Override
    public void calcular_multa(int qtdDias) {
        double multa;
        multa = qtdDias * 0.4;
        System.out.println("Sua multa é de R$" + multa + ".");
    }

    @Override
    public String toString() {
        return super.toString() + "\nDuração (em minutos): " + this.duracao + "\n";
    }
}
