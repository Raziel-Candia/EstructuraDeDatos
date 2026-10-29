package Pilas.HistorialNavegacion;

import java.util.Scanner;

public class PrincipalHistorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PilasHistorial historial = new PilasHistorial();
        int opcion;

        do {
            System.out.println("navegador");
            System.out.println("1. Visitar direccion web ");
            System.out.println("2. Ver pagina actual ");
            System.out.println("3. Regresar a pagina anterior");
            System.out.println("4. Mostrar historial completo");
            System.out.println("5. Salir");
            System.out.print("Selecciona una opcion: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("dame la URL: ");
                    String url = sc.nextLine();
                    historial.push(url);
                    break;
                case 2:
                    historial.peek();
                    break;
                case 3:
                    String regresada = historial.pop();
                    if (regresada != null) {
                        System.out.println("Saliendo de: " + regresada);
                    }
                    break;
                case 4:
                    historial.mostrarHistorial();
                    break;
                case 5:
                    System.out.println("Navegador cerrado");
                    break;
                default:
                    System.out.println("error");
            }
        } while (opcion != 5);

        sc.close();
    }
}
