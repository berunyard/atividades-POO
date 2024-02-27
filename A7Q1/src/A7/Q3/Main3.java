package Q3;
public class Main3 {
    public static void main(String[] args) throws Exception {
        Lutador l1 = new Lutador("Ryu", 100, 10);
        Lutador l2 = new Lutador("Bison", 100, 12);
        l1.aplicarGolpe(l2);
        l1.aplicarGolpe(l2);
        l1.aplicarGolpe(l2);
        System.out.println(l2.getEnergia());
    }
}
