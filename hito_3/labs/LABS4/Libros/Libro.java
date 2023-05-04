package Libros;

public class Libro {
    private String autor;
    private int rnoPag;
    private double precio;
    private String titulo;
    private String categoria;

    public Libro(String autor, int rnoPag, double precio, String titulo, String categoria) {
        this.autor = autor;
        this.rnoPag = rnoPag;
        this.precio = precio;
        this.titulo = titulo;
        this.categoria = categoria;
    }

    public String getAutor() {
        return autor;
    }

    public int getRnoPag() {
        return rnoPag;
    }

    public double getPrecio() {
        return precio;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setRnoPag(int rnoPag) {
        this.rnoPag = rnoPag;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void MostrarLibro(){
        System.out.println("MOSTRANDO LIBRO");
        System.out.println("Autor: "+autor);
        System.out.println("Numero de paginas: "+rnoPag);
        System.out.println("Precio: "+precio);
        System.out.println("Titulo: "+titulo);
        System.out.println("Categoria: "+categoria);
        System.out.println();
    }
}
