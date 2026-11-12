package BurbujaYseleccion;
import java.util.Scanner;

public class Seleccion {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] precios = new double[8];

        capturarPrecios(precios, scanner);

        System.out.print("precios originales: ");
        mostrarArreglo(precios);

        System.out.println("ordenar por seleccion");
        ordenarSeleccion(precios);

        System.out.print("los presios ya ordenados son: ");
        mostrarArreglo(precios);
        scanner.close();
    }


    public static void capturarPrecios(double[] arreglo, Scanner scanner) {
        System.out.println("pon los precios de " + arreglo.length + " productos: ");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print("producto " + (i + 1));
            arreglo[i] = scanner.nextDouble();
        }
    }

    public static void mostrarArreglo(double[] arreglo) {
        System.out.print(" ");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.printf(" ", arreglo[i]);
            if (i < arreglo.length - 1) {
                System.out.print(" - ");
            }
        }
        System.out.println(" ");
    }

    public static void ordenarSeleccion(double[] arreglo) {
        int n = arreglo.length;
        for (int i = 0; i < n - 1; i++) {
            int indiceMenor = i;


            for (int j = i + 1; j < n; j++) {
                if (arreglo[j] < arreglo[indiceMenor]) {
                    indiceMenor = j;
                }
            }


            System.out.printf("Pasada %d menor que se encontro: %.2f en la posision %d",
                    (i + 1), arreglo[indiceMenor], indiceMenor);


            double temp = arreglo[indiceMenor];
            arreglo[indiceMenor] = arreglo[i];
            arreglo[i] = temp;


            System.out.print(" vuelta " + (i + 1) + ": ");
            mostrarArreglo(arreglo);
            System.out.println();
        }
    }
}