package models;

public class Aluno {
    private String nome, curso, semestre, dataNasc;
    private int ra;
    private boolean situacao; // ou status

    // Não permite construtores iguais, então caso um construtor seja string e string, os outros não podem ser o mesmo
    // Mas, se for int e String, e o próximo String e int pode

    public Aluno() {
        // construtor vazio
    }

    public Aluno(String nome, String curso, String semestre, String dataNasc, int ra, boolean situacao) {
        this.nome = nome;
        this.curso = curso;
        this.semestre = semestre;
        this.dataNasc = dataNasc;
        this.ra = ra;
        this.situacao = situacao;
    }

    public Aluno(String nome, String curso) {
        // construtor dinamico com 1 e 2 parametros em String
        this.nome = nome;
        this.curso = curso;
    }

//    public Aluno(String dataNasc, String Semestre){
//        // erro pois é igual ao tipos de parametro de cima
//    }

    public Aluno(String nome, boolean situacao) {
        this.nome = nome;
        this.situacao = situacao;
    }

    public Aluno(String nome, int ra) {
        this.nome = nome;
        this.ra = ra;
    }

    public Aluno(int ra, String nome) {
        this.ra = ra;
        this.nome = nome;
    }

    public Aluno(int ra, String nome, String dataNasc) {
        this.nome = nome;
        this.ra = ra;
        this.dataNasc = dataNasc;
    }
    
}
