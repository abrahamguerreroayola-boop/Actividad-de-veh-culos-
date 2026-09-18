package clases;

public abstract class Vehiculo {
    private String marca;
    private String modelo;
    private double tarifaBase;

    public Vehiculo(String marca, String modelo, double tarifaBase) {
        this.marca = marca;
        this.modelo = modelo;
        this.tarifaBase = tarifaBase;
    }

    public String getMarca() {
        return this.marca;
    }

    public String getModelo() {
        return this.modelo;
    }

    public double getTarifaBase() {
        return this.tarifaBase;
    }

    public abstract double calcularCostoAlquiler(int dias);


}
