package hito_2_DEFENSA_EDD;

public class Provincia {

    private String nombre ;

    public Provincia(String nombre){
        this.nombre=nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void Muestraprovincia(){
            System.out.println("Las provincias son: "+this.getNombre());

    }
}
