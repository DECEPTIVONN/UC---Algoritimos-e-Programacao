import java.util.Scanner;
import java.util.Locale; // Garante o uso do ponto como separador decimal
public class Main {
    public Main(String[] args) {}
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double soma = 0.0;
        int quantidade = 0;
        double nota;

        System.out.println("=== Calculadora de Média de Notas ===");
        System.out.println("Instruções: Digite as notas dos alunos. Digite um valor negativo (ex: -1) para encerrar.\n");

        System.out.print("Digite a nota (ou -1 para sair): ");
        nota = scanner.nextDouble();

        // Laço 'while': continua rodando ENQUANTO a nota digitada for maior ou igual a zero
        while (nota >= 0) {
            soma += nota;      // Acumula o valor: soma = soma + nota
            quantidade++;      // Incrementar o contador de notas válidas

            System.out.print("Digite a próxima nota (ou -1 para sair): ");
            nota = scanner.nextDouble();
        }

        // Verificarse o usuário digitou ao menos uma nota válida antes de calcular a média.
        if (quantidade > 0) {
            double media = soma / quantidade; // média

            System.out.println("\n--- Resultados Finais ---");
            System.out.println("Quantidade de notas válidas: " + quantidade);
            // O printf("%.2f", media) formata o número para exibir 2 casas decimais
            System.out.printf("Média aritmética: %.2f\n", media);
        } else {
            System.out.println("\nNenhuma nota válida foi informada para o cálculo.");
        }
    }
}