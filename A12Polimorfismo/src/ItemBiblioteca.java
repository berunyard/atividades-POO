public abstract class ItemBiblioteca {
    private String titulo;
    private int anoPublicado;
    private int copiasDisponiveis;

    public ItemBiblioteca(String titulo, int anoPublicado, int copiasDisponiveis) {
        this.titulo = titulo;
        this.anoPublicado = anoPublicado;
        this.copiasDisponiveis = copiasDisponiveis;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnoPublicado() {
        return anoPublicado;
    }

    public void setAnoPublicado(int anoPublicado) {
        this.anoPublicado = anoPublicado;
    }

    public int getCopiasDisponiveis() {
        return copiasDisponiveis;
    }

    public void setCopiasDisponiveis(int copiasDisponiveis) {
        this.copiasDisponiveis = copiasDisponiveis;
    }

    public abstract void calcular_multa(int qtdDias);

    public String toString() {
        return "\nTítulo: " + this.titulo + "\nAno Publicado: " + this.anoPublicado
                + "\nCópias Disponíveis: " + this.copiasDisponiveis;
    }
}
