import java.time.LocalDateTime;

public class Veiculo {
    private String placa;
    private String modelo;
    private String marca;



    public Veiculo(String placa, String modelo, String marca, String tipo) {
        this.placa = placa;
        this.modelo = modelo;
        this.marca = marca;

    }

    public String getplaca() {
        return placa;
    }


    public String getmodelo() {
        return modelo;
    }

    public String getMarca() {
        return marca;
    }



}
