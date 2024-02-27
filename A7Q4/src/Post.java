package Q4;
public class Post {
    private String texto;
    private String link;
    private int numCurtidas;
    private int numCompartilhamentos;

    public int getNumCurtidas() {
        return numCurtidas;
    }

    public void setNumCurtidas(int numCurtidas) {
        this.numCurtidas = numCurtidas;
    }

    public int getNumCompartilhamentos() {
        return numCompartilhamentos;
    }

    public void setNumCompartilhamentos(int numCompartilhamentos) {
        this.numCompartilhamentos = numCompartilhamentos;
    }

    public Post(String texto, String link) {
        this.texto = texto;
        this.link = link;
    }

    public void curtir() {
        numCurtidas++;
    }

    public void compartilhar(){
        numCompartilhamentos++;
    }
}
