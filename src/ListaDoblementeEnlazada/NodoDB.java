package ListaDoblementeEnlazada;
public class NodoDB {

    int dato;
    NodoDB siguiente;
    NodoDB anterior;

    public NodoDB(int dato) {
        this.dato = dato;
        this.siguiente = null;
        this.anterior = null;
    }
}