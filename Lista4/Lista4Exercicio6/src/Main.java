import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numeroSecreto = 42;
        int maxTentativas = 100; // Tamanho do vetor para armazenar palpites errados
        int[] palpitesErrados = new int[maxTentativas];
        int totalTentativas = 0;
        int qtdErrados = 0;
        int palpite = 0;

        System.out.println("=== JOGO DA ADIVINHAÇÃO ===");
        System.out.println("Tente adivinhar o número secreto!");

        while (palpite != numeroSecreto) {
            System.out.print("\nDigite o seu palpite: ");
            palpite = scanner.nextInt();
            totalTentativas++;

            if (palpite < numeroSecreto) {
                System.out.println("O número secreto é MAIOR que " + palpite + ".");
                palpitesErrados[qtdErrados] = palpite;
                qtdErrados++;
            } else if (palpite > numeroSecreto) {
                System.out.println("O número secreto é MENOR que " + palpite + ".");
                palpitesErrados[qtdErrados] = palpite;
                qtdErrados++;
            }
        }

        // Mensagem final de sucesso
        System.out.println("\nParabéns, você adivinhou! O número secreto é " + numeroSecreto + "!");
        System.out.println("\nTentativas: " + totalTentativas);

        System.out.println("\nPalpites:");
        for (int i = 0; i < qtdErrados; i++) {
            System.out.println((i + 1) + ") " + palpitesErrados[i]);
        }
        System.out.println(totalTentativas + ") " + numeroSecreto); // Exibe o palpite vitorioso como o último da lista
    }
}