import java.util.Scanner;

public class Estacionamiento {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String carro = "\uD83D\uDE98";
        String vacio = "⬜";

        String[][] estacionamiento = {
                {carro, vacio, vacio, carro},
                {vacio, carro, vacio, vacio},
                {carro, vacio, carro, vacio}
        };

        int opcion = 0;

        while (opcion !=1){
            for (int i = 0; i < estacionamiento.length; i++) {
                for (int j = 0; j < estacionamiento.length; j++) {
                    System.out.print(estacionamiento[i][j] + " ");

                }
                System.out.println();

            }
            System.out.println("ingresa la fila: ");
            int fila = teclado.nextInt();

            System.out.println("ingresa la comuna: ");
            int columna = teclado.nextInt();

            if (fila >= 0 && fila < estacionamiento.length && columna >= 0 && columna < estacionamiento[fila].length){
                if (estacionamiento[fila][columna].equals(vacio)){
                    estacionamiento[fila][columna] = carro;
                    System.out.println("el carro se estaciono correctamente");

                }else {
                    System.out.println("el espacio esta ocupado");
                }

            }else {
                System.out.println("lugares invalidos, fuera del rango");
            }

            System.out.println("***************************************************************************");

            System.out.println("presiona 1 para salir, o presiona otro numero para salir");
            opcion = teclado.nextInt();

        }
    }
}
