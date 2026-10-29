package Pilas.PilasLibros;

public class PilaLibro {
    private NodoLibro cima;

    public PilaLibro() {
        this.cima = null;
    }

    public void push(Libro libro) {
        NodoLibro nuevo = new NodoLibro(libro);
        nuevo.siguiente = cima;
        cima = nuevo;
        System.out.println("Libro correctamente puesto");
    }

    public Libro pop() {
        if (isEmpty()) {
            System.out.println("pila vacia");
            return null;
        }
        Libro retirado = cima.libro;
        cima = cima.siguiente;
        return retirado;
    }

    public void peek() {
        if (isEmpty()) {
            System.out.println("pila vacia");
        } else {
            System.out.println("libro hasta arriba: ");
            System.out.println(cima.libro);
        }
    }

    public void mostrar() {
        if (isEmpty()) {
            System.out.println("pila vacia");
            return;
        }
        System.out.println("libros");
        NodoLibro actual = cima;
        while (actual != null) {
            System.out.println(actual.libro);
            actual = actual.siguiente;
        }
    }

    public boolean isEmpty() {
        return cima == null;
    }
}
