import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        int flag = 0, o = 6, pos = 0, rt;
        String[] vNomes = new String[100];
        String nome, nome2;

        while (o != 0) {
            System.out.println("Opções disponíveis: ");
            System.out.println("1 - Cadastar novo nome");
            System.out.println("2 - Exibir todos os nomes");
            System.out.println("3 - Ordenar crescente");
            System.out.println("4 - Ordenar decrescente");
            System.out.println("5 - Realizar busca");
            System.out.println("0 - Sair do programa");
            System.out.print("Informe a opção desejada: ");
            o = in.nextInt();

            // adicionar novo nome ao vetor principal;
            if (o == 1) {
                System.out.println("Nome " + (pos + 1) + ": ");
                System.out.print("Informe o nome: ");
                nome = in.next();
                rt = InsercaoNomes(vNomes, pos, nome);
                if (rt == 1) {
                    pos++;
                    flag = 1;
                    System.out.println("A inserção foi realizada.");
                } else if (rt == -1) {
                    System.out.println("Vetor cheio. Inserção não realizada.");
                } else {
                    System.out.println("Nome repetido. Inserção não realizada.");
                }
            }

            // exibir o vetor principal;
            if (o == 2) {
                ExibirNomes(vNomes, pos);
            }

            if (o == 3) {
                ordenarCrescente(vNomes, pos);
                flag = 2;
                System.out.println("A ordenação de forma crescente foi realizada.");
            }

            if (o == 4) {
                ordenarDecrescente(vNomes, pos);
                flag = 3;
                System.out.println("A ordenação de forma decrescente foi realizada.");
            }

            if (o == 5) {
                System.out.println("Informe um nome para ser procurado: ");
                nome2 = in.next();
                Busca(vNomes, pos, nome2, flag);
            }
        }

    }

    public static int InsercaoNomes(String vNomes[], int i, String novoNome) {
        int ii, rt;
        for (ii = 0; ii < i; ii++) {
            if (vNomes[ii].equals(novoNome)) {
                rt = -2;
                return rt;
            }
        }
        if (i >= vNomes.length - 1) {
            rt = -1;
        } else {
            vNomes[i] = novoNome;
            rt = 1;
        }
        return rt;
    }

    public static void ExibirNomes(String vNomes[], int i) {
        int ii;
        for (ii = 0; ii < i; ii++) {
            System.out.println(vNomes[ii]);
        }
    }

    public static void ordenarCrescente(String vNomes[], int pos) {
        int i, j;
        String chave;
        int fim = pos - 1;
        for (i = 1; i <= fim; i++) {
            chave = vNomes[i];
            j = i - 1;
            while (j >= 0 && vNomes[j].compareTo(chave) > 0) {
                vNomes[j + 1] = vNomes[j];
                j = j - 1;
            }
            vNomes[j + 1] = chave;
        }
    }

    public static void ordenarDecrescente(String vNomes[], int pos) {
        int i, j, m;
        String ii;
        int fim;
        fim = pos - 1;
        for (i = 0; i < fim; i++) {
            m = i;
            for (j = i + 1; j <= fim; j++) {
                if (vNomes[m].compareTo(vNomes[j]) < 0) {
                    m = j;
                }
            }
            ii = vNomes[i];
            vNomes[i] = vNomes[m];
            vNomes[m] = ii;
        }
    }

    public static void Busca(String v[], int pos, String nome, int flag) {
        int rt;
        if (flag == 1) {
            rt = BSSimples(v, nome, pos);
            if (rt == -1) {
                System.out.println("Erro na busca. O nome não está na lista.");
            } else {
                System.out.println("Nome na posição " + (rt + 1));
            }
        } else if (flag == 2) {
            rt = BB(v, nome, pos);
            if (rt == -1) {
                System.out.println("Erro na busca. O nome não está na lista.");
            } else {
                System.out.println("Nome na posição " + (rt + 1));
            }
        } else if (flag == 3) {
            rt = BBDecrescente(v, nome, pos);
            if (rt == -1) {
                System.out.println("Erro na busca. O nome não está na lista.");
            } else {
                System.out.println("Nome na posição " + (rt + 1));
            }
        } else {
            System.out.println("Erro. Flag não inicializada.");
        }
    }

    public static int BSSimples(String v[], String p, int pos) {
        int i;
        boolean achou = false;
        for (i = 0; i < pos; i++) {
            if (v[i] == p) {
                achou = true;
                break;
            }
        }
        if (achou == true) {
            return i;
        } else {
            return -1;
        }
    }

    public static int BB(String v[], String p, int pos) {
        int inicio = 0, meio, fim = pos - 1;
        boolean achou = false;
        do {
            meio = (inicio + fim) / 2;
            if (p.equals(v[meio])) {
                achou = true;
                break;
            } else if (p.compareTo(v[meio]) < 0) {
                fim = meio - 1;
            } else {
                inicio = meio + 1;
            }
        } while (inicio <= fim);
        if (achou == true) {
            return meio;
        } else {
            return -1;
        }
    }

    public static int BBDecrescente(String v[], String p, int pos) {
        int inicio = 0, meio, fim = pos - 1;
        boolean achou = false;
        do {
            meio = (inicio + fim) / 2;
            if (p.equals(v[meio])) {
                achou = true;
                break;
            } else if (p.compareTo(v[meio]) < 0) {
                inicio = meio + 1;
            } else {
                fim = meio - 1;
            }
        } while (inicio <= fim);
        if (achou == true) {
            return meio;
        } else {
            return -1;
        }
    }
}
