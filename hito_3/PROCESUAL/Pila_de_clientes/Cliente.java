package Pila_de_clientes;

public class Cliente {

    private String nombres;
    private String apellidos;
    private int edad;
    private String direccion;
    private String genero;
    public Cliente(String nom,String ape,int ed,String dir,String gen){
        this.nombres = nom;
        this.apellidos = ape;
        this.edad = ed;
        this.direccion = dir;
        this.genero = gen;

    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
    public void MuestraCliente(){
        System.out.println("MOSTRANDO DATOS DEL CLIENTE:");
        System.out.println("Nombre: "+nombres);
        System.out.println("Apellidos: "+apellidos);
        System.out.println("Edad: "+edad);
        System.out.println("Direccion: "+direccion);
        System.out.println("Genero: "+genero);
        System.out.println();
    }
}
