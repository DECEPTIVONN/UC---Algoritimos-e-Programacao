import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro para ver a tabuada: ");
        int numero = scanner.nextInt();

        System.out.println("\n--- Tabuada do " + numero + " ---");

        // O laço 'for' vai de 1 a 10 e avança de 1 em 1 (i++)
        for (int i = 1; i <= 10; i++) {
            int resultado = numero * i; // Calcular o produto

            System.out.println(numero + " x " + i + " = " + resultado);
        }
    }
}