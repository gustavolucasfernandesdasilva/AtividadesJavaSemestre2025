import java.util.Scanner;

public class Main{
public static void main(String[] args) {

    String placa, modelo, marca;
    int opcao;

    Scanner Leia = new Scanner(System.in);
while(true) {
    System.out.println("\n------------------");
    System.out.println("estacionar, opcao 1");
    System.out.println("libera saida do veiculo , opcao 2");
    System.out.println("consultar vagas ocupadas , opcao 3");
    System.out.println("consultar vagas livres , opcao 4");
    System.out.println("total de carros no estacionamento ,opcao 5");
    System.out.println("------------------");
    System.out.println("digite a opcao");
    opcao = Leia.nextInt();


    switch (opcao) {
        case 1:
            System.out.println("digite a placa");
            placa = Leia.nextLine();
            System.out.println("digite a marca");
            marca = Leia.nextLine();
            System.out.println("digite o modelo");
            placa = Leia.nextLine();

            Veiculo meuVeiculo = new Veiculo(placa, modelo,marca);
              Estacionamento_Array.meuVeiculo(meuVeiculo);
            break;
    }
    Veiculo veiculo = new Veiculo(placa ,modelo ,marca);


}
}
}