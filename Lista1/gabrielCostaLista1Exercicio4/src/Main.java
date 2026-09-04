import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double Valor;
        double resultado = 0;
        double descontoTaxa;
        double desconto;
        double valorTotal;

        System.out.print("Digite o valor: ");
        Valor = input.nextDouble();
        resultado += Valor;


        descontoTaxa = 10;
        desconto = resultado * (descontoTaxa/100);
        valorTotal = resultado - desconto;

        System.out.println("O preço do produto é: " + resultado + ", o valor com o desconto é: "+ valorTotal + ";");

    }
}