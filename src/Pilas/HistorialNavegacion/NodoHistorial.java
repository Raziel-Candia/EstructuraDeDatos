package Pilas.HistorialNavegacion;

public class NodoHistorial {
    String url;
    NodoHistorial siguiente;

    public NodoHistorial(String url) {
        this.url = url;
        this.siguiente = null;
    }
}
