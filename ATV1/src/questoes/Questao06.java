package questoes;

import java.util.ArrayList;
import java.util.Scanner;

public class Questao06 extends Questao {
    private final int horaInicio, minutoInicio, horaFim, minutoFim;

    public Questao06(Scanner scanner) {
        System.out.print("Hora de início do jogo: ");
        this.horaInicio = scanner.nextInt();
        
        System.out.print("Minuto de início: ");
        this.minutoInicio = scanner.nextInt();
        
        System.out.print("Hora de término do jogo: ");
        this.horaFim = scanner.nextInt();
        
        System.out.print("Minuto de término: ");
        this.minutoFim = scanner.nextInt();
    }

    private ArrayList<Integer> calcularDuracao() {
        int inicioTotal = horaInicio * 60 + minutoInicio;
        int fimTotal = horaFim * 60 + minutoFim;
        
        if (fimTotal <= inicioTotal) {
            fimTotal += 24 * 60;
        }

        int duracaoMinutos = fimTotal - inicioTotal;
        
        ArrayList<Integer> duracao = new ArrayList<>();
        duracao.add(duracaoMinutos / 60);
        duracao.add(duracaoMinutos % 60);

        return duracao;
    }

    @Override
    public void executar() {
        ArrayList<Integer> duracao = calcularDuracao();
        System.out.printf("Duração do jogo: %d horas e %d minutos%n", duracao.get(0), duracao.get(1));
    }
}
