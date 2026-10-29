package Pilas.PilasLibros;

public class Libro {
    int codigo;
    String titulo;
    String autor;

    public Libro(int codigo, String titulo, String autor) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "Codigo: " + codigo + "  Titulo: " + titulo + " Autor: " + autor;
    }
}
