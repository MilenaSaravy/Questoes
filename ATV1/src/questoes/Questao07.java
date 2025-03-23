package questoes;

import java.util.Scanner;

public class Questao07 extends Questao {
    private final double totalGasto;

    public Questao07(Scanner scanner) {
        System.out.print("Digite o total gasto na loja: ");
        this.totalGasto = scanner.nextDouble();
    }

    private int obterOpcaoPagamento(Scanner scanner) {
        System.out.println("Escolha uma das opções de pagamento:");
        System.out.println("1 - À vista (10% de desconto)");
        System.out.println("2 - Em 2 vezes (sem juros)");
        System.out.println("3 - De 3 a 10 vezes (3% de juros por mês)");
        System.out.print("Digite a opção desejada: ");
        return scanner.nextInt();
    }

    private void calcularPagamento(int opcao) {
    double valorFinal = totalGasto;
    
    if (opcao == 1) {
        valorFinal = calcularPagamentoAVista(valorFinal);
        System.out.printf("Pagamento à vista: R$ %.2f%n", valorFinal);
    } else if (opcao == 2) {
        System.out.printf("Pagamento em 2 vezes: R$ %.2f (sem juros)%n", valorFinal);
    } else if (opcao == 3) {
        if (totalGasto > 100) {
            valorFinal = calcularPagamentoComJuros(valorFinal);
            System.out.printf("Pagamento em até 10 vezes com 3%% de juros: R$ %.2f%n", valorFinal);
        } else {
            System.out.println("Opção de pagamento com juros disponível somente para compras acima de R$ 100,00.");
        }
    } else {
        System.out.println("Opção inválida.");
    }
}

private double calcularPagamentoAVista(double valor) {
    return valor * 0.9;  
}

private double calcularPagamentoComJuros(double valor) {
    double juros = valor * 0.03;
    return valor + juros;
}

@Override
public void executar() {
    Scanner scanner = new Scanner(System.in);
    int opcao = obterOpcaoPagamento(scanner);
    calcularPagamento(opcao);    
    }
}