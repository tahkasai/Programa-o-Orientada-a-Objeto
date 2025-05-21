import java.util.ArrayList;
import java.util.List;

public class Casa {
    private Endereco endereco; //  1 para 1
    private List<Comodo> comodos; // composição

    //public Casa(){

    //}

    /* composição é obrigatório ter sua parte
     * não é recomendado ter construtores vazios
     * é necessário colocar o if-else para validação
     * todo(casa) - parte (comodos)
     * comodos pode existir sem casa
     * casa não pode existir sem comodos
    */

    public Casa(List<Comodo> comodos) {        
        if (comodos == null || comodos.size()==0 || comodos.isEmpty()){
            System.out.println("Necessário ter pelo menos umm comodo");
        } else {
            this.comodos = new ArrayList<>(comodos);
        }
    }

    public void adicionarComodo(Comodo comodo){
        comodos.add(comodo);
    }

    public void removerComodo(Comodo comodo){
        comodos.remove(comodo);
    }

    public void listarComodo(){
        for(Comodo comodo: comodos){
            comodo.exibirComodo();
        }
    }
}
