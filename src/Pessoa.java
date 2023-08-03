public class Pessoa {

    private String nome;
    private int cpf;
    private String rg;
    private double telefone;
    private int emergencia;
    private String assinaturaTermo;
    private String endereco;



    public Pessoa(){

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public double getTelefone() {
        return telefone;
    }

    public void setTelefone(double telefone) {
        this.telefone = telefone;
    }

    public int getEmergencia() {
        return emergencia;
    }

    public void setEmergencia(int emergencia) {
        this.emergencia = emergencia;
    }

    public String getAssinaturaTermo() {
        return assinaturaTermo;
    }

    public void setAssinaturaTermo(String assinaturaTermo) {
        this.assinaturaTermo = assinaturaTermo;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    //métodos

    public void falar(){
        System.out.println("conversei");
    }
    public void pagar(){
        System.out.println("paguei passeio");
    }
    public void voar(){
        System.out.println("voei no balão");
    }
}
