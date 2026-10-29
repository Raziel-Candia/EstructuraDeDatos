package Pilas.HistorialNavegacion;

class PilasHistorial {
    private NodoHistorial cima;

    public PilasHistorial() {
        this.cima = null;
    }

    public void push(String url) {
        NodoHistorial nuevo = new NodoHistorial(url);
        nuevo.siguiente = cima;
        cima = nuevo;
        System.out.println("visitando: " + url);
    }

    public String pop() {
        if (isEmpty()) {
            System.out.println("No hay pag anteriores en el historial");
            return null;
        }
        String urlEliminada = cima.url;
        cima = cima.siguiente;
        return urlEliminada;
    }

    public void peek() {
        if (isEmpty()) {
            System.out.println("No hay paginas");
        } else {
            System.out.println("Pagina actual: " + cima.url);
        }
    }

    public void mostrarHistorial() {
        if (isEmpty()) {
            System.out.println("el historial esta en blanco");
            return;
        }
        System.out.println("Historial");
        NodoHistorial actual = cima;
        while (actual != null) {
            System.out.println("-> " + actual.url);
            actual = actual.siguiente;
        }
    }

    public boolean isEmpty() {
        return cima == null;
    }
}
