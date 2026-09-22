import java.util.Scanner;
import java.util.Locale; // Garantir o uso do ponto como separador decimal (ex: 50.50)
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade total de doações recebidas no dia: ");
        int quantidadeDoacoes = scanner.nextInt();

        if (quantidadeDoacoes <= 0) {
            System.out.println("A quantidade de doações precisa ser maior que zero.");
        } else {
            double somaTotal = 0.0;     // valor total arrecadado
            double maiorValor = 0.0;
            double menorValor = 0.0;

            // for vai rodar a quantidade de vezes informada
            for (int i = 1; i <= quantidadeDoacoes; i++) {
                System.out.print("Digite o valor da doação " + i + " (R$): ");
                double valorAtual = scanner.nextDouble();

                // Acumula o valor na soma total arrecadada
                somaTotal += valorAtual;

                if (i == 1) {
                    // Na primeira doação, o valor informado é o maior e o menor
                    maiorValor = valorAtual;
                    menorValor = valorAtual;
                } else {
                    // Se a doação atual for maior que o maiorValor registrado, , o novo maior valor é atualizado
                    if (valorAtual > maiorValor) {
                        maiorValor = valorAtual;
                    }
                    // Se a doação atual for menor que o menorValor registrado, o novo emnor valor é atualizado
                    if (valorAtual < menorValor) {
                        menorValor = valorAtual;
                    }
                }
            }
            System.out.println("\n--- Estatísticas das Doações ---");
            System.out.printf("Valor total arrecadado: R$ %.2f\n", somaTotal);
            System.out.printf("Maior valor individual: R$ %.2f\n", maiorValor);
            System.out.printf("Menor valor individual: R$ %.2f\n", menorValor);
        }
    }
}