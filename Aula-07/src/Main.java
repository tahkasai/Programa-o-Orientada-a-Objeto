public class Main {
    public static void main(String[] args) {
        // conversão de variáveis

        String st, st2;
        float real, real2;
        int n1, n2;

        // String para real
        st = "12";
        real = (float) (new Float(st).floatValue());
        System.out.println("String para float: "+real);

        // Double para String
        real2 = 12;
        st2 = new Float(real2).toString();

        // String para Int
        st2 = "10";
        n1= Integer.parseInt(st2);

        // Int pra String
        n2=10;
        st2=Integer.toString(n2);

    }
}