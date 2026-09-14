import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int idade;
        double massa;
        double dosagemMg;
        int quantidadeGotas;

        System.out.print("Digite a idade do paciente (anos): ");
        idade = scanner.nextInt();

        System.out.print("Digite a massa do paciente (kg): ");
        massa = scanner.nextDouble();

        dosagemMg = 0;

        // Mais de 12 anos ou mais
        if (idade >= 12) {
            if (massa >= 60.0) {
                dosagemMg = 1000;
            } else {
                dosagemMg = 875;
            }
        }
        // Menos de 12 anos
        else {
            if (massa >= 5.0 && massa <= 9.0) {
                dosagemMg = 125;
            } else if (massa > 9.0 && massa <= 16.0) {
                dosagemMg = 250;
            } else if (massa > 16.0 && massa <= 24.0) {
                dosagemMg = 375;
            } else if (massa > 24.0 && massa <= 30.0) {
                dosagemMg = 500;
            } else if (massa > 30.0) {
                dosagemMg = 750;
            } else {
                System.out.println("Massa abaixo do limite mínimo para o medicamento (5 kg).");
                return;
            }
        }

        // 500 mg = 1 ml = 20 gotas (uma mg equivale a 20 / 500 = 0.04 gotas)
        quantidadeGotas = (int) Math.round((dosagemMg / 500.0) * 20);

        System.out.println("\n=== RECEITA MÉDICA ===");
        System.out.println("Dosagem calculada: " + (int) dosagemMg + " mg");
        System.out.println("O paciente deve tomar: " + quantidadeGotas + " gotas.");

        scanner.close();
    }
}