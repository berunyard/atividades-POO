import java.util.ArrayList;
// import java.util.Scanner;

public class AppCirculo {
    public static void main(String[] args) throws Exception {
        // Scanner in = new Scanner(System.in);

        Circulo c1 = new Circulo(1);
        Circulo c2 = new Circulo(2);
        Circulo c3 = new Circulo(3);
        Circulo c4 = new Circulo(4);
        Circulo c5 = new Circulo(5);
        c1.calcularArea();
        c2.calcularArea();
        c3.calcularArea();
        c4.calcularArea();
        c5.calcularArea();
        ArrayList<Double> listaCirculos = new ArrayList<Double>();
        listaCirculos.add(c1.getArea());
        listaCirculos.add(c2.getArea());
        listaCirculos.add(c3.getArea());
        listaCirculos.add(c4.getArea());
        listaCirculos.add(c5.getArea());
        System.out.println(listaCirculos);

    }
}
