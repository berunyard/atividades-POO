public class App {
    public static void main(String[] args) throws Exception {
        Caneta c1 = new Caneta();
        c1.carga = 1;
        c1.ponta = 0.7;
        c1.cor = "Verde";
        c1.tampado = false;

        c1.status();
        System.out.println();
        c1.escrever();
        c1.tampar();
        c1.escrever();
        c1.destampar();

        System.out.println();
        Caneta c2 = new Caneta();
        c2.carga = 2;
        c2.ponta = 0.5;
        c2.cor = "Azul";
        c2.tampado = true;

        c2.status();
        System.out.println();
        c2.escrever();
        c2.destampar();
        c2.escrever();
    }
}
