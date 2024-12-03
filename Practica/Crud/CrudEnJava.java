package Crud;
import java.util.ArrayList;
import java.util.Scanner;

public class CrudEnJava {
    // Simulación de una "base de datos" con una lista
    private static ArrayList<String> listaDatos = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n--- Menú CRUD ---");
            System.out.println("1. Crear");
            System.out.println("2. Leer");
            System.out.println("3. Actualizar");
            System.out.println("4. Eliminar");
            System.out.println("5. Salir");
            System.out.print("Selecciona una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea

            switch (opcion) {
                case 1 -> crear(scanner);
                case 2 -> leer();
                case 3 -> actualizar(scanner);
                case 4 -> eliminar(scanner);
                case 5 -> System.out.println("Saliendo del programa...");
                default -> System.out.println("Opción no válida. Intenta de nuevo.");
            }
        } while (opcion != 5);

        scanner.close();
    }

    // Operación CREATE
    private static void crear(Scanner scanner) {
        System.out.print("Ingresa el dato a añadir: ");
        String dato = scanner.nextLine();
        listaDatos.add(dato);
        System.out.println("Dato añadido exitosamente.");
    }

    // Operación READ
    private static void leer() {
        System.out.println("\n--- Datos en la lista ---");
        if (listaDatos.isEmpty()) {
            System.out.println("La lista está vacía.");
        } else {
            for (int i = 0; i < listaDatos.size(); i++) {
                System.out.println((i + 1) + ". " + listaDatos.get(i));
            }
        }
    }

    // Operación UPDATE
    private static void actualizar(Scanner scanner) {
        leer();
        if (!listaDatos.isEmpty()) {
            System.out.print("Selecciona el número del dato a actualizar: ");
            int indice = scanner.nextInt() - 1;
            scanner.nextLine(); // Consumir el salto de línea

            if (indice >= 0 && indice < listaDatos.size()) {
                System.out.print("Ingresa el nuevo valor: ");
                String nuevoDato = scanner.nextLine();
                listaDatos.set(indice, nuevoDato);
                System.out.println("Dato actualizado exitosamente.");
            } else {
                System.out.println("Índice inválido.");
            }
        }
    }

    // Operación DELETE
    private static void eliminar(Scanner scanner) {
        leer();
        if (!listaDatos.isEmpty()) {
            System.out.print("Selecciona el número del dato a eliminar: ");
            int indice = scanner.nextInt() - 1;
            scanner.nextLine(); // Consumir el salto de línea

            if (indice >= 0 && indice < listaDatos.size()) {
                listaDatos.remove(indice);
                System.out.println("Dato eliminado exitosamente.");
            } else {
                System.out.println("Índice inválido.");
            }
        }
    }
}
