public class Caneta {
    String modelo, cor;
    double ponta;
    int carga;
    boolean tampado;

    // o this se refere ao objeto que chama o método;
    void status(){
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Cor: " + this.cor);
        System.out.println("Ponta " + this.ponta);
        System.out.println("Carga: " + this.carga);
        System.out.println("Está tampada? " + this.tampado);
    }
    void escrever(){
        if(this.tampado == true){
            System.out.println("Só é possível escrever com a caneta destampada.");
        }
        else{
            System.out.println("Escrevendo........");
        }
    }
    void tampar(){
        if (this.tampado == true){
            System.out.println("Caneta já tampada.");
        }
        else{
            this.tampado = true;
            System.out.println("A caneta agora está tampada.");
            System.out.println("Caneta tampada? " + this.tampado);
        }
    }
    void destampar(){
        if (this.tampado == false){
            System.out.println("Caneta já destampada.");
        }
        else{
            this.tampado = false;
            System.out.println("A caneta agora está destampada.");
            System.out.println("Caneta tampada? " + this.tampado);
        }
    }
}
