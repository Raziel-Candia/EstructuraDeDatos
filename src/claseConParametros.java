public class claseConParametros <T, U>{

    private T primero;
    private U segundo;

    public claseConParametros(T primero, U segundo){
        this.primero = primero;
        this.segundo = segundo;

    }

    public void mostrar(){
        System.out.println(primero);
        System.out.println(segundo);
    }
}
