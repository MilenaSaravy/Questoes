package questoes;

import java.util.Scanner;

public class Questao01 extends Questao {

    private int numero1;
    private int numero2;
    private int maior;

    public Questao01(Scanner scanner) {
        System.out.print("Digite o primeiro numero inteiro: ");
        this.numero1 = scanner.nextInt();
        
        System.out.print("Digite o segundo numero inteiro: ");
        this.numero2 = scanner.nextInt();
    }

    private void encontrarMaior() {
        if (numero1 > numero2) {
            maior = numero1;
        } else {
            maior = numero2;
        }
    }

    @Override
    public void executar() {
        encontrarMaior();
        System.out.println("O maior numero é: " + maior);
    }
}
