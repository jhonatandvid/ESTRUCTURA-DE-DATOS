package hito_2_DEFENSA_EDD;

public class Departamento {
    private String nombre;
    private int nroProvincias;
    private Provincia[] provincias;

    public Departamento(String nombre,int nroProvincias,Provincia[] provincia){
        this.nombre=nombre;
        this.nroProvincias=nroProvincias;
        this.provincias=provincia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNroProvincias() {
        return nroProvincias;
    }

    public void setNroProvincias(int nroProvincias) {
        this.nroProvincias = nroProvincias;
    }

    public Provincia[] getProvincias() {
        return provincias;
    }

    public void setProvincias(Provincia[] provincias) {
        this.provincias = provincias;
    }

    public void MostrarDepartamento(){

        System.out.println("El departamento :"+ this.getNombre()+" con " + this.nroProvincias+" las provincias son:  ");
        for(int i=0;i<this.getProvincias().length;i++)
        {
            this.provincias[i].Muestraprovincia();
        }
    }

    public void AgregarProvincia(Provincia provi){

        Provincia[] nuevosPro = new Provincia[this.provincias.length+1];
        for(int i=0;i<this.provincias.length;i++)
        {
            nuevosPro[i]=provincias[i];
        }
        nuevosPro[this.provincias.length]=provi;
        setProvincias(nuevosPro);
        setNroProvincias(getNroProvincias()+1);
    }
}
