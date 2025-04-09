public class CorpoHumano {
    // definindo variaveis

    private float massa;
    private float volume;
    private float densidade;
    private float altura;
    private float peso;

    // ou definir dados
    // private float massa, volume, densidade;

    // o construtor é utilizado para atribuir os valores para todos os atributos de uma vez, sem precisar o setter, de variável por variável
    public CorpoHumano(float massa, float volume, float peso, float altura) {
        this.massa = massa;
        this.volume = volume;
        this.peso = peso;
        this.altura = altura;
        this.densidade = massa/volume;
        // a densidade seá alterada assim que tiver a massa e o volume
    }
    private void CalcularDensidade(){
        if (massa>0 && volume>0){
            this.densidade = this.massa / this.volume;
        }
    }
    public float CalcularIMC(){
        if (altura>0 && volume>0){
            return peso/(altura*altura);
        }else{
            return 0;
        }
    }

    //Setters: atribuir valores aos atributos
    // void não é obrigatório o return
    public void setMassa(float massa) {
        this.massa = massa;
        CalcularDensidade();
    }

    public void setVolume(float volume) {
        this.volume = volume;
        CalcularDensidade();
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    // Getters: recuperar valores dos atributos
    // return se torna obrigatório a metodos que possuem um tipo de dado
    public float getMassa() {
        return this.massa;
    }

    public float getVolume() {
        return this.volume;
    }

    public float getDensidade() {
        return this.densidade;
    }



}
