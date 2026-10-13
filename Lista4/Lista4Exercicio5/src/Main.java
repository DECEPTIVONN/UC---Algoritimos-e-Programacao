import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] pesos = new double[6];

        // pesos das 6 caixas
        System.out.println("=== Inspeção de Qualidade - Registro de Pesos ===");
        for (int i = 0; i < pesos.length; i++) {
            System.out.printf("Digite o peso da caixa %d (kg): ", (i + 1));
            pesos[i] = scanner.nextDouble();
        }

        // peso de referência para busca
        System.out.print("\nDigite o peso de referência para pesquisa (kg): ");
        double pesoReferencia = scanner.nextDouble();

        // Pesquisa na amostragem e contagem de ocorrências
        int contador = 0;
        for (int i = 0; i < pesos.length; i++) {
            if (pesos[i] == pesoReferencia) {
                contador++;
            }
        }

        System.out.println("\n=== Resultado da Pesquisa ===");
        if (contador > 0) {
            System.out.printf("O peso %.2f kg foi encontrado %d vez(es) na amostragem.%n", pesoReferencia, contador);
        } else {
            System.out.println("Valor não localizado na amostragem");
        }
    }
}