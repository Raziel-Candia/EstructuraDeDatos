package Pilas.PilasLibros;

import java.util.Scanner;

public class PrincipalLibro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PilaLibro biblioteca = new PilaLibro();
        int opcion;

        do {
            System.out.println("Librosss");
            System.out.println("1. Apilar libro");
            System.out.println("2. Retirar libro superior");
            System.out.println("3. Consultar libro en la cima");
            System.out.println("4. Mostrar todos los libros");
            System.out.println("5. Salir");
            System.out.print("Selecciona una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Codigo: ");
                    int codigo = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Titulo: ");
                    String titulo = sc.nextLine();
                    System.out.print("Autor: ");
                    String autor = sc.nextLine();

                    biblioteca.push(new Libro(codigo, titulo, autor));
                    break;
                case 2:
                    Libro retirado = biblioteca.pop();
                    if (retirado != null) {
                        System.out.println("Libro que se quito: " + retirado.titulo);
                    }
                    break;
                case 3:
                    biblioteca.peek();
                    break;
                case 4:
                    biblioteca.mostrar();
                    break;
                case 5:
                    System.out.println("finnn");
                    break;
                default:
                    System.out.println("error");
            }
        } while (opcion != 5);

        sc.close();
    }
}