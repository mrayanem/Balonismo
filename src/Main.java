
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.entities.BalaoGrande;
import model.entities.BalaoMedio;
import model.entities.BalaoPequeno;
import model.entities.Passageiro;
import model.entities.Piloto;

public class Program {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Identificação do balão: ");
        Integer identificacao = scanner.nextInt();

        System.out.print("Regularidade do balão (sim ou não): ");
        char regularidade = Character.toLowerCase(scanner.next().charAt(0));

        boolean termoDeRegularidade =regularidade == 's';
        if (!termoDeRegularidade) {
            System.out.println("Aceite os termos de risco");
            return;
        }

        System.out.print("Nome do piloto: ");
        String nomePiloto = scanner.next();
        System.out.print("CPF do piloto: ");
        Integer cpf = scanner.nextInt();
        System.out.print("Registro Anac: ");
        Integer registroAnac = scanner.nextInt();
        Piloto piloto = new Piloto(nomePiloto, cpf, registroAnac);

        List<Passageiro> passageiroslist = new ArrayList<>();
        System.out.print("Quantidade de passageiros: ");
        int qtdPassageiros = scanner.nextInt();

        for (int i = 0; i < qtdPassageiros; i++) {
            System.out.println("Dados do passageiro " + (i + 1) + ":");
            System.out.print("Nome do passageiro: ");
            String nomePassageiro = scanner.next();
            System.out.print("CPF do passageiro: ");
            Integer cpfPassageiro = scanner.nextInt();
            System.out.print("Rg do passageiro: ");
            Integer rg = scanner.nextInt();
            System.out.print("Telefone do passageiro: ");
            Integer telefone = scanner.nextInt();
            System.out.print("Telefone de um Familiar do passageiro: ");
            Integer telefoneFamiliar = scanner.nextInt();
            System.out.print("CEP do passageiro: ");
            Integer cep = scanner.nextInt();
            System.out.print("Aceita os riscos? (s/n) ");
            char riscos = Character.toLowerCase(scanner.next().charAt(0));

            boolean termoDeRisco = riscos == 's';
            if (!termoDeRisco) {
                System.out.println("Aceite os termos de risco");
                return;
            }
            Passageiro passageiro = new Passageiro(nomePassageiro, cpfPassageiro, rg, telefone,
                    telefoneFamiliar, cep, termoDeRisco);
            passageiroslist.add(passageiro);
        }

        System.out.println("Qual tamanho de balão irá querer? (p, m ou g)");
        char tamanhoBalao = Character.toLowerCase(scanner.next().charAt(0));

        switch (tamanhoBalao) {
            case 'p':
            	List<Passageiro> copiaPassageiros = new ArrayList<>(passageiroslist);

            	BalaoPequeno balaoPequeno = new BalaoPequeno(identificacao,  termoDeRegularidade, piloto);
            	for (int i = 0; i < copiaPassageiros.size(); i++) {
            	    balaoPequeno.adicionarPassageiro(copiaPassageiros.get(i));
            	}
                balaoPequeno.exibirPassageiros(passageiroslist);
                break;
            case 'm':
            	List<Passageiro> copiaPassageiros1 = new ArrayList<>(passageiroslist);

            	BalaoMedio balaoMedio = new BalaoMedio(identificacao,  termoDeRegularidade, piloto);
            	for (int i = 0; i < copiaPassageiros1.size(); i++) {
            	    balaoMedio.adicionarPassageiro(copiaPassageiros1.get(i));
            	}
                balaoMedio.exibirPassageiros(passageiroslist);
                break;
            case 'g':
                BalaoGrande balaoGrande = new BalaoGrande(identificacao, termoDeRegularidade, piloto);
                balaoGrande.adicionarPassageiros(passageiroslist);
                balaoGrande.exibirPassageiros(passageiroslist);
                break;
            default:
                System.out.println("Tamanho não existente");
                return;
        }
        System.out.println("Dados:");
        System.out.println("Piloto: ");
        System.out.println(piloto);

        scanner.close();
    }
}
