import java.util.Scanner;

public class Intervalo10a150 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int contador = 0;

        for (int i = 1; i <= 80; i++) {
            System.out.print("Digite o " + i + "º número: ");
            int numero = scanner.nextInt();
            if (numero >= 10 && numero <= 150) {
                contador++;
            }
        }

        System.out.println("Quantidade de números entre 10 e 150: " + contador);
        scanner.close();
    }
}
