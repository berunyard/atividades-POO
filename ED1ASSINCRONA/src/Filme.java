public class Filme implements Comparable<Filme> {
    private String titulo;
    private String genero;
    private String classificacao;
    private int ano;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(String classificacao) {
        this.classificacao = classificacao;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public Filme(String titulo, String genero, String classificacao, int ano) {
        this.titulo = titulo;
        this.genero = genero;
        this.classificacao = classificacao;
        this.ano = ano;
    }

    @Override
    public int compareTo(Filme outro) {
        return this.titulo.compareTo(outro.titulo);
    }

    @Override
    public String toString() {
        return "Filme: \n" +
                "Título: " + titulo + "\n" +
                "Gênero: " + genero + "\n" +
                "Classificação: " + classificacao + "\n" +
                "Ano: " + ano +
                "\n";
    }

    public Object getDescricao() {
        return null;
    }

    public Filme getInfo() {
        return null;
    }
}