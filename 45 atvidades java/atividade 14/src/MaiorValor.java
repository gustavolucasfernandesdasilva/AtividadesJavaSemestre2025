import java.util.Scanner;

public class MaiorValor {
    public static void main(String[] args) {

        float  valor1 , valor2 ;
        Scanner scanner = new Scanner(System.in);


        System.out.print("Digite o primeiro valor inteiro: ");
         valor1 = scanner.nextInt();

        System.out.print("Digite o segundo valor inteiro (diferente do primeiro): ");
         valor2 = scanner.nextInt();


        if (valor1 == valor2) {
            System.out.println("Os valores digitados são iguais. Por favor, insira valores distintos.");
        } else {

            if (valor1 > valor2) {
                System.out.println("O maior valor é: " + valor1);
            } else {
                System.out.println("O maior valor é: " + valor2);
            }
        }

        scanner.close();
    }
}
