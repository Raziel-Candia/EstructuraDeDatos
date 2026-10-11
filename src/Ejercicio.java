public class Ejercicio {

    public static void main(String[] args) {

        int[][] numeros = new int [4][2];

        numeros[0][0] = 1;
        numeros[0][1] = 5;

        numeros[1][0] = 2;
        numeros[1][1] = 6;

        numeros[2][0] = 3;
        numeros[2][1] = 7;

        numeros[3][0] = 4;
        numeros[3][1] = 8;

        String[][] alumnos ={
                {"Jairo",  "Alondra",  "Sebas"},
                {"Angel",  "kevi",  "cris"},
                {"gera",  "panta",  "lucero"}
        };

        for (int i = 0; i < numeros.length; i++) {

            for (int j = 0; j < numeros[i].length; j++) {
                System.out.print(numeros[i][j]);

            }
            System.out.println();

        }



        for (int i = 0; i < alumnos.length; i++) {

            for (int j = 0; j < alumnos[i].length; j++) {
                System.out.print(alumnos[i][j]);

            }
            System.out.println();

        }

        alumnos[1][1]="irving";

        System.out.println("tamaño filas: " + numeros.length);

        System.out.println("tamañño columnas: " + numeros[0].length);

    }
}
