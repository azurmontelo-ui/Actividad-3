// La clase EstudianteBecado hereda de Estudiante
public class EstudianteBecado extends Estudiante {
    double montoBeca;

    // Constructor que llama al constructor de la clase base
    public EstudianteBecado(String nombre, int edad, double montoBeca) {
        super(nombre, edad); // Reutiliza atributos de Estudiante
        this.montoBeca = montoBeca;
    }

    // Método adicional exclusivo de esta clase
    public void mostrarBeca() {
        System.out.println("Monto de beca: $" + montoBeca);
    }

    // Sobrescribir método mostrarInfo para incluir la beca
    @Override
    public void mostrarInfo() {
        super.mostrarInfo(); // Llama al método original de la clase base
        System.out.println("Monto de beca: $" + montoBeca);
    }
}
