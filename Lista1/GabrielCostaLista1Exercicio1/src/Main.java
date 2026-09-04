import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int Valor;
        int resultado;

        System.out.print("Digite um valor: ");
        Valor = input.nextInt();
        resultado = Valor * 2;

        System.out.println("O dobro do valor informado é: " + resultado);

    }
}