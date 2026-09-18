package clases;

public class Main {
    public static void main(String[] args) {
        Vehiculo[] vehiculos = {
            new Moto("Yamaha", "MT-09", 10),
            new Auto("KIA", "X-MODELO", 30)
        };

        for (Vehiculo vehiculo : vehiculos) {
            System.out.println(String.format("El costo de alquiler para 5 dias de el vehiculo [MARCA: %s, MODELO: %s] es: %.2f", vehiculo.getMarca(), vehiculo.getModelo(), vehiculo.calcularCostoAlquiler(5)));
        }
    }
}
