import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int Valor1;
        int Valor2;
        int Valor3;

        System.out.print("Digite o primeiro valor: ");
        Valor1 = input.nextInt();

        System.out.print("Digite o segundo valor: ");
        Valor2 = input.nextInt();

        System.out.print("Digite o terceiro valor: ");
        Valor3 = input.nextInt();

        if((Valor1 > Valor2) && (Valor1 > Valor3)){
            System.out.println("\nO primeiro valor é o maior valor dentre os digitados;");

        }
        else if((Valor2 > Valor1) && (Valor2 > Valor3)) {
            System.out.println("\nO segundo valor é o maior valor dentre os digitados;");
        }

        else if((Valor3 > Valor1) && (Valor3 > Valor2)) {
            System.out.println("\nO terceiro valor é o maior valor dentre os digitados;");
        }




    }
}