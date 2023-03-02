package Ejercicios;

public class Ejercicios
{
    private int i ;
    private int limite ;
    public Ejercicios()
    {
        this.i = 1;
        this.limite =10;
    }
    public void mostrarMensaje()
    {
        System.out.println("Hola mundo desde Java");
    }

    public void generarNumerosNaturalesFOR()
    {

        for (i = 1; i <= limite; i++)
        {
            System.out.print(i + " ; ");
        }
    }

    public void generarNumerosParesFor()
    {

        for (i = 1; i <= limite; i++)
        {
            if(i%2==0)
            {
                System.out.print(i + " ; ");
            }

        }
    }
    public void generarNumerosNaturalesWHILE()
    {

        while (i <= 10)
        {
            System.out.print(i + " ; ");
            i+=1;
        }
    }
}




