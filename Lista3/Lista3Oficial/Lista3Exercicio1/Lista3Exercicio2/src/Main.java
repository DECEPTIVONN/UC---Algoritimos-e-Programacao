import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a;
        double b;
        double c;
        double delta;
        double x;
        double x1;
        double x2;

        System.out.print("Digite o coeficiente a: ");
        a = scanner.nextDouble();

        System.out.print("Digite o coeficiente b: ");
        b = scanner.nextDouble();

        System.out.print("Digite o coeficiente c: ");
        c = scanner.nextDouble();

        // (a) a = 0:
        if (a == 0) {
            System.out.println("Não é uma equação do segundo grau (o coeficiente 'a' deve ser diferente de 0).");
        } else {
            // Cálculo do Delta (b ao quadrado - 4ac)
            delta = Math.pow(b, 2) - (4 * a * c);

            // (b) delta menor que 0: Não existem raízes reais
            if (delta < 0) {
                System.out.println("Delta = " + delta + ": Não existem raízes reais.");
            }
            // (d) delta = 0: Duas raízes reais iguais
            else if (delta == 0) {
                x = -b / (2 * a);
                System.out.println("Delta = 0: Existem duas raízes reais e iguais.");
                System.out.println("x1 = x2 = " + x);
            }
            // (c) delta maior que 0: Duas raízes reais diferentes
            else {
                x1 = (-b + Math.sqrt(delta)) / (2 * a);
                x2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.println("Delta = " + delta + ": Existem duas raízes reais diferentes.");
                System.out.println("x1 = " + x1);
                System.out.println("x2 = " + x2);
            }
        }
    }
}