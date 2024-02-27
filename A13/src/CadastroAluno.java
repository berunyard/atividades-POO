import java.util.ArrayList;

public class CadastroAluno {
    private ArrayList<Aluno> listaAlunos = new ArrayList<Aluno>();

    public ArrayList<Aluno> getListaAlunos() {
        return listaAlunos;
    }

    public void setListaAlunos(ArrayList<Aluno> listaAlunos) {
        this.listaAlunos = listaAlunos;
    }

    public void addAluno(Aluno e){
        listaAlunos.add(e);
    }

    public void printListaAlunos(){
        for (int i = 0; i < listaAlunos.size(); i++){
            System.out.println("\nMatrícula: " + listaAlunos.get(i).getMatricula() +
                    "\nNome: " + listaAlunos.get(i).getNome() +
                    "\nIdade: " + listaAlunos.get(i).getIdade() +
                    "\nCurso: " + listaAlunos.get(i).getCurso());
        }
    }
}
