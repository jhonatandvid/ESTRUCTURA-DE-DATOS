package Nombres;

public class main {

    public static void main(String[] args) {

        String[] nombres = new String[5];
        nombres[0] ="Ana";
        nombres[1] ="Juan";
        nombres[2] ="Pepito";
        nombres[3] ="Carla";
        nombres[4] ="Freddy";

        Nombre edd = new Nombre("EDD",nombres);
        edd.MostrarNombre();
        //=========cuantos usuarios tienen el nombre pepito=======//
        determinaNombre(edd);
    }
    public static int determinaNombre(Nombre edd)
    {
        String[] nombres = edd.getNombres();
        int nombrepepito = 0;
        for(int i=1; i<nombres.length ; i++)
        {
            if(nombres[i]=="Pepito")
            {
                nombrepepito += 1;
            }
        }
        System.out.println("CUANTOS ESTUDIANTES PEPITOS HAY: "+ nombrepepito);
        return nombrepepito;
    }
}
