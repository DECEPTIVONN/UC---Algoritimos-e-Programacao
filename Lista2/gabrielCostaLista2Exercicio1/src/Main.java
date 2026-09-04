import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int valor;
        int positivo;
        int negativo;
        int neutro;

        System.out.print("Digite um número: ");
        valor = input.nextInt();

        if(valor > 0){
            System.out.println("\nO número é positivo");

        }
        else if((valor < 0)) {
            System.out.println("\nO número é negativo");
        }

        else{
            System.out.println("\nO número é neutro");
        }

    }
}