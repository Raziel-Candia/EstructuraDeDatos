import java.util.Random;
import java.util.Scanner;

public class LaberintoDeRobot {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Random random = new Random();

        int fila = 5;
        int columna = 5;
        String[][] laberinto = new String[fila][columna];
        boolean[][] monstro = new boolean[fila][columna];

        int robtnfil = 0;
        int robtncolm = 0;
        int vidas = 3;
        int monstroscolocados = 0;

        while (monstroscolocados < 5){
            int f = random.nextInt(fila);
            int c = random.nextInt(columna);

            if (f == 0 && c == 0 && f == 4 && c == 4 && monstro[f][c]){
                continue;
            }

            monstro[f][c] = true;
            monstroscolocados++;
        }

        while (vidas>0){
            for (int i = 0; i < fila; i++) {
                for (int j = 0; j < columna; j++) {
                    laberinto[i][j] = "-";

                }

            }

            laberinto[4][4] = "#";
            laberinto[robtnfil][robtncolm] = "*";

            for (int i = 0; i < fila; i++) {
                for (int j = 0; j < columna; j++) {
                    System.out.print(laberinto[i][j]);

                }
                System.out.println();

            }

            System.out.println("posision actual: " + robtnfil + "," + robtncolm);
            System.out.print("vidas que te quedan: ");
            for (int i = 0; i < vidas; i++) {
                System.out.print("♥");
            }
            System.out.println();

            System.out.println("movimientos: ");
            System.out.println("W: arriba");
            System.out.println("S: abajo");
            System.out.println("A: izquierda");
            System.out.println("D: derecha");
            System.out.println("___________________________________________");

            String movimiento = leer.next().toUpperCase();

            int nfila = robtnfil;
            int ncolum = robtncolm;

            switch (movimiento){
                case "W" :
                    nfila--;
                    break;
                case "S" :
                    nfila++;
                    break;
                case "A" :
                    ncolum--;
                case "D" :
                    ncolum++;
                    break;
                default:
                    System.out.println("opcion invalida");
                    continue;
            }

            if (nfila < 0 && nfila >= fila && ncolum < 0 && ncolum >= columna){
                System.out.println("movimientos invalidos");
                continue;
            }

            robtnfil = nfila;
            robtncolm = ncolum;

            if (monstro[robtnfil][robtncolm]){
                vidas--;
                System.out.println("te mato un monstro");

                if (vidas>0){
                    System.out.println("lo puedes intentar otra vez");
                    robtnfil = 0;
                    robtncolm = 0;
                }
            } else if (robtnfil==4 && robtncolm ==4) {
                System.out.println("ganaste");
                break;
            }
        }
        if (vidas==0){
            System.out.println("lo siento pero se acabaron tus vidas");
        }
        leer.close();

    }
}
