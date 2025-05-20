import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String placa;
        String modelo;
        String marca;
        String tipo ;

        Scanner leia = new Scanner(System.in);

        System.out.println("escavra a placa");
        placa = leia.nextLine();
        System.out.println("escavra a Marca");
        marca  = leia.nextLine();
        System.out.println("escavra a Tipo");
        tipo = leia.nextLine();
        System.out.println("escavra a modelo");
        modelo = leia.nextLine();

      SistemaEstacionamento veiculo = new SistemaEstacionamento(placa,marca,tipo,modelo);

        System.out.println("informacoes do carro");
        veiculo.toString();

    }



}

