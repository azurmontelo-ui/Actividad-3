// Clase principal que ejecuta el programa
public class Main {
    public static void main(String[] args) {
        // Crear objetos de la clase Estudiante
        Estudiante estudiante1 = new Estudiante("Ana", 20);
        Estudiante estudiante2 = new Estudiante("Luis", 22);

        // Mostrar la información de los estudiantes
        estudiante1.mostrarInfo();
        System.out.println("------");
        estudiante2.mostrarInfo();
    }
}
