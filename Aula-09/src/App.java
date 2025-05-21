import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        endereco casa = new endereco("rua ABC", "Jardim ABC", "Itaim", "08000500", "casa", "SP", 20);

        contato celular = new contato("celular", 999992233, 11);
        contato residencial = new contato("residencial", 25, 11);

        List<contato> contatos = new ArrayList<>();
        contatos.add(residencial);
        contatos.add(celular);

        //Criar o aluno
        
        // Calendar data = new Calendar.getInstance();
        // data.set(2001, Calendar.MAY, 17);
        // Date dataNascimento = data.getTime();
            
        aluno a = new  aluno ("Gabi","Feminino","123",1,LocalDate.of(2002, 9, 28), casa, contatos); 

        System.out.println(a.getNome());
        System.out.println(a.getEndereco().getRua());


    }
}
