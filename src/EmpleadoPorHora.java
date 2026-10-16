public class EmpleadoPorHora extends Empleado {
    private double tarifaHora;
    private int horasTrabajadas;

    public EmpleadoPorHora(String nombre, String dni, int legajo, double tarifaPorHora, int horasTrabajadas) {
        super(nombre, dni, legajo);
        this.horasTrabajadas = horasTrabajadas;
        this.tarifaHora = tarifaPorHora;
    }

    @Override
    public double calcularSalario() {
        return tarifaHora * horasTrabajadas;
    }
}
