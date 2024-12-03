package Grafos;

import java.util.*;

public class GrafoLista {
    public static void main(String[] args) {
        int n = 4; // Número de vértices
        ArrayList<ArrayList<Integer>> grafo = new ArrayList<>();

        // Inicializar las listas
        for (int i = 0; i < n; i++) {
            grafo.add(new ArrayList<>());
        }

        // Agregar aristas
        agregarArista(grafo, 0, 1);
        agregarArista(grafo, 0, 2);
        agregarArista(grafo, 1, 2);
        agregarArista(grafo, 2, 3);

        // Mostrar el grafo
        mostrarGrafo(grafo);
    }

    // Método para agregar una arista
    public static void agregarArista(ArrayList<ArrayList<Integer>> grafo, int i, int j) {
        grafo.get(i).add(j);
        grafo.get(j).add(i); // Para grafos no dirigidos
    }

    // Método para mostrar la lista de adyacencia
    public static void mostrarGrafo(ArrayList<ArrayList<Integer>> grafo) {
        System.out.println("Lista de Adyacencia:");
        for (int i = 0; i < grafo.size(); i++) {
            System.out.print(i + ": ");
            for (int vecino : grafo.get(i)) {
                System.out.print(vecino + " ");
            }
            System.out.println();
        }
    }
}
