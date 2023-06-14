package Colas.ColaDeLibros;

public class libro {

    private int CodigoDeLibro;
    private String autor;
    private String Genero;
    private String categoria;
    private int Paginas;

    public libro(int codigoDeLibro, String autor, String genero, String categoria, int paginas) {
        this.CodigoDeLibro = codigoDeLibro;
        this.autor = autor;
        this.Genero = genero;
        this.categoria = categoria;
        this.Paginas = paginas;
    }

    public int getCodigoDeLibro() {
        return CodigoDeLibro;
    }

    public void setCodigoDeLibro(int codigoDeLibro) {
        CodigoDeLibro = codigoDeLibro;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getGenero() {
        return Genero;
    }

    public void setGenero(String genero) {
        Genero = genero;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getPaginas() {
        return Paginas;
    }

    public void setPaginas(int paginas) {
        Paginas = paginas;
    }

    public void MostrarLibro(){
        System.out.println("MOSTRANDO LIBRO");
        System.out.println("Codigo: "+CodigoDeLibro);
        System.out.println("Autor: "+autor);
        System.out.println("Genero: "+Genero);
        System.out.println("Categoria: "+categoria);
        System.out.println("Pagina: "+Paginas);
        System.out.println();
    }
}
