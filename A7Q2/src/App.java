package Q2;
public class Main1 {
    public static void main(String[] args) throws Exception {
        Endereco end = new Endereco("Rua Bianor de Medeiros", 35, "Apto 501", "Casa Forte", "Recife", "PE", "52061-120");
        Medico med = new Medico("123", "Catarina", 'F', "Psiquiatra", end);
        System.out.println(end.toString());
        System.out.println(med.toString());

        end.modificarEnd("Rua Sei La Santos", 666, "Apto 420", "Pina", "Porto Alegre", "RS", "52020-020");
        med.medicoNovo("456", "Jacilda", 'F', "Geriatra", end);
        System.out.println(end.toString());
        System.out.println(med.toString());
    }
}
