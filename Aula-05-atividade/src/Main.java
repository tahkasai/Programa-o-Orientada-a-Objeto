import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // instanciando a classe ou criar o objeto
        CorpoHumano obj = new CorpoHumano(0,0);

        obj.setMassa(10);
        obj.setVolume(2);
        // Qual a ocorrência?
        // R.: Deu erro no código
        // Qual a conclusão sobre o que aconteceu?
        // R.: O metodo ficou privado e nisso é invisivel (ou oculto)

        // obj.massa = 10;
            // Qual a ocorrência?
            // R.: Deu erro no código
            // Qual a conclusão sobre o que aconteceu?
            // R.: O atributo está sendo acessado de forma direta, mas está como private
        System.out.println(obj.getDensidade());
        System.out.println(obj.getMassa());
        // obj.massa = 20;
            // Qual a ocorrência?
            // R.: Não deu erro no código
            // qual a conclusão sobre o que aconteceu?
            // R.: O atributo em público é acessível para todos

    }
}