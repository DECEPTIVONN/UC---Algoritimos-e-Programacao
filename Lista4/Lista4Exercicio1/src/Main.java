import java.util.Scanner;
        public class Main {
            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                long resultado = 1;

                System.out.print("Digite um número: ");
                int numero = scanner.nextInt();

                for (int i = 1; i <= numero; i++) { //Se o número digitado for maior ou igual ao número digitado, o laço continua, incrementando i
                    resultado *= i;
                }
                System.out.println("O fatorial de " + numero + " é: " + resultado);
            }
        }