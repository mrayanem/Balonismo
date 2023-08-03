public class Main {
    public static void main(String[] args) {

       Balao b1 = new Balao(1, "sim","vermelho","grande",200.0,200.0,"grande porte",10);
       Pessoa pessoa = new Pessoa("julia",1234567,"x939409",11999999,190,"sim","rua mercurio jardim paraiso");
       Combustivel combustivel = new Combustivel("óleo",5.50,10.50,"dissel");
       String resultado = b1.voar(new Combustivel());
       System.out.println(resultado);
    }
}