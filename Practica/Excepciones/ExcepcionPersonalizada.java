package Excepciones;
class MiExcepcion extends Exception {
    public MiExcepcion(String mensaje) {
        super(mensaje);
    }
}

public class ExcepcionPersonalizada {
    public static void main(String[] args) {
        try {
            validarEdad(15); // Intentamos validar una edad menor a 18
        } catch (MiExcepcion e) {
            System.out.println("Excepción atrapada: " + e.getMessage());
        }
    }

    // Método que lanza una excepción personalizada
    public static void validarEdad(int edad) throws MiExcepcion {
        if (edad < 18) {
            throw new MiExcepcion("La edad debe ser mayor o igual a 18.");
        }
        System.out.println("Edad válida.");
    }
}
