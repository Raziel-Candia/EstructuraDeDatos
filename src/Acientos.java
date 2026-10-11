import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Acientos {
    private static final int fila = 5;
    public static final int colm = 6;
    public static final String[][] sala = new String[fila][colm];
    private static final Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
        inicializarSala();
        inicializarSistemReser();
        repoFinal();
    }

    public static void inicializarSala() {
        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < colm; j++) {
                sala[i][j] = "esta libre";
            }
        }
    }

    public static void mostrarSala() {
        System.out.println("****SALAAAAAAA****");
        System.out.print("Columnas: ");
        for (int j = 1; j <= colm; j++) {
            System.out.print(j + "      ");
        }
        System.out.println();

        for (int i = 0; i < fila; i++) {
            System.out.print("fila " + (i + 1) + ":");
            for (int j = 0; j < colm; j++) {
                if (sala[i][j].equals("ocupado")) {
                    System.out.print("[Ocupado]");
                } else {
                    System.out.print("[Libre]");
                }
            }
            System.out.println();
        }
        System.out.println("******************************************************");
    }

    public static void inicializarSistemReser() {
        boolean cont = true;
        while (cont) {
            mostrarSala();
            System.out.println("Nueva reservación");

            System.out.print("Pon la fila (1-" + fila + "): ");
            int filanew = leerEntero();

            System.out.print("Pon la columna (1-" + colm + "): ");
            int colmnew = leerEntero();


            if (filanew < 1 && filanew > fila && colmnew < 1 && colmnew > colm) {
                System.out.println(" asiento fuera del rango");
                continue;
            }

            int filanum = filanew - 1;
            int colmnum = colmnew - 1;

            if (sala[filanum][colmnum].equals("ocupado")) {
                System.out.println(" esta ocupado");
            } else {
                sala[filanum][colmnum] = "ocupado";
                System.out.println(" lista ya esta tu reservacion en (Fila " + filanew + ", Columna " + colmnew + ").");

                System.out.print("quieres hacer otra reservación? s/n ");
                String resp = leer.next().trim().toLowerCase();
                if (!resp.equals("s")) {
                    cont = false;
                }
            }
        }
    }

    private static int leerEntero() {
        while (!leer.hasNextInt()) {
            System.out.println("numero no valido");
            leer.next();
        }
        return leer.nextInt();
    }

    private static void repoFinal() {
        int ocupado = 0;
        int libre = 0;
        int[] ocupadoPorFila = new int[fila];

        for (int i = 0; i < fila; i++) {
            int ocupadoFila = 0;
            for (int j = 0; j < colm; j++) {
                if (sala[i][j].equals("ocupado")) {
                    ocupadoFila++;
                } else {
                    libre++;
                }
            }
            ocupadoPorFila[i] = ocupadoFila;
            ocupado += ocupadoFila;
        }

        System.out.println("========== RESUMEN ===========");
        System.out.println("asientos ocupados: " + ocupado);
        System.out.println("asientos libres:   " + libre);

        int maxOcupacion = 0;
        for (int cant : ocupadoPorFila) {
            if (cant > maxOcupacion) {
                maxOcupacion = cant;
            }
        }

        if (maxOcupacion == 0) {
            System.out.println("no hay reservaciones");
            return;
        }

        List<Integer> filasConMax = new ArrayList<>();
        for (int i = 0; i < fila; i++) {
            if (ocupadoPorFila[i] == maxOcupacion) {
                filasConMax.add(i + 1);
            }
        }

        if (filasConMax.size() > 1) {
            System.out.println("hay un empate en las filas con mas reservas ("
                    + maxOcupacion + " asientos): filas " + filasConMax);
        } else {
            System.out.println("fila con mas asientos ocupados es la "
                    + filasConMax.get(0) + " (" + maxOcupacion + " asientos)");
        }
    }
}