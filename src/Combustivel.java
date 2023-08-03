public class Combustivel {

    //atrubutos

    String componentes;
    double precoLitro;
    double precoQuilo;
    String nome;

    public Combustivel(String componentes, double precoLitro, double precoQuilo, String nome) {
        this.componentes = componentes;
        this.precoLitro = precoLitro;
        this.precoQuilo = precoQuilo;
        this.nome = nome;
    }

    public Combustivel(){

    }

    public String getComponentes() {
        return componentes;
    }

    public void setComponentes(String componentes) {
        this.componentes = componentes;
    }

    public double getPrecoLitro() {
        return precoLitro;
    }

    public void setPrecoLitro(double precoLitro) {
        this.precoLitro = precoLitro;
    }

    public double getPrecoQuilo() {
        return precoQuilo;
    }

    public void setPrecoQuilo(double precoQuilo) {
        this.precoQuilo = precoQuilo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
