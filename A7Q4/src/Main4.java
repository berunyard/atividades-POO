package Q4;
public class Main4 {
    public static void main(String[] args) throws Exception {
        Post post1 = new Post("Não lembro!", "https://ranfren.neocities.org/");
        post1.curtir();
        post1.curtir();
        post1.curtir();
        System.out.println(post1.getNumCurtidas() + " Curtidas");
        post1.compartilhar();
        post1.compartilhar();
        System.out.println(post1.getNumCompartilhamentos() + " Compartilhamentos");
    }
}
