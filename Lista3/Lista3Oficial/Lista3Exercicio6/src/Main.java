import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String senhaCorreta = "2026";
        String senhaDigitada;
        int tentativas = 0;

        System.out.println("=== Sistema de Validação de Senha ===");
        System.out.print("Digite a senha de 4 dígitos: ");
        senhaDigitada = scanner.nextLine();

        tentativas++; // Contar a primeira tentativa feita

        //while: continua rodando ENQUANTO a senha digitada for diferente (!=) da correta
        //Comparar Strings usando o metodo .equals(), e não '=='
        while (!senhaDigitada.equals(senhaCorreta)) {
            System.out.println("Senha Incorreta! Tente novamente.");
            System.out.print("Digite a senha de 4 dígitos: ");
            senhaDigitada = scanner.nextLine();

            tentativas++; // Incrementar o contador a cada nova tentativa errada
        }
        System.out.println("\nAcesso Autorizado!");
        System.out.println("Tentativas realizadas: " + tentativas);
    }
}