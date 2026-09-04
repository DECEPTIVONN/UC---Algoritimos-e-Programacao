import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double temperatura;
        int opcao;
        double kelvin;
        double fahrenheit;

        System.out.print("Digite uma temperatura: ");
        temperatura = input.nextInt();

        System.out.print("Digite 1 para converter a temperatura informada em Fahrenheit;" +
                "\nDigite 2 para converter a temperatura informada em Kelvin;\nSua opção:");
        opcao = input.nextInt();

        fahrenheit = ( temperatura * 1.8) + 32;
        kelvin = (temperatura + 273.15);

        if (opcao == 1) {
            System.out.println("A temperatura convertida para Fahrenheit é: " + fahrenheit);
        }
        else if (opcao == 2){
            System.out.println("A temperatura convertida para Kelvin é: " + kelvin);
        }
        else {
            System.out.println("Opção inválida");
        }








    }
}