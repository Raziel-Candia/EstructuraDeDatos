package BurbujaYseleccion;

import java.util.Arrays;
import java.util.Scanner;

public class Burbuja {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] calificaciones = new int[10];

        capturarCalificacion(calificaciones, sc);
        System.out.println("Calificaciones: ");
        mostrarArreglo(calificaciones);

        System.out.println("ordenar en burbuja: ");
        ordenarBurbuja(calificaciones);

        System.out.println("las calificaciones ya ordenadas son: ");
        mostrarArreglo(calificaciones);

        System.out.println("calificacion menor: " + calificaciones[0]);
        System.out.println("calificacion mayor: " + calificaciones[calificaciones.length - 1]);
        sc.close();
    }

    public static void capturarCalificacion(int[] arreglo, Scanner scanner) {
        System.out.println("pon las calificaciones de " + arreglo.length + " estudiantes:");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print("estudiante " + (i + 1) + ": ");
            arreglo[i] = scanner.nextInt();
        }
    }


    public static void mostrarArreglo(int[] arreglo) {
        System.out.println(Arrays.toString(arreglo));
    }


    public static void ordenarBurbuja(int[] arreglo) {
        int n = arreglo.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arreglo[j] > arreglo[j + 1]) {
                    int temp = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = temp;
                }
            }
            System.out.print("vuelta " + (i + 1) + ": ");
            mostrarArreglo(arreglo);
        }
    }
}
