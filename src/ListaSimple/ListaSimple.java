package ListaSimple;
public class ListaSimple {

    private Nodo inicio;

    public void ListaSimple(){
        this.inicio = null;
    }

    public void InsertarInicio(int nuevoDato){
        Nodo ultimo = new Nodo(nuevoDato);

        if (inicio == null) {
            inicio = ultimo;
            return;
        }
        Nodo actual = inicio;
        while (actual.siguiente != null) {
            actual = actual.siguiente;
        }
        actual.siguiente = ultimo;
    }
    
    public void mostrar(){
        Nodo actual = inicio;

        while (actual != null){
            System.out.print(actual.dato + " -->");
            actual = actual.siguiente;
        }
    }

    public boolean buscar(int dato){
        Nodo actual = inicio;

        while (actual != null){
            if (actual.dato == dato){
                return true;
            }

            actual = actual.siguiente;
        }
        return false;
    }

    public void Eliminar(int dato){
        Nodo actual = inicio;
        Nodo anterior = null;


        while (inicio!= null && inicio.dato == dato) {
            inicio = inicio.siguiente;
        }
        if(inicio== null) return;


        while (actual != null) {
            if (actual.dato == dato){
                anterior.siguiente = actual.siguiente;
            }else {
                anterior = actual;
            }
            actual = actual.siguiente;
        }

        if(anterior != null && anterior.dato == dato)
        {
            inicio= null;
        }

    }
}



    //anterior es igual a actual anterior.siguiente es igual a actual .siguente
    //con el ultimo es el anterior es igual a nulo


