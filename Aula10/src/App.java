import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        //Professor p1 = new Professor("Tainá Kasai",123);
        //Professor p2 = new Professor("Gabrilele Monteiro",231);
        //Professor p3 = new Professor("Talita Sabine",321);

        //Departamento colegiado = new Departamento("ads", 1);

        //colegiado.adicionarProfessor(p1);
        //colegiado.adicionarProfessor(p2);
        //colegiado.adicionarProfessor(p3);

        //colegiado.listarProfessor();

        //System.out.println("\n Casa \n");

        List<Comodo> comodos = new ArrayList<>();
        comodos.add(new Comodo("Sala", 300));
        comodos.add(new Comodo("cozinha", 800));

        Casa casa = new Casa(comodos);

        casa.listarComodo();   

        // casa 2
        Casa casa2 = new Casa(new ArrayList<>());

    }
}
