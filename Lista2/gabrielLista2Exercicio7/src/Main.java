import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int codigo;
        int quantidade;
        double precoUnitario;
        double precoTotal;
        double percentualDesconto;
        double valorDesconto;
        double precoFinal;


        System.out.print("Digite o código do produto (1 a 40): ");
        codigo = scanner.nextInt();

        System.out.print("Digite a quantidade comprada: ");
        quantidade = scanner.nextInt();


        if (codigo >= 1 && codigo <= 10) {
            precoUnitario = 10.00;
        } else if (codigo >= 11 && codigo <= 20) {
            precoUnitario = 15.00;
        } else if (codigo >= 21 && codigo <= 30) {
            precoUnitario = 20.00;
        } else if (codigo >= 31 && codigo <= 40) {
            precoUnitario = 30.00;
        } else {
            System.out.println("Código de produto inválido!");
            return;
        }


        precoTotal = precoUnitario * quantidade;



        if (precoTotal <= 250.00) {
            percentualDesconto = 0.05; // 5%
        } else if (precoTotal <= 500.00) {
            percentualDesconto = 0.10; // 10%
        } else {
            percentualDesconto = 0.15; // 15%
        }


        valorDesconto = precoTotal * percentualDesconto;
        precoFinal = precoTotal - valorDesconto;


        System.out.println("\n--- RESUMO DA NOTA FISCAL ---");
        System.out.printf("Preço unitário: R$ %.2f%n", precoUnitario);
        System.out.printf("Preço total da nota: R$ %.2f%n", precoTotal);
        System.out.printf("Valor do desconto (%.0f%%): R$ %.2f%n", (percentualDesconto * 100), valorDesconto);
        System.out.printf("Preço final da nota: R$ %.2f%n", precoFinal);

    }
}