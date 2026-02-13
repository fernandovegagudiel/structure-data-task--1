package com.tarea1;

import java.util.Arrays;      // Importar utilidades para arreglos
import java.util.ArrayList;  // Importar ArrayList

/**
 * Hello world!
 */
public class App {

    public static void main(String[] args) {

        System.out.println("Hola Mundo desde Java");

        // b) Multiplicación de dos números
        int Num1 = 3;
        int Num2 = 4;
        int resultado = Num1 * Num2;
        System.out.println("Resultado: " + resultado);

        // Investigación de arreglos en Java
        // ¿Cómo se declara un arreglo en Java?
        // Declaración de un arreglo con un valor fijo
        int[] numeros = new int[3];

        // Asignar valores a cada posición
        numeros[0] = 5;
        numeros[1] = 3;
        numeros[2] = 5;

        // Métodos y utilidades principales para arreglos

        //#1 Arrays.sort()
        // Sirve para ordenar los elementos dentro de un arreglo
        Arrays.sort(numeros);
        System.out.println("Arreglo ordenado: " + Arrays.toString(numeros));

        //#2 Arrays.binarySearch()
        // Buscar un elemento en un arreglo ordenado utilizando búsqueda binaria
        int indice1 = Arrays.binarySearch(numeros, 3);
        System.out.println("Índice de 3: " + indice1); // Imprime la posición del número 3

        //#3
        // Crear una nueva copia de un arreglo a partir de otro
        int[] copiaCorta = Arrays.copyOf(numeros, 3);
        System.out.println("Copia corta: " + Arrays.toString(copiaCorta));

        //#4
        // Llenar todos o parte de los elementos de un arreglo con un valor específico
        Arrays.fill(numeros, 4); // Llena todo con 4
        System.out.println(Arrays.toString(numeros));

        //#5
        // Convierte un array en una representación de cadena de caracteres
        System.out.println(Arrays.toString(numeros));

        // 4.3 ¿Cómo se recorren los arreglos en Java?
        // Este método usa un contador (i) para acceder a cada posición del arreglo.

        //#1
        int[] valores = {10, 20, 30, 40, 50};

        // Recorrer el arreglo usando índices
        for (int i = 0; i < valores.length; i++) {
            System.out.println("Elemento en posición " + i + ": " + valores[i]);
        }

        //#2
        // Este bucle recorre directamente los elementos del arreglo, sin necesidad de manejar índices
        String[] frutas = {"Manzana", "Banana", "Naranja"};

        // Recorrer el arreglo con for-each
        for (String fruta : frutas) {
            System.out.println("Fruta: " + fruta);
        }

        //#3
        // Usa la API de Streams para recorrer el arreglo de forma funcional.
        int[] numero = {5, 3, 8, 1};

        // Recorrer el arreglo usando Streams
        Arrays.stream(numero).forEach(num -> System.out.println("Número: " + num));

        // 4.4 Diferencias entre arreglos y ArrayList en Java

        // 1. ARREGLOS (Tamaño fijo)
        System.out.println("=== ARREGLOS ===");

        // Declaración de arreglo con tamaño fijo
        int[] numeros2 = new int[3];

        numeros2[0] = 10;
        numeros2[1] = 20;
        numeros2[2] = 30;

        // Mostrar elementos
        for (int i = 0; i < numeros2.length; i++) {
            System.out.println("Elemento " + i + ": " + numeros2[i]);
        }

        System.out.println("Tamaño del arreglo: " + numeros2.length);

        // 2. ARRAYLIST (Tamaño dinámico)
        System.out.println("\n=== ARRAYLIST ===");

        // Declaración de ArrayList
        ArrayList<Integer> lista = new ArrayList<>();

        // Agregar elementos dinámicamente
        lista.add(10);
        lista.add(20);
        lista.add(30);
        lista.add(40); // crece automáticamente

        // Mostrar elementos
        for (int i = 0; i < lista.size(); i++) {
            System.out.println("Elemento " + i + ": " + lista.get(i));
        }

        System.out.println("Tamaño del ArrayList: " + lista.size());

        // Eliminar elemento
        lista.remove(1); // elimina el elemento en posición 1

        System.out.println("\nDespués de eliminar posición 1:");
        for (int i = 0; i < lista.size(); i++) {
            System.out.println("Elemento " + i + ": " + lista.get(i));
        }

        // Diferencia de tipos primitivos
        System.out.println(" TIPOS ");

        // Arreglo acepta primitivos directamente
        int[] edades = {18, 20, 25};

        // ArrayList necesita clase envolvente (Integer)
        ArrayList<Integer> edadesLista = new ArrayList<>();
        edadesLista.add(18);
        edadesLista.add(20);
        edadesLista.add(25);

        System.out.println("Arreglo primera edad: " + edades[0]);
        System.out.println("ArrayList primera edad: " + edadesLista.get(0));

        // Conclusión rápida
        System.out.println("CONCLUSIÓN");
        System.out.println("Arreglo: tamaño fijo, más rápido, menos flexible.");
        System.out.println("ArrayList: tamaño dinámico, más flexible, más métodos disponibles.");
    }
}
