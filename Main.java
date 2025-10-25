public class Main {
    public static void main(String[] args) {
        // Crear un estudiante normal
        Estudiante estudiante1 = new Estudiante("Ana", 20);

        // Crear un estudiante becado (subclase)
        EstudianteBecado estudiante2 = new EstudianteBecado("Luis", 22, 1500.0);

        System.out.println("=== Información del Estudiante ===");
        estudiante1.mostrarInfo();

        System.out.println("\n=== Información del Estudiante Becado ===");
        estudiante2.mostrarInfo();
    }
}

