//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("=== Números pares de 1 a 20 ===");
        // i = 2, pois é o primeiro número par no intervalo de 1 a 20.
        // A condição i <= 20 numero máximo 20
        // A segunda condição é i += 2, que faz somar de 2 em 2
        for (int i = 2; i <= 20; i += 2) {
            System.out.println(i);
        }
    }
}

