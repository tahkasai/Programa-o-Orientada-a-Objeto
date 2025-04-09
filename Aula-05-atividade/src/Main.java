import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // instanciando a classe ou criar o objeto
        CorpoHumano obj = new CorpoHumano(0,0,82,1.75f);

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
        System.out.println("Pessoa 1");
        System.out.println("Massa: "+obj.getMassa());
        System.out.println("Volume: "+obj.getVolume());
        System.out.println("Densidade: "+obj.getDensidade());
        System.out.println("---------------------");
        System.out.println("IMC: "+obj.CalcularIMC());
        System.out.println();

        CorpoHumano obj2 = new CorpoHumano(45,15,60,1.63f);
        System.out.println("Pessoa 2");
        System.out.println("Massa: "+obj2.getMassa());
        System.out.println("Volume: "+obj2.getVolume());
        System.out.println("Densidade: "+obj2.getDensidade());
        System.out.println("---------------------");
        System.out.println("IMC: "+obj2.CalcularIMC());
        // obj.massa = 20;
            // Qual a ocorrência?
            // R.: Não deu erro no código
            // qual a conclusão sobre o que aconteceu?
            // R.: O atributo em público é acessível para todos

    }
}