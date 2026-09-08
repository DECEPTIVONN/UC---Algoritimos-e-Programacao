//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double kwh;
        double tarifa;
        double valorTotal;
        System.out.print("Digite a quantidade de kWh consumidos no mês: ");
       kwh = scanner.nextDouble();


        if (kwh <= 100) {
            tarifa = 0.50;
        } else if (kwh <= 200) {
            tarifa = 0.70;
        } else {
            tarifa = 0.90;
        }

        valorTotal = kwh * tarifa;

        System.out.printf("Tarifa aplicada: R$ %.2f por kWh%n", tarifa);
        System.out.printf("Valor total da conta: R$ %.2f%n", valorTotal);

    }
}