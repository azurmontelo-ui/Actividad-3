// Clase que representa a un estudiante
public class Estudiante {
    // Atributos
    String nombre;
    int edad;

    // Constructor: se ejecuta al crear el objeto
    public Estudiante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Método: muestra la información del estudiante
    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }
}

