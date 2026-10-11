public class ClaseGenerica<T> implements interfazGenerica<T>{

    private T contenido;


    public ClaseGenerica(T contenido){

        this.contenido = contenido;
    }

    public T getContenido(){
        return contenido;
    }


    public void mostrarContenido(){
        System.out.println("contenido: " + contenido);
    }

    @Override
    public void guardar(T dato){
        contenido = dato;
    }

}

