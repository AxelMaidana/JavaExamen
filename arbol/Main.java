import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        NodoNario raiz = new NodoNario(1);

        // Creamos los hijos de la raíz
        NodoNario hijo1 = new NodoNario(2);
        NodoNario hijo2 = new NodoNario(3);
        NodoNario hijo3 = new NodoNario(4);

        // Añadimos los hijos a la raíz
        raiz.agregarHijo(hijo1);
        raiz.agregarHijo(hijo2);
        raiz.agregarHijo(hijo3);

        // Agregamos nietos a los hijos
        hijo1.agregarHijo(new NodoNario(5));
        hijo1.agregarHijo(new NodoNario(6));
        hijo2.agregarHijo(new NodoNario(7));
        hijo3.agregarHijo(new NodoNario(8));
        hijo3.agregarHijo(new NodoNario(9));
        hijo3.agregarHijo(new NodoNario(10));

        // Imprimimos el árbol
        System.out.println("Árbol en pre-orden: ");
        raiz.preOrden();
        System.out.println("\nÁrbol en post-orden: ");
        raiz.postOrden();
        System.out.println("\nÁrbol en nivel: ");
        raiz.nivel();
        System.out.println("\nAltura del árbol: " + raiz.altura());

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el valor a buscar: ");
        int valor = sc.nextInt();
        
        Main.NodoNario.ResultadoBusqueda resultado = raiz.buscar(valor, 0); // Pasamos el nivel inicial como 0
        if (resultado.encontrado) {
            System.out.println("Valor encontrado: " + resultado.valor + " en el nivel " + resultado.nivel);
        } else {
            System.out.println("Valor no encontrado");
        }
    }

    static class NodoNario {
        int valor;
        List<NodoNario> hijos;

        public NodoNario(int valor) {
            this.valor = valor;
            this.hijos = new ArrayList<>();
        }

        public void agregarHijo(NodoNario hijo) {
            hijos.add(hijo);
        }

        // Recorrido en pre-orden
        public void preOrden() {
            System.out.print(valor + " ");
            for (NodoNario hijo : hijos) {
                hijo.preOrden();
            }
        }

        // Recorrido en post-orden
        public void postOrden() {
            for (NodoNario hijo : hijos) {
                hijo.postOrden();
            }
            System.out.print(valor + " ");
        }

        // Recorrido en nivel
        public void nivel() {
            System.out.print(valor + " ");
            for (NodoNario hijo : hijos) {
                hijo.nivel();
            }
        }

        // Altura del árbol
        public int altura() {
            int altura = 0;
            for (NodoNario hijo : hijos) {
                altura = Math.max(altura, hijo.altura());
            }
            return altura + 1;
        }

        // Clase para almacenar el resultado de la búsqueda
        public static class ResultadoBusqueda {
            boolean encontrado;
            int valor;
            int nivel;

            ResultadoBusqueda(boolean encontrado, int valor, int nivel) {
                this.encontrado = encontrado;
                this.valor = valor;
                this.nivel = nivel;
            }
        }

        // Buscar valor recursivamente y devolver el resultado
        public ResultadoBusqueda buscar(int valor, int nivelActual) {
            if (this.valor == valor) {
                return new ResultadoBusqueda(true, valor, nivelActual);
            }
            for (NodoNario hijo : hijos) {
                ResultadoBusqueda resultado = hijo.buscar(valor, nivelActual + 1);
                if (resultado.encontrado) {
                    return resultado;
                }
            }
            return new ResultadoBusqueda(false, -1, -1); // Retornar no encontrado
        }
    }
}
