public class Main {
    public static void main(String[] args) {

       Balao b1 = new Balao(1, "sim","vermelho","grande",200.0,200.0,"grande porte",10);
        Pessoa pessoa = new Pessoa();
       String resultado = b1.voar(new Combustivel());
        System.out.println(resultado);
    }
}