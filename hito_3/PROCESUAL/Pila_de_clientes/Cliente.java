package Pila_de_clientes;

public class Cliente {
    private String nombre;
    private String apellido;
    private int edad;
    private String direccion;
    private String Genero;

    public Cliente(String nombre,String apellido,int edad,String direccion,String genero){
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.direccion = direccion;
        this.Genero = genero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
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
        return Genero;
    }

    public void setGenero(String genero) {
        Genero = genero;
    }
    public void MuestraCliente(){
        System.out.println("\nMOSTRANDO DATOS DE LOS CLIENTES: \n");
        System.out.println("Nombre: "+this.nombre);
        System.out.println("Apellido: "+apellido);
        System.out.println("Edad: "+edad);
        System.out.println("Direccion: "+direccion);
        System.out.println("Genero: "+Genero);

    }
}
