package Q5;
public class Main5 {
    public static void main(String[] args) throws Exception {
        Aluno a1 = new Aluno("Bernardo", "128.526.333-50");
        a1.setNota1(10);
        a1.setNota2(8);
        a1.setNota3(4);
        a1.setNota4(6);
        System.out.println("Media nº1: " + a1.calcularMedia());
        a1.setNota2(6);
        System.out.println("Nova média: " + a1.calcularMedia());
    }
}
