import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final double SALARIO_MINIMO = 1620.00; // Salário mínimo definido
        // Variáveis de acúmulo e contagem
        double somaSalario = 0.0;
        int somaFilhos = 0;
        int totalPessoas = 0;
        int totalAteUmSalarioMinimo = 0;
        double maiorSalario = 0.0;
        char continuar;

        System.out.println("=== PESQUISA DA PREFEITURA ===");
        do {
            totalPessoas++;
            System.out.printf("%n--- Habitante %d ---%n", totalPessoas);
            System.out.print("Digite o salário (R$): ");
            double salario = scanner.nextDouble();
            System.out.print("Digite o número de filhos: ");
            int numeroFilhos = scanner.nextInt();

            somaSalario += salario;
            somaFilhos += numeroFilhos; // Acumuladores para médias

            if (totalPessoas == 1 || salario > maiorSalario) { // Verificação do maior salário
                maiorSalario = salario;
            }
            if (salario <= SALARIO_MINIMO) { // Contagem de pessoas com salário até 1 salário mínimo
                totalAteUmSalarioMinimo++;
            }
            System.out.println("Deseja continuar?");
            System.out.println("[S] - SIM");
            System.out.println("[N] - NÃO");
            System.out.print("Escolha uma opção: ");
            continuar = scanner.next().toUpperCase().charAt(0);

        } while (continuar == 's');
        if (totalPessoas > 0) {
            double mediaSalario = somaSalario / totalPessoas;
            double mediaFilhos = (double) somaFilhos / totalPessoas;
            double percentualAteUmSalario = ((double) totalAteUmSalarioMinimo / totalPessoas) * 100;
            System.out.println("\n=== RESULTADO DA PESQUISA ===");
            System.out.printf("Total de pessoas pesquisadas: %d%n", totalPessoas);
            System.out.printf("a) Média do salário da população: R$ %.2f%n", mediaSalario);
            System.out.printf("b) Média do número de filhos: %.2f%n", mediaFilhos);
            System.out.printf("c) Maior salário: R$ %.2f%n", maiorSalario);
            System.out.printf("d) Percentual de pessoas que recebem até (R$ %.2f): %.2f%%%n", SALARIO_MINIMO, percentualAteUmSalario);
        }
    }
}