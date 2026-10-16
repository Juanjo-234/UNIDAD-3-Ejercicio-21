//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Empleado emp1 = new EmpleadoAsalariado("María López", "35444111", 1001, 1500000.0);
    Empleado emp2 = new EmpleadoPorHora("Juan Gómez", "40111222", 1002, 6500.0, 160);


    System.out.println("=== REPORTE DE EMPLEADOS ASALARIADOS ===");
    emp1.mostrarDatos();
    System.out.println("Sueldo Total: $" + emp1.calcularSalario());
    System.out.println("----------------------------------------");

    System.out.println("=== REPORTE DE EMPLEADOS POR HORA ===");
    emp2.mostrarDatos();
    System.out.println("Sueldo Total: $" + emp2.calcularSalario());
    System.out.println("----------------------------------------");
}
