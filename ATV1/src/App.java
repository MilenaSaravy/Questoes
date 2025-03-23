import java.util.ArrayList;
import java.util.Scanner;
import questoes.Questao;
import questoes.Questao01;
import questoes.Questao02;
import questoes.Questao03;
import questoes.Questao04;
import questoes.Questao06;
import questoes.Questao07;
import questoes.Questao08;
import questoes.Questao09;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Questao> questoes = new ArrayList<>();
        questoes.add(new Questao01(scanner));
        questoes.add(new Questao02(scanner));
        questoes.add(new Questao03(scanner));
        questoes.add(new Questao04(scanner));
        questoes.add(new Questao06(scanner));
        questoes.add(new Questao07(scanner));
        questoes.add(new Questao08(scanner));
        questoes.add(new Questao09(scanner));

        System.out.println("\n Carregando... \n");

        for (Questao questao : questoes) {
            questao.executar();
            System.out.println("  ");
        }
        
        scanner.close();
    }
}
