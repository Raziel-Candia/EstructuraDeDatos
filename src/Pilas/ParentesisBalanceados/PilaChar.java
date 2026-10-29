package Pilas.ParentesisBalanceados;

public class PilaChar {
    private NodoChar cima;

    public PilaChar() {
        this.cima = null;
    }

    public void push(char c) {
        NodoChar nuevo = new NodoChar(c);
        nuevo.siguiente = cima;
        cima = nuevo;
    }

    public Character pop() {
        if (isEmpty()) {
            return null;
        }
        char c = cima.caracter;
        cima = cima.siguiente;
        return c;
    }

    public boolean isEmpty() {
        return cima == null;
    }
}
