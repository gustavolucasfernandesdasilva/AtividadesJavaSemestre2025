import java.time.LocalDateTime;

public class SistemaEstacionamento {
    private String placa;
    private String modelo;
    private String marca;
    private String tipo; // pequeno, grande, moto
    private LocalDateTime entrada;

    public SistemaEstacionamento(String placa, String modelo, String marca, String tipo) {
        this.placa = placa;
        this.modelo = modelo;
        this.marca = marca;
        this.tipo = tipo.toLowerCase();
        this.entrada = LocalDateTime.now();
    }

    public String getplaca() {
        return placa;
    }

    public String getTipo() {
        return tipo;
    }

    public String getmodelo() {
        return modelo;
    }

    public String getMarca() {
        return marca;
    }


    public void mostrarInformacoes() {
        System.out.println("Placa: " + placa);
        System.out.println("marca: " + marca);
        System.out.println("modelo: " + modelo);
        System.out.println("tipo: " + tipo);


     }

}
