public class ComisionPersonalizada implements EstrategiaComision {
    private static final int N = 5; // Nombre: Carla

    @Override
    public double calcularComision(double montoVenta) {
        return montoVenta * (5 + N) / 100.0;
    }
}