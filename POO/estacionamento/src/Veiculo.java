import java.time.LocalDateTime;

public class Veiculo {
    private String placa;
    private String modelo;
    private String marca;
    private LocalDateTime Entrada;
    private String tipo;

    public Veiculo(String placa, String marca, String modelo, String tipo) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.tipo = tipo;
        this.Entrada = LocalDateTime.now(); // entrada
    }

    public String getPlaca() {
        return placa;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getTipo() {
        return tipo;
    }

    public LocalDateTime getHoraEntrada() {
        return Entrada;
    }

}
