package Q1;
public class App {
    public static void main(String[] args) throws Exception {
        Paciente p1 = new Paciente("123-4","Bernardo", "11/07/2002", 'H', "Unimed", 'N', "A+");
        System.out.println(p1.toString());
        p1.modificarPaciente("123-5", "Claudia", "12/07/1970", 'M', "Unimed", 'S', "A+");
        System.out.println(p1.toString());
    }
}
