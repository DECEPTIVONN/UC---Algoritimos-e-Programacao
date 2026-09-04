import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numero;
        int quadrado;
        int cubo;

        System.out.print("Digite um número: ");
        numero = input.nextInt();

        quadrado = numero * numero;
        cubo = numero * numero * numero;.............

        if (numero % 2 == 0) {
            System.out.println("O número informado é par, e o quadrado dele é: "+ quadrado);
        } else {
            System.out.println("O número informado é ímpar, e o cubo dele é " + cubo);
        }




    }
}