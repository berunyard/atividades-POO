public class NodeSecundaria implements Comparable<NodeSecundaria> {
    private NodeSecundaria ante;
    private Filme info;
    private NodeSecundaria prox;

    public NodeSecundaria getAnte() {
        return ante;
    }

    public void setAnte(NodeSecundaria ante) {
        this.ante = ante;
    }

    public Filme getInfo() {
        return info;
    }

    public void setInfo(Filme info) {
        this.info = info;
    }

    public NodeSecundaria getProx() {
        return prox;
    }

    public void setProx(NodeSecundaria prox) {
        this.prox = prox;
    }

    public NodeSecundaria(Filme info) {
        this.info = info;
    }

    @Override
    public int compareTo(NodeSecundaria outro) {
        return this.info.compareTo(outro.getInfo());
    }

}
