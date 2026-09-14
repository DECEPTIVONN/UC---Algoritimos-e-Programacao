import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número do mês (1 a 12): ");
        int numeroMes = scanner.nextInt();

        switch (numeroMes) {
            case 1  -> System.out.println("1 - Janeiro");
            case 2  -> System.out.println("2 - Fevereiro");
            case 3  -> System.out.println("3 - Março");
            case 4  -> System.out.println("4 - Abril");
            case 5  -> System.out.println("5 - Maio");
            case 6  -> System.out.println("6 - Junho");
            case 7  -> System.out.println("7 - Julho");
            case 8  -> System.out.println("8 - Agosto");
            case 9  -> System.out.println("9 - Setembro");
            case 10 -> System.out.println("10 - Outubro");
            case 11 -> System.out.println("11 - Novembro");
            case 12 -> System.out.println("12 - Dezembro");
            default -> System.out.println("Número inválido! Digite um valor entre 1 e 12.");
        }
    }
}