public class Balao {

    //atributos

    int id;
    String registro;
    String cor;
    String tipo;
    double altura;
    double peso;
    String porte;
    int capacidadePessoas;

    //metódos

    public String voar(Combustivel gasPropano){
        return "voando com" + gasPropano;
    }

}
