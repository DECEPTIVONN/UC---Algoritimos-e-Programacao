import java.util.Scanner;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro N: ");
        int n = scanner.nextInt();

        System.out.println("\n--- Exibindo a mensagem " + n + " vezes ---");

        // O laço 'for' utiliza a variável 'n' como limite superior (i <= n),
        // assim, o loop rodará com a quantidade de vezes que o usuário escolheu.
        for (int i = 1; i <= n; i++) {
            System.out.println("Praticando lógica de programação!");
        }
    }
}