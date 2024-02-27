public class Carro {
    private String marca;
    private String modelo;
    private int ano;
    private double velocidade;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public double getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }

    public void acelerar() {
        velocidade = velocidade + 10;
    }

    public void desacelerar() {
        while (velocidade > 0) {
            velocidade = velocidade - 10;
        }
    }
}
