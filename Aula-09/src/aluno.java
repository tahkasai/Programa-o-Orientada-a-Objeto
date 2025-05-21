import java.time.LocalDate;
import java.util.List;

public class aluno {
    private String nome, sexo, cpf;
    private int matricula;
    private LocalDate dataNascimento;

    //dependêcia de classe
    private endereco endereco; //1 ALUNO TEM 1 ENDEREÇO
    private List<contato> contatos; //1 ALUNO TEM 1..* CONTATO
    
    //construtor vazio
    public aluno() {

    }

    //construtor 
    public aluno(String nome, String sexo, String cpf, int matricula, LocalDate dataNascimento, endereco endereco,
            List<contato> contatos) {
        this.nome = nome;
        this.sexo = sexo;
        this.cpf = cpf;
        this.matricula = matricula;
        this.dataNascimento = dataNascimento;
        this.endereco = endereco;
        this.contatos = contatos;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public void setEndereco(endereco endereco) {
        this.endereco = endereco;
    }

    public void setContatos(List<contato> contatos) {
        this.contatos = contatos;
    }

    public String getNome() {
        return nome;
    }

    public String getSexo() {
        return sexo;
    }

    public String getCpf() {
        return cpf;
    }

    public int getMatricula() {
        return matricula;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public endereco getEndereco() {
        return endereco;
    }

    public List<contato> getContatos() {
        return contatos;
    }

    //método
    public boolean validaCPF(){
        return true;
    }
}
