package Archivos;
import java.io.*;

public class ManejoArchivos {
    public static void main(String[] args) {
        String nombreArchivo = "archivo_ejemplo.txt";

        // Crear un archivo
        crearArchivo(nombreArchivo);

        // Escribir en el archivo
        escribirArchivo(nombreArchivo, "Hola, este es un archivo de ejemplo en Java.");
        escribirArchivo(nombreArchivo, "Añadiendo más texto al archivo.");

        // Leer el archivo
        System.out.println("\nContenido del archivo:");
        leerArchivo(nombreArchivo);

        // Eliminar el archivo
        //eliminarArchivo(nombreArchivo);
    }

    // Método para crear un archivo
    public static void crearArchivo(String nombreArchivo) {
        try {
            File archivo = new File(nombreArchivo);
            if (archivo.createNewFile()) {
                System.out.println("Archivo creado: " + archivo.getName());
            } else {
                System.out.println("El archivo ya existe.");
            }
        } catch (IOException e) {
            System.out.println("Ocurrió un error al crear el archivo.");
            e.printStackTrace();
        }
    }

    // Método para escribir en un archivo
    public static void escribirArchivo(String nombreArchivo, String contenido) {
        try (BufferedWriter escritor = new BufferedWriter(new FileWriter(nombreArchivo, true))) { // `true` para añadir al archivo  
            escritor.write(contenido + "\n");
            System.out.println("Se escribió en el archivo: " + contenido);
        } catch (IOException e) {
            System.out.println("Ocurrió un error al escribir en el archivo.");
            e.printStackTrace();
        }
    }

    // Método para leer un archivo
    public static void leerArchivo(String nombreArchivo) {
        try (BufferedReader lector = new BufferedReader(new FileReader(nombreArchivo))) {
            String linea;
            while ((linea = lector.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (IOException e) {
            System.out.println("Ocurrió un error al leer el archivo.");
            e.printStackTrace();
        }
    }

    // Método para eliminar un archivo
    public static void eliminarArchivo(String nombreArchivo) {
        File archivo = new File(nombreArchivo);
        if (archivo.delete()) {
            System.out.println("\nArchivo eliminado: " + archivo.getName());
        } else {
            System.out.println("\nNo se pudo eliminar el archivo.");
        }
    }
}
