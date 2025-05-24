import java.util.ArrayList;

public class SistemaEstacionamento {
    public static  void estacionamento (String placa, String modelo, String marca) {

      Veiculo meuVeiculo = new Veiculo(placa,modelo,marca);

        System.out.println("placa : " + meuVeiculo.getplaca() + "\n" + " marca : " + meuVeiculo.getMarca() + "\n" + " modelo : " +meuVeiculo.getmodelo());



    }
}

