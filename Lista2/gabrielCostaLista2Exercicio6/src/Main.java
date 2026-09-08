import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double renda;
        double prestacao;
        double limitePrestacao;

        System.out.print("Digite o valor da renda mensal: R$ ");
        renda = scanner.nextDouble();

        System.out.print("Digite o valor da prestação desejada: R$ ");
        prestacao = scanner.nextDouble();

       
        limitePrestacao = renda * 0.30;


        if (prestacao > limitePrestacao) {
            System.out.println("Financiamento negado por baixa renda");
        }
        else if (prestacao > 3000.00 && renda < 10000.00) {
            System.out.println("Financiamento negado por alta prestação");
        }
        else {
            System.out.println("Financiamento aprovado");
        }
    }
}