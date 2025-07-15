package models;

public class Book implements Comparable<Book>{

    private String titulo;
    private String autor;
    private int anio;
    
    public Book(String titulo, String autor, int anio) {
        this.titulo = titulo;
        this.autor = autor;
        this.anio = anio;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    @Override
    public String toString() {
        return "Book [titulo=" + titulo + ", autor=" + autor + ", anio=" + anio + "]";
    }

    @Override
    public int compareTo(Book other) {
        int tituloComp = other.titulo.compareTo(this.titulo); // Orden descendente por título
        if (tituloComp != 0) return tituloComp;

        int anioComp = Integer.compare(this.anio, other.anio); // Orden ascendente por año
        if (anioComp != 0) return anioComp;

        return 0; // Si título y año son iguales, se consideran duplicados
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Book)) return false;
        Book other = (Book) obj;
        return this.titulo.equals(other.titulo) && this.anio == other.anio;
    }

    @Override
    public int hashCode() {
        return titulo.hashCode() + Integer.hashCode(anio);
    }
}
