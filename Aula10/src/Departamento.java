import java.util.List;

public class Departamento{

    private String nomeDepartamento;
    private int id;
    private List<Professor> professores;
    
    public Departamento(){

    }

    public Departamento(String nomeDepartamento, int id) {
        this.nomeDepartamento = nomeDepartamento;
        this.id = id;
        // this.professores = professores;
    }

    public void adicionarProfessor(Professor professor){
        professores.add(professor);
    }

    public void removerProfessor(Professor professor){
        professores.remove(professor);
    }

    public void listarProfessor(){
        for(Professor professor : professores){
            professor.exibir();
        }
    }

    public String getNomeDepartamento() {
        return nomeDepartamento;
    }

    public int getId() {
        return id;
    }

    public List<Professor> getProfessores() {
        return professores;
    }

    

}