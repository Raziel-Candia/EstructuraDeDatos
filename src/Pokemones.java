public class Pokemones <A,R>{
    private A nombre;
    private R poder;

    public Pokemones(A nombre, R poder){
        this.nombre = nombre;
        this.poder = poder;
    }

    public void ver(){
        System.out.println("nombre del pokemon: " + nombre);
        System.out.println("poder: " + poder);
    }

}
