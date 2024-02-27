public class ConversaoNome {
    private String nome;
    private int num;

    public ConversaoNome(String nome, int num) {
        if (num > nome.length()){
            throw new RuntimeException("Posição inválida");
        }
        this.nome = nome;
        this.num = num;
    }
}
