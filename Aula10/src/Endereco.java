public class Endereco {
    private String lougradouro,cidade,bairro;

    public Endereco(String lougradouro, String cidade, String bairro) {
        this.lougradouro = lougradouro;
        this.cidade = cidade;
        this.bairro = bairro;
    }

    public String getLougradouro() {
        return lougradouro;
    }

    public void setLougradouro(String lougradouro) {
        this.lougradouro = lougradouro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }
}
