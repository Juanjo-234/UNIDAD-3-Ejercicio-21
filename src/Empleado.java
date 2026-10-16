public abstract class Empleado {
    private String nombre;
    private String dni;
    private int legajo;

    public Empleado(String nombre, String dni, int legajo){
        this.nombre = nombre;
        this.dni = dni;
        this.legajo = legajo;
    }


    public abstract double calcularSalario();

    public void mostrarDatos() {
        System.out.println("Legajo: " + legajo);
        System.out.println("Nombre: " + nombre);
        System.out.println("DNI: " + dni);
    }
}
