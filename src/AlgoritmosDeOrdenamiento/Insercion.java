package AlgoritmosDeOrdenamiento;

import java.util.Arrays;
import java.util.Scanner;

public class Insercion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int totalEstudiante = 10;
        int[] calificacion = new int[totalEstudiante];

        System.out.println("dame las calificaciones de " + totalEstudiante + "estudiantes");
        for (int i = 0; i < totalEstudiante; i++) {
            System.out.print("estudiante " + (i+1) + ":");
            calificacion[i] = sc.nextInt();
        }
        System.out.print("arreglo de los estudiantes inicial: " + Arrays.toString(calificacion));

        int totalDesplasamientos = Insercion(calificacion);
        System.out.println("arreglo de estudiantes ordenado de menos a mas: " + Arrays.toString(calificacion));
        System.out.print("total de inserciones: " + totalDesplasamientos);
        System.out.print("menor: " + calificacion[0]);
        System.out.print("mayor: " + calificacion[calificacion.length-1]);

        sc.close();
    }

    public static int Insercion (int[] arreglo) {
        int totalDesplasamientos=0;
        for (int i = 1; i < arreglo.length; i++) {
            int cla = arreglo[i];
            int j =  i -1;
            int desplaz = 0;
            while (j >= 0 && arreglo[j] > cla) {
               arreglo[j +1] = arreglo[j];
               j--;
               desplaz++;
                totalDesplasamientos++;
            }
            arreglo[j+1]=cla;

            System.out.println( Arrays.toString(arreglo));
        }
        return totalDesplasamientos;
    }

}
