import java.util.ArrayList;

public class SistemaEstacionamento {
    public static void main(String[] args) {

        Veiculo meuVeiculo = new Veiculo("");

        System.out.println("placa : " + meuVeiculo.getplaca()+ "\n"+ " marca : " meuVeiculo.getMarca()+ "\n" +meuVeiculo.getmodelo());

     Arraylist<Veiculo> veiculo = new ArrayList<>();
        veiculo.add(meuVeiculo);

        System.out.println(veiculo.get(0));


    }

}

