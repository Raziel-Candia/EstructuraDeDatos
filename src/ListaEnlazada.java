public class ListaEnlazada {

    private NodoDB inicio;

    public void ListaEnlazada(){
        this.inicio = null;

    }

    public void InsertarInicio(int nuevoDato) {
        NodoDB nuevo = new NodoDB(nuevoDato);
        if (inicio == null) {
            inicio = nuevo;
        } else {
            inicio.anterior = nuevo;
            nuevo.siguiente = inicio;
            inicio = nuevo;
        }
    }

    public void InsertarFinal(int dato){
        NodoDB nuevo= new NodoDB(dato);
        if (inicio==null){
            inicio=nuevo;
        } else {
            NodoDB actual=inicio;
            while (actual.siguiente != null){
                actual = actual.siguiente;
            }

            nuevo.anterior =actual;
            actual.siguiente = nuevo;

        }
    }
    public void mostrar(){
        NodoDB actual = inicio;

        while (actual != null){
            System.out.print(actual.dato + " -->");
            actual = actual.siguiente;
        }
    }
}


