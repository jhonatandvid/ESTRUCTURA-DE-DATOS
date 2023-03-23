package Nombres;

public class Nombre{
    private String paralelo;
    private String[] nombres;

    public Nombre(String paralelo, String[] nombres)
    {
        this.nombres=nombres;
        this.paralelo=paralelo;
    }

    public String getParalelo() {
        return paralelo;
    }

    public void setParalelo(String paralelo) {
        this.paralelo = paralelo;
    }

    public String[] getNombres() {
        return nombres;
    }

    public void setNombres(String[] nombres) {
        this.nombres = nombres;
    }

    public void MostrarNombre()
    {
        System.out.println("MOSTRANDO CLASES");
        System.out.println("Paralelo:"+this.getParalelo());
        System.out.println("Nombres:");
        for(int i=0; i<this.getNombres().length ; i++)
        {
            System.out.print(this.nombres[i]+ ",");
        }
        System.out.println();
    }
}
