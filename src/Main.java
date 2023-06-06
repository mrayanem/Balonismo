public class Main {
    public static void main(String[] args) {

       Balao b1 = new Balao();
       String resultado = b1.voar(new Combustivel());
        System.out.println(resultado);
    }
}