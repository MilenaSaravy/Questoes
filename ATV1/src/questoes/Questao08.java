package questoes;

import java.util.Scanner;

public class Questao08 extends Questao {
    private final double precoFabrica;

    public Questao08(Scanner scanner) {
        System.out.print("Digite o preço do carro de fábrica: ");
        this.precoFabrica = scanner.nextDouble();
    }

    @Override
    public void executar() {
        double precoFinal = precoFabrica;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Opções de personalização:");
        System.out.println("a) Ar-condicionado (R$ 1750,00)");
        System.out.println("b) Pintura Metálica (R$ 800,00)");
        System.out.println("c) Vidro Elétrico (R$ 1200,00)");
        System.out.println("d) Direção Hidráulica (R$ 2000,00)");

        System.out.print("Escolha as opções desejadas: ");
        String opcao = scanner.nextLine();

        if (opcao.contains("a")) {
            precoFinal += 1750;
        }
        if (opcao.contains("b")) {
            precoFinal += 800;
        }
        if (opcao.contains("c")) {
            precoFinal += 1200;
        }
        if (opcao.contains("d")) {
            precoFinal += 2000;
        }

        System.out.printf("Preço final do carro: R$ %.2f%n", precoFinal);
    }
}
