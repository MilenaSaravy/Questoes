package questoes;

import java.util.Scanner;

public class Questao02 extends Questao {
    private final int baseRetanguloA;
    private final int alturaRetanguloA;
    private final int baseRetanguloB;
    private final int alturaRetanguloB;

    public Questao02(Scanner scanner) {
        System.out.print("Digite a base do retângulo A: ");
        this.baseRetanguloA = scanner.nextInt();
        
        System.out.print("Digite a altura do retângulo A: ");
        this.alturaRetanguloA = scanner.nextInt();
        
        System.out.print("Digite a base do retângulo B: ");
        this.baseRetanguloB = scanner.nextInt();
        
        System.out.print("Digite a altura do retângulo B: ");
        this.alturaRetanguloB = scanner.nextInt();
    }

    private int calcularArea(int base, int altura) {
        return base * altura;
    }

    @Override
    public void executar() {
        int areaA = calcularArea(baseRetanguloA, alturaRetanguloA);
        int areaB = calcularArea(baseRetanguloB, alturaRetanguloB);
        
        if (areaA > areaB) {
            System.out.println("O retângulo A tem maior área.");
        } else if (areaA < areaB) {
            System.out.println("O retângulo B tem maior área.");
        } else {
            System.out.println("Os retângulos possuem áreas iguais.");
        }
    }
    
}


