package questoes;

import java.util.Scanner;

public class Questao09 extends Questao {
    private final double consumo;
    private final String tipoConsumidor;

    public Questao09(Scanner scanner) {
        System.out.print("Digite o tipo de consumidor (residencial, comercial, industrial): ");
        this.tipoConsumidor = scanner.next();
        System.out.print("Digite o consumo de água (m3): ");
        this.consumo = scanner.nextDouble();
    }

    private Double calcularConta() {
        switch (tipoConsumidor) {
            case "residencial":
                return calcularContaResidencial();
            case "comercial":
                return calcularContaComercial();
            case "industrial":
                return calcularContaIndustrial();
            default:
                System.out.println("Tipo de consumidor inválido.");
                return null; 
        }
    }

    private double calcularContaResidencial() {
        return 5 + (consumo * 0.05);
    }

    private double calcularContaComercial() {
        if (consumo <= 80) {
            return 500;
        } else {
            return 500 + (consumo - 80) * 0.25;
        }
    }

    private double calcularContaIndustrial() {
        if (consumo <= 100) {
            return 800;
        } else {
            return 800 + (consumo - 100) * 0.04;
        }
    }

    @Override
    public void executar() {
        Double valorConta = calcularConta();

        if (valorConta != null) {
            System.out.printf("A conta de água é R$ %.2f%n", valorConta);
        } else {
            System.out.println("Erro no cálculo da conta.");
        }
    }
}
