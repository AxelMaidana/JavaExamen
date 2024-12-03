package Excepciones;
public class ControlErrores {
    public static void main(String[] args) {
        try {
            int resultado = dividir(10, 0); // Intentamos dividir entre 0
            System.out.println("Resultado: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Error: No se puede dividir entre cero.");
        } finally {
            System.out.println("Operación finalizada.");
        }
    }

    // Método que realiza una división
    public static int dividir(int a, int b) {
        return a / b;
    }
}
