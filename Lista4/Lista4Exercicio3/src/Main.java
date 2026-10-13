import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] diasDaSemana = {
                "Segunda-feira", "Terça-feira", "Quarta-feira", "Quinta-feira", "Sexta-feira"
        };

        double[] temperaturas = new double[5]; // 5 dias da semana definidos
        double soma = 0;

        // Leitura das temperaturas e cálculo da soma
        System.out.println("=== Registro de Temperaturas da Estação Meteorológica ===");
        for (int i = 0; i < diasDaSemana.length; i++) {
            System.out.print("Digite a temperatura de " + diasDaSemana[i] + " (°C): ");
            temperaturas[i] = scanner.nextDouble();
            soma += temperaturas[i];
        }

        double media = soma / diasDaSemana.length; // média
        System.out.printf("%nTemperatura média da semana: %.2f °C%n%n", media);

        System.out.println("Dias com temperatura estritamente acima da média:"); // Dias com temperatura acima da média
        boolean algumDiaAcima = false;

        for (int i = 0; i < diasDaSemana.length; i++) {
            if (temperaturas[i] > media) {
                System.out.printf("- %s: %.2f °C%n", diasDaSemana[i], temperaturas[i]);
                algumDiaAcima = true;
            }
        }
        if (!algumDiaAcima) {
            System.out.println("Nenhum dia teve temperatura estritamente acima da média.");
        }
    }
}