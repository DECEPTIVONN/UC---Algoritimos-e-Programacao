import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double salarioAtual;
        double porcentagemAumento;
        double valorAumento;
        double novoSalario;


        System.out.print("Digite o salário atual (R$): ");
        salarioAtual = input.nextDouble();

        System.out.print("Digite a porcentagem de aumento (%): ");
        porcentagemAumento = input.nextDouble();

        valorAumento = salarioAtual * (porcentagemAumento / 100);
        novoSalario = salarioAtual + valorAumento;

        System.out.println("Salário atual: " + salarioAtual);
        System.out.println("Valor do aumento: R$ " + valorAumento);
        System.out.printf("Novo salário final: R$ " + novoSalario);

    }
}