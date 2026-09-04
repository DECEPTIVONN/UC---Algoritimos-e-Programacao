import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int Valor1;
        int Valor2;
        int Valor3;
        int resultado;
        int media;

        System.out.print("Digite o primeiro valor: ");
        Valor1 = input.nextInt();

        System.out.print("Digite o segundo valor: ");
        Valor2 = input.nextInt();

        System.out.print("Digite o terceiro valor: ");
        Valor3 = input.nextInt();

        resultado = Valor1 + Valor2 + Valor3;

        media = resultado / 3;

        System.out.println("A soma dos valores informados é: " + resultado);
        System.out.println("A média dos valores informados é: " + media);
    }
}