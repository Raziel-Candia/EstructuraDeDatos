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

    public void InsertarPosision(int datoN, int datoBus){
        NodoDB nuevodato = new NodoDB(datoN);

        if (inicio==null){
            return;
        } else {
            NodoDB actual=inicio;
            while (actual!= null){
                if (actual.dato ==datoBus){
                    nuevodato.siguiente= actual.siguiente;
                    nuevodato.anterior=actual;
                    actual.siguiente=nuevodato;
                    if (actual.siguiente!=null){
                        actual.siguiente.anterior=nuevodato;
                    }
                }
                actual = actual.siguiente;
            }

        }

    }

    public void MostrarDeFinAInicio(){
        NodoDB actual=inicio;

        while (actual.siguiente!=null){
            actual=actual.siguiente;

        }
        while (actual!=null){
            System.out.print(actual.dato + "--->");
            actual=actual.anterior;
        }

    }
}


