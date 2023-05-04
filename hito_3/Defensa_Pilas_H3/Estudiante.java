package Defensa_Pilas_H3;

public class Estudiante {
    private String nombres;
    private String apellidos;
    private int edad;
    private String cede;
    private int notafinal;
    private String CI;

    public Estudiante(String nombres, String apellidos, int edad, String cede, int notafinal, String CI) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.edad = edad;
        this.cede = cede;
        this.notafinal = notafinal;
        this.CI = CI;
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

    public String getCede() {
        return cede;
    }

    public void setCede(String cede) {
        this.cede = cede;
    }

    public int getNotafinal() {
        return notafinal;
    }

    public void setNotafinal(int notafinal) {
        this.notafinal = notafinal;
    }

    public String getCI() {
        return CI;
    }

    public void setCI(String CI) {
        this.CI = CI;
    }
    public void muestraEstudiante(){
        System.out.println("\nMOSTRANDO DATOS DEL ESTUDIANTE:\n ");
        System.out.println("Nombre: "+nombres);
        System.out.println("Apellido: "+this.apellidos);
        System.out.println("Edad: "+this.edad);
        System.out.println("Sede: "+this.cede);
        System.out.println("Nota final: "+this.notafinal);
        System.out.println("CI: "+this.CI);

    }
}
