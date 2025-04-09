public class CorpoHumano {
    // definindo variaveis

    private float massa;
    private float volume;
    private float densidade;

    // ou definir dados
    // private float massa, volume, densidade;

    // o construtor é utilizado para atribuir os valores para todos os atributos de uma vez, sem precisar o setter, de variável por variável
    public CorpoHumano(float massa, float volume) {
        this.massa = massa;
        this.volume = volume;
        this.densidade = massa/volume;
        // a densidadee seá alterada assim que tiver a massa e o volume
    }

    //Setters: atribuir valores aos atributos
    // void não é obrigatório o return
    public void setMassa(float massa) {
        this.massa = massa;
        this.densidade = massa/volume;
    }

    public void setVolume(float volume) {
        this.volume = volume;
        this.densidade = massa/volume;
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
