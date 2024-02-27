package Q3;
public class Lutador {
    private String nome;
    private int energia;

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

    private int força;

    public Lutador(String nome, int energia, int força) {
        this.nome = nome;
        this.energia = energia;
        this.força = força;
    }

    public void reduzirEnergia(Lutador l2) {
        this.energia = this.energia - this.força;
    }

    public void aplicarGolpe(Lutador l2) {
        reduzirEnergia(l2);
    }
}
