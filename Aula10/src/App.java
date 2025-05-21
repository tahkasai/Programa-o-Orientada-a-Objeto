public class App {
    public static void main(String[] args) throws Exception {
        Professor p1 = new Professor("Tainá Kasai",123);
        Professor p2 = new Professor("Gabrilele Monteiro",231);
        Professor p3 = new Professor("Talita Sabine",321);

        Departamento colegiado = new Departamento("ads", 1);

        colegiado.adicionarProfessor(p1);
        colegiado.adicionarProfessor(p2);
        colegiado.adicionarProfessor(p3);

        colegiado.listarProfessor();
    }
}
