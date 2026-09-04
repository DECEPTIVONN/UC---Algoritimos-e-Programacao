import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a;
        int b;
        int temp;

        System.out.print("Digite o valor para A: ");
        a = input.nextInt();

        System.out.print("Digite o valor para B: ");
        b = input.nextInt();

        temp = a;
        a = b;
        b = temp;

        System.out.println("Valores trocados:");
        System.out.println("Novo valor de A: " + a);
        System.out.println("Novo valor de B: " + b);


    }
}