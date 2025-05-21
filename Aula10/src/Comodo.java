public class Comodo {
    private String nome;
    private double area;
    
    public Comodo(String nome, double area) {
        this.nome = nome;
        this.area = area;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getArea() {
        return area;
    }
    public void setArea(double area) {
        this.area = area;
    }
    public void exibirComodo(){
        System.out.println("Nome: "+nome);
        System.out.println("Área:"+area);
    }
}
