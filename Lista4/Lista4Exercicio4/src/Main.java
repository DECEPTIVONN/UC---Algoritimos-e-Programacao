import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] diasDaSemana = {
                "Segunda-feira", "Terça-feira", "Quarta-feira", "Quinta-feira", "Sexta-feira"
        };

        double[] vendas = new double[5]; //5 dias de venda
        double faturamentoTotal = 0;

        //Leitura das vendas
        System.out.println("=== Registro de Faturamento Semanal ===");
        for (int i = 0; i < diasDaSemana.length; i++) {
            System.out.print("Digite o valor de vendas de " + diasDaSemana[i] + " (R$): ");
            vendas[i] = scanner.nextDouble();
            faturamentoTotal += vendas[i];
        }

        double mediaDiaria = faturamentoTotal / diasDaSemana.length; // média diária

        System.out.println("\n=== Resumo do Faturamento ===");
        System.out.printf("Faturamento total acumulado: R$ %.2f%n", faturamentoTotal);
        System.out.printf("Média diária de vendas: R$ %.2f%n%n", mediaDiaria);

        // dias com faturamento abaixo da média
        System.out.println("=== Dias com desempenho abaixo da média diária ===");
        boolean algumDiaAbaixo = false;

        for (int i = 0; i < diasDaSemana.length; i++) {
            if (vendas[i] < mediaDiaria) {
                System.out.printf("- %s (Dia %d) ficou abaixo da média com R$ %.2f%n",
                        diasDaSemana[i], (i + 1), vendas[i]);
                algumDiaAbaixo = true;
            }
        }
        if (!algumDiaAbaixo) {
            System.out.println("Nenhum dia ficou abaixo da média calculada!");
        }
    }
}