public class contato {
    private String tipo;
    private int numero, ddd;

    //construtor vazio
    public contato() {
    }

    public contato(String tipo, int numero, int ddd) {
    this.tipo = tipo;
    this.numero = numero;
    this.ddd = ddd;
    }

    public String getTipo() {
        return tipo;
    }

    public int getNumero() {
        return numero;
    }

    public int getDdd() {
        return ddd;
    }

    public void setNumero(int numero) {
    this.numero = numero;
    }
    
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setDdd(int ddd) {
        this.ddd = ddd;
    }

    //método
    public boolean validaContato(){
        return true;
    }

    public static void add(contato residencial) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'add'");
    }
}
