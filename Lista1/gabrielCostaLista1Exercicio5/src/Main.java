import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

                Scanner input = new Scanner(System.in);
                double peso;
                double altura;
                double imc;

                System.out.print("Digite seu peso (em kg): ");
                peso = input.nextDouble();

                System.out.print("Digite sua altura (em metros, ex: 1,75): ");
                altura = input.nextDouble();

                imc = peso / (altura * altura);

        System.out.printf("Seu IMC é: " + imc);


        if(imc < 16){
                System.out.println("\nSua classificação é Magreza grave");

                }
                else if((imc >= 16) && (imc < 17)) {
                    System.out.println("\nSua classificação é Magreza moderada");
                }
                else if((imc >= 17) && (imc < 18)) {
                    System.out.println("\nSua classificação é Magreza leve");
                }

                else if((imc >= 19) && (imc < 25)) {
                    System.out.println("\nSua classificação é Magreza saúdavel");
                }

                else if((imc >= 25) && (imc < 30)) {
                    System.out.println("\nSua classificação é Sobrepeso");
                }

                else if((imc >= 30) && (imc < 35)) {
                    System.out.println("\nSua classificação é Obesidade I");
                }

                else if((imc >= 35) && (imc < 40)) {
                    System.out.println("\nSua classificação é Obesidade II");
                }

                else{
                    System.out.println("\nSua classificação é Obesidade III");
                }


    }
}