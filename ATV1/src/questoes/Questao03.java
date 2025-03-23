package questoes;

import java.util.Scanner;

public class Questao03 extends Questao {
    private final double temperaturaCelsius;

    public Questao03(Scanner scanner) {
        System.out.print("Digite a temperatura em Celsius: ");
        this.temperaturaCelsius = scanner.nextDouble();
    }

    private double converterParaFahrenheit() {
        return (temperaturaCelsius * 1.8) + 32;
    }

    @Override
    public void executar() {
        System.out.printf("Temperatura em Fahrenheit: %.2f%n", converterParaFahrenheit());
    }
}