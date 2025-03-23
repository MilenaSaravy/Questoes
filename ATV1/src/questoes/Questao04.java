package questoes;

import java.util.Scanner;


public class Questao04 extends Questao {
    private final int quantidadeAlunos;
    private final int quantidadeAlunas;

    public Questao04(Scanner scanner) {
        System.out.print("Digite o número de alunos: ");
        this.quantidadeAlunos = scanner.nextInt();
        
        System.out.print("Digite o número de alunas: ");
        this.quantidadeAlunas = scanner.nextInt();
    }

    @Override
    public void executar() {
        if (quantidadeAlunas > quantidadeAlunos) {
            System.out.println("Primeiro o número de alunas: " + quantidadeAlunas);
            System.out.println("Depois o número de alunos: " + quantidadeAlunos);
        } else {
            System.out.println("O número de alunos e alunas é igual: " + quantidadeAlunas);
        }
    }
}