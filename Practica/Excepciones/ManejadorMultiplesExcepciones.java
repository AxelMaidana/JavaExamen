package Excepciones;
import java.util.Scanner;

public class ManejadorMultiplesExcepciones {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Ingresa un número: ");
            int numero = Integer.parseInt(scanner.nextLine()); // Puede generar NumberFormatException

            System.out.println("El número dividido entre 2 es: " + (10 / numero)); // Puede generar ArithmeticException
        } catch (NumberFormatException e) {
            System.out.println("Error: Ingresa un número válido.");
        } catch (ArithmeticException e) {
            System.out.println("Error: No se puede dividir entre cero.");
        } finally {
            scanner.close();
            System.out.println("Finalizando ejecución.");
        }
    }
}
