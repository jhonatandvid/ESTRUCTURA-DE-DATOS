public class Main {
    public static void main(String[] args)
    {
        int[] edades = new int[5];
        edades[0] =33;
        edades[1] =20;
        edades[2] =19;
        edades[3] =42;
        edades[4] =25;
        ////////////////////////////
        int[] edades2 = new int[5];
        edades2[0] =30;
        edades2[1] =20;
        edades2[2] =19;
        edades2[3] =15;
        edades2[4] =25;
        /////////////////////////////////
        Edades obj1= new Edades("Unifranz","EDD",edades);
        /////////////////////////////////
        /////////////////////////////////
        Edades obj2 = new Edades("Unifranz","BDAIII",edades2);
        /////////////////////////////////

        obj1.Mostrar();
        determinaMayorEdad(obj1);
        determinaMenorEdad(obj1);
        //EJERCICIO 2
        //determinaMayorEdadPar(obj1);
       // obj1.Mostrar();


        System.out.println("\nEJERCICIO PARA LA CASA\n");
        System.out.println("\nVALORES ANTIGUOS\n");
        obj1.Mostrar2();
        obj2.Mostrar2();
        System.out.println("\nVALORES CAMBIADOS\n");
        intercambiarValores(obj1,obj2);
        obj1.Mostrar2();
        obj2.Mostrar2();
    }
    //DETERMINA EDAD MAYOR
    public static int determinaMayorEdad(Edades obj1)
    {
        int[] edades = obj1.getEdades();
        int mayorDeEdad = edades[0];
        for(int i=1; i<edades.length ; i++)
        {
            if(edades[i]>mayorDeEdad)
            {
                mayorDeEdad = edades[i];
            }
        }
        System.out.println("EDAD MAYOR: "+ mayorDeEdad);
        return mayorDeEdad;
    }
    ///////////////////////////////DETERMINAR MENOR DE EDAD//////////////////////////////

    public static int determinaMenorEdad(Edades obj1)
    {
        int[] edades = obj1.getEdades();
        int menorDeEdad = edades[0];
        for(int i=1; i<edades.length ; i++)
        {
            if(edades[i]<menorDeEdad)
            {
                menorDeEdad = edades[i];
            }
        }
        System.out.println("EDAD MENOR: "+ menorDeEdad);
        return menorDeEdad;
    }
    /////////////////////////////////////////////////////////////
    //AUMENTAR 5 A LOS NUMEROS PARES
    public static void determinaMayorEdadPar (Edades obj1)
    {
        int[] edades = obj1.getEdades();

        for(int i=0; i<edades.length ; i++)
        {
            if(edades[i]%2==0)
            {
                edades[i]=edades[i]+5;
            }
        }
        obj1.setEdades(edades);
    }
    // PARA CASA con 2 vectores el valor maximo cambiar al valor en pocision 0 del 2do vector
    // y el valor del vector en pocision 0 cambiarlo en la pocision del mayor
    public static void intercambiarValores (Edades obj1,Edades obj2)
    {
        int mayorEDD = determinaMayorEdad(obj1);
        int mayorBDAIII = determinaMayorEdad(obj2);
        //////////////////MENOR DE EDAD/////////////////////
        int menorEDD = determinaMenorEdad(obj1);
        int menorBDAIII = determinaMenorEdad(obj2);
        int[] edades = obj1.getEdades();
        int[] edades2 = obj2.getEdades();

        //int aux = edades2[0];
        //edades2[0] = edades[3];
        //edades[3] = aux;
        //int aux2 = edades2[3];
        //edades2[3] = edades[2];
        //edades[2] = aux2;

        ///MAYOR
        for(int i=0; i<edades.length ; i++)
        {
            if(edades[i]==mayorEDD)
            {
                edades[i]=mayorBDAIII;
            }
        }

        for(int i=0; i<edades2.length ; i++)
        {
            if(edades2[i]==mayorBDAIII)
            {
                edades2[i]=mayorEDD;
            }
        }
        ///MENOR
        for(int i=0; i<edades.length ; i++)
        {
            if(edades[i]==menorEDD)
            {
                edades[i]=menorBDAIII;
            }
        }

        for(int i=0; i<edades2.length ; i++)
        {
            if(edades2[i]==menorBDAIII)
            {
                edades2[i]=menorEDD;
            }
        }
        obj1.setEdades(edades);
        obj2.setEdades(edades2);

    }
}