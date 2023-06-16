package Colas.Defensa_colas_H4;

public class Cliente {

    private String Nombre;
    private String Apellido;
    private int edad;
    private String Pais;
    private String Genero;
    private String Tipo;
    private int Cliente_id;

    public Cliente(String nombre, String apellido, int edad, String pais, String genero, String tipo,int cliente_id) {
        this.Nombre = nombre;
        this.Apellido = apellido;
        this.edad = edad;
        this.Pais = pais;
        this.Genero = genero;
        this.Tipo = tipo;
        this.Cliente_id = cliente_id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String apellido) {
        Apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getPais() {
        return Pais;
    }

    public void setPais(String pais) {
        Pais = pais;
    }

    public String getGenero() {
        return Genero;
    }

    public void setGenero(String genero) {
        Genero = genero;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String tipo) {
        Tipo = tipo;
    }

    public int getCliente_id() {
        return Cliente_id;
    }

    public void setCliente_id(int cliente_id) {
        Cliente_id = cliente_id;
    }

    public void MuestraCliente(){
        System.out.println("MOSTRANDO DATOS DEL CLIENTE");
        System.out.println("Nombre: "+this.Nombre);
        System.out.println("Apellido: "+this.Apellido);
        System.out.println("Edad: "+this.edad);
        System.out.println("Pais: "+this.Pais);
        System.out.println("Genero: "+this.Genero);
        System.out.println("Tipo: "+this.Tipo);
        System.out.println("Cliente_id: "+this.Cliente_id);
        System.out.println();
    }
}
