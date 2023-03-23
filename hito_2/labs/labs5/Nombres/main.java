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
        //=========AGREGAR MUEVO NOMBRE=======//
        //agregarNombre(edd,"Jhonatan");
        //edd.MostrarNombre();

        cuentaNombres(edd,"Freddy");
        //=========AGREGAR MUEVO NOMBRE AL FINAL=======//
        //agregarNombreFinal(edd,"Jhonatan");
        //METODO DEL ING
        agregarNombreFinalv2(edd,"Jhonatan");
        edd.MostrarNombre();

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


    public static int cuentaNombres(Nombre edd,String nombreBuscar)
    {
        String[] nombres = edd.getNombres();

        int cont = 0;
        for(int i=0; i<nombres.length ; i++)
        {
            if(nombres[i]==nombreBuscar)
            {
                cont += 1;
            }
        }
        System.out.println("CUANTOS ESTUDIANTES PEPITOS HAY: "+ cont);
        return cont;
    }

    public static void agregarNombre(Nombre edd,String nom)
    {
        String[] nombresOri = edd.getNombres();
        String[] nuevosNombres = new String[nombresOri.length+1];
        nuevosNombres[0]=nom;
        for(int i=0; i<nombresOri.length ; i++)
        {
            nuevosNombres[i+1]=nombresOri[i];
        }
        edd.setNombres(nuevosNombres);
    }

    public static void agregarNombreFinal(Nombre edd,String nom)
    {
        String[] nombresOri = edd.getNombres();
        String[] nuevosNombres = new String[nombresOri.length+1];

        for(int i=0; i<nombresOri.length ; i++)
        {
            nuevosNombres[i]=nombresOri[i];
            if(nombresOri[i]==nombresOri[4]){

                nuevosNombres[i+1]=nom;
            }
        }
        edd.setNombres(nuevosNombres);
    }
    //METODO DEL ING
    public static void agregarNombreFinalv2(Nombre edd,String nom)
    {
        String[] nombresOri = edd.getNombres();
        String[] nuevosNombres = new String[nombresOri.length+1];

        for(int i=0; i<nombresOri.length ; i++)
        {
            nuevosNombres[i]=nombresOri[i];
        }
        nuevosNombres[nombresOri.length]=nom;
        edd.setNombres(nuevosNombres);
    }

}
