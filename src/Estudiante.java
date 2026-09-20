public class Estudiante {
    // Atributos privados
    private String nombre;
    private int edad;
    private double promedio;

    // Constructor
    public Estudiante(String nombre, int edad, double promedio) {
        this.nombre = nombre;
        this.edad = edad;
        this.promedio = promedio;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    // Método para mostrar información del estudiante
    public void mostrarInformacion() {
        System.out.println("Estudiante: " + nombre + " | Edad: " + edad + " | Promedio: " + promedio);
    }
}