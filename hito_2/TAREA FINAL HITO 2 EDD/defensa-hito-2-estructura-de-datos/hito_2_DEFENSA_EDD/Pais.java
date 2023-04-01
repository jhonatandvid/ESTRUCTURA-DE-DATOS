package hito_2_DEFENSA_EDD;

public class Pais {

    private String nombre;
    private int nroDepartamentos;
    private Departamento[] Departamento;

    public Pais(String nombre, int nroDepartamentos,Departamento[] departamento){
        this.nombre=nombre;
        this.nroDepartamentos = nroDepartamentos;
        this.Departamento = departamento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNroDepartamentos() {
        return nroDepartamentos;
    }

    public void setNroDepartamentos(int nroDepartamentos) {
        this.nroDepartamentos = nroDepartamentos;
    }

    public hito_2_DEFENSA_EDD.Departamento[] getDepartamento() {
        return Departamento;
    }

    public void setDepartamento(hito_2_DEFENSA_EDD.Departamento[] departamento) {
        Departamento = departamento;
    }

    public void MostrarPais(){
        System.out.println("El pais: "+this.getNombre()+" con "+getNroDepartamentos()+" departamentos, cuyos departamentos son:");
        for(int i=0;i<this.getDepartamento().length;i++)
        {
            this.Departamento[i].MostrarDepartamento();
        }
    }

    public void AgregarNuevoDepartamento(Departamento depa){

        Departamento[] nuevosDeps = new Departamento[Departamento.length+1];
        for(int i=0;i<this.Departamento.length;i++)
        {
            nuevosDeps[i]=Departamento[i];
        }
        nuevosDeps[this.Departamento.length]=depa;
        setDepartamento(nuevosDeps);
        setNroDepartamentos(getNroDepartamentos()+1);
    }
}
