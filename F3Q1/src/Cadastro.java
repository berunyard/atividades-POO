/* (b) Implemente a classe Cadastro. A classe Cadastro deve ter dois atributos: um vetor de funcionários e
um contador de funcionários cadastrados. Cada objeto da classe Cadastro deverá ter capacidade de
armazenar os dados de, no máximo, 1000 funcionários. Esta classe deverá ter os seguintes métodos:
(i) Um construtor. Lembrete: O vetor de Funcionários deve ser criado no construtor da classe
Cadastro. */
public class Cadastro {
    int cF;
    Funcionario vFuncionario[] = new Funcionario[cF];
    

    public Cadastro(Funcionario[] vFuncionario, int cF) {
        this.vFuncionario = vFuncionario;
        this.cF = cF;
    }

    
}
