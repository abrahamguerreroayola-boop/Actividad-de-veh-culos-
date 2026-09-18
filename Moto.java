package clases;

public class Moto extends Vehiculo {
    public Moto(String marca, String modelo, double tarifaBase) {
        super(marca, modelo, tarifaBase);
    }

    @Override
    public double calcularCostoAlquiler(int dias) {
        return (getTarifaBase() * dias) + 5;
    }
}
