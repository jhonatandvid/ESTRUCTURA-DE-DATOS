package H2Defensa;

public class H2Main {
    public static void main(String[] args)
    {

        Provincia pro = new Provincia("Murillo");
        Provincia pro1 = new Provincia("Aroma");
        //////////////
        Provincia pr = new Provincia("Gran chaco");
        Provincia pr1 = new Provincia("Cercado");

        //provincias

        Provincia[] provincias = new Provincia[2];
        provincias[0] = pro;
        provincias[1] = pro1;

        ////////////
        Provincia[] provincias2 = new Provincia[2];
        provincias2[0] = pr;
        provincias2[1] = pr1;

        //DEPARTAMENTOS
        Departamento de = new Departamento("LA PAZ",2,provincias);
        Departamento de1 = new Departamento("TARIJA",2,provincias2);


        Departamento[] deps = new Departamento[2];
        deps[0] = de;
        deps[1] = de1;

        Pais pa = new Pais("Bolivia",2,deps);

        pa.MuestraPais();

        Provincia pro3 = new Provincia("Quillacollo");
        Provincia[] provincia3 = new Provincia[1];
        provincia3[0] = pro3;
        Departamento de3 = new Departamento("COCHABAMBA",1,provincia3);


        pa.agregaDepartamento(de3);

        pa.MuestraPais();

        System.out.println("los nuevos registros son: ");
        Provincia pro4 = new Provincia("Ingavi");
        //AGREGARE UNA PROVINCIA A EL DEPARTAMENTO LA PAZ
        de.agregaNuevaProvincia("LA PAZ",pro4);
        pa.MuestraPais();


    }
}
