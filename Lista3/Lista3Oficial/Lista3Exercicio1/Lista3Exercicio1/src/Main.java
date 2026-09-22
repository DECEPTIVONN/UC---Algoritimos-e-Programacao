import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x;
        double resultado;


        System.out.print("Digite o valor de x: ");
        x = scanner.nextDouble();

        resultado = calcularF(x);
        System.out.println("f(" + x + ") = " + resultado);

    }

    public static double calcularF(double x) {
        if (x <= 1) {
            return 1;
        } else if (x <= 2) {
            return 2;
        } else if (x <= 3) {
            return Math.pow(x, 2);
        } else {
            return Math.pow(x, 3);
        }
    }
}