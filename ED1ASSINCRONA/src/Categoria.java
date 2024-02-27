public class Categoria implements Comparable<Categoria> {
    private String descricao; 
    private ListaFilmes lista;

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public ListaFilmes getLista() {
        return lista;
    }

    public void setLista(ListaFilmes lista) {
        this.lista = lista;
    }

    public Categoria(String descricao) {
        this.descricao = descricao;
        this.lista = new ListaFilmes();
    }

    @Override
    public int compareTo(Categoria outra) {
        return this.descricao.compareTo(outra.descricao);
    }

    @Override
    public String toString() {
        return "< Categoria: \n" +
                "Descrição: " + descricao +
                ">\n";
    }
}