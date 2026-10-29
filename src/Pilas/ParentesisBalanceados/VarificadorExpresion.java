package Pilas.ParentesisBalanceados;

import java.util.Scanner;

public class VarificadorExpresion {

    public static boolean esBalanceada(String expresion) {
        PilaChar pila = new PilaChar();

        for (int i = 0; i < expresion.length(); i++) {
            char c = expresion.charAt(i);


            if (c == '(') {
                pila.push(c);
            }

            else if (c == ')') {

                if (pila.isEmpty()) {
                    return false;
                }
                pila.pop();
            }
        }


        return pila.isEmpty();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("verifica los parentecis");
            System.out.println("1. Evaluar expresion");
            System.out.println("2. Salir");
            System.out.print("Selecciona una opción: ");
            opcion = sc.nextInt();
            sc.nextLine();

            if (opcion == 1) {
                System.out.print("pon la expresion: ");
                String expresion = sc.nextLine();

                if (esBalanceada(expresion)) {
                    System.out.println("Resultado: La expresion es correcta");
                } else {
                    System.out.println("Resultado: La expresion es incorrecta");
                }
            }

        } while (opcion != 2);

        sc.close();
    }
}