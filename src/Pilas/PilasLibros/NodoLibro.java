package Pilas.PilasLibros;

class NodoLibro {
    Libro libro;
    NodoLibro siguiente;

    public NodoLibro(Libro libro) {
        this.libro = libro;
        this.siguiente = null;
    }
}
