package Arboles;
// Clase Nodo
class Nodo {
    int valor;
    Nodo izquierdo;
    Nodo derecho;

    // Constructor
    public Nodo(int valor) {
        this.valor = valor;
        this.izquierdo = null;
        this.derecho = null;
    }
}

// Clase Árbol Binario
class ArbolBinario {
    Nodo raiz;

    // Constructor
    public ArbolBinario() {
        this.raiz = null;
    }

    // Método para insertar un nodo
    public void insertar(int valor) {
        raiz = insertarRecursivo(raiz, valor);
    }

    private Nodo insertarRecursivo(Nodo actual, int valor) {
        if (actual == null) {
            return new Nodo(valor);
        }
        if (valor < actual.valor) {
            actual.izquierdo = insertarRecursivo(actual.izquierdo, valor);
        } else if (valor > actual.valor) {
            actual.derecho = insertarRecursivo(actual.derecho, valor);
        }
        return actual;
    }

    // Método para buscar un nodo
    public boolean buscar(int valor) {
        return buscarRecursivo(raiz, valor);
    }

    private boolean buscarRecursivo(Nodo actual, int valor) {
        if (actual == null) {
            return false;
        }
        if (valor == actual.valor) {
            return true;
        }
        return valor < actual.valor
            ? buscarRecursivo(actual.izquierdo, valor)
            : buscarRecursivo(actual.derecho, valor);
    }

    // Método para eliminar un nodo
    public void eliminar(int valor) {
        raiz = eliminarRecursivo(raiz, valor);
    }

    private Nodo eliminarRecursivo(Nodo actual, int valor) {
        if (actual == null) {
            return null;
        }
        if (valor == actual.valor) {
            // Caso 1: Nodo sin hijos
            if (actual.izquierdo == null && actual.derecho == null) {
                return null;
            }
            // Caso 2: Nodo con un hijo
            if (actual.izquierdo == null) {
                return actual.derecho;
            }
            if (actual.derecho == null) {
                return actual.izquierdo;
            }
            // Caso 3: Nodo con dos hijos
            int menorValor = encontrarMenorValor(actual.derecho);
            actual.valor = menorValor;
            actual.derecho = eliminarRecursivo(actual.derecho, menorValor);
            return actual;
        }
        if (valor < actual.valor) {
            actual.izquierdo = eliminarRecursivo(actual.izquierdo, valor);
            return actual;
        }
        actual.derecho = eliminarRecursivo(actual.derecho, valor);
        return actual;
    }

    private int encontrarMenorValor(Nodo nodo) {
        return nodo.izquierdo == null ? nodo.valor : encontrarMenorValor(nodo.izquierdo);
    }

    // Recorridos
    public void recorrerInorden(Nodo nodo) {
        if (nodo != null) {
            recorrerInorden(nodo.izquierdo);
            System.out.print(nodo.valor + " ");
            recorrerInorden(nodo.derecho);
        }
    }

    public void recorrerPreorden(Nodo nodo) {
        if (nodo != null) {
            System.out.print(nodo.valor + " ");
            recorrerPreorden(nodo.izquierdo);
            recorrerPreorden(nodo.derecho);
        }
    }

    public void recorrerPostorden(Nodo nodo) {
        if (nodo != null) {
            recorrerPostorden(nodo.izquierdo);
            recorrerPostorden(nodo.derecho);
            System.out.print(nodo.valor + " ");
        }
    }
}

// Clase Principal
public class ArbolBinarioComun {
    public static void main(String[] args) {
        ArbolBinario arbol = new ArbolBinario();
        
        // Insertar elementos
        arbol.insertar(50);
        arbol.insertar(30);
        arbol.insertar(70);
        arbol.insertar(20);
        arbol.insertar(40);
        arbol.insertar(60);
        arbol.insertar(80);

        // Recorridos
        System.out.println("Recorrido en Inorden:");
        arbol.recorrerInorden(arbol.raiz);
        System.out.println("\nRecorrido en Preorden:");
        arbol.recorrerPreorden(arbol.raiz);
        System.out.println("\nRecorrido en Postorden:");
        arbol.recorrerPostorden(arbol.raiz);

        // Búsqueda
        System.out.println("\n\nBuscar 40: " + arbol.buscar(40));
        System.out.println("Buscar 90: " + arbol.buscar(90));

        // Eliminar
        System.out.println("\nEliminar 50 (raíz)");
        arbol.eliminar(50);

        System.out.println("Recorrido en Inorden después de eliminar:");
        arbol.recorrerInorden(arbol.raiz);
    }
}
