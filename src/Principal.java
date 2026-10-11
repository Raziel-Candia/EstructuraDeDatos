public class Principal {

    public static void main(String[] args) {
        ClaseGenerica<Boolean> caja1 = new ClaseGenerica<>(true);
        ClaseGenerica<String> caja2 = new ClaseGenerica<>("4C");
        ClaseGenerica<Integer> caja3 = new ClaseGenerica<>(1223456);

        caja1.mostrarContenido();
        caja2.mostrarContenido();
        caja3.mostrarContenido();

        System.out.println("----------------------------------------------------------------------");

        metodoGenerico("hola");
        metodoGenerico(false);
        metodoGenerico(252520.5);
        metodoGenerico(2548852);

        System.out.println("-----------------------------------------------------");
        claseConParametros<String, Integer> caja4 = new claseConParametros<String, Integer>("4C", 325);
        claseConParametros<Boolean, Double> caja5 = new claseConParametros<Boolean, Double>(true, 325.256);

        caja4.mostrar();
        caja5.mostrar();

        System.out.println("----------------------------------------------------");

        Pokemones<String, Integer> caja6 = new Pokemones<String,Integer>("pikachu", 26);
        Pokemones<String, Double> caja7 = new Pokemones<String,Double>("pikachu", 2.6);

        caja6.ver();
        caja7.ver();


    }


    public static<T> void metodoGenerico(T dato){

        System.out.println("Dato recibido: " + dato);
    }

}
