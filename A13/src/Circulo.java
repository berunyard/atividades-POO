public class Circulo {
    private double area;

    public Circulo(double raio) {
        this.raio = raio;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    private double raio;

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double calcularArea() {
        this.area = Math.PI * Math.pow(raio, 2);
        return this.area;
    }
}
