package H2Defensa;

public class H2Main {
    public static void main(String[] args)
    {
        //2) AGREGAR 2 DEPARTAMENTOS CON 2 PROVINCIAS CADA UNO A EL PAIS BOLIVIA
        //PROVINCIAS
        Provincia proLa1 = new Provincia("Murillo");
        Provincia proLa2 = new Provincia("Aroma");
        //////////////
        Provincia proTa1 = new Provincia("Gran chaco");
        Provincia proTa2 = new Provincia("Cercado");

        Provincia[] provinciasLapaz = new Provincia[2];
        provinciasLapaz[0] = proLa1;
        provinciasLapaz[1] = proLa2;

        Provincia[] provinciasTarija = new Provincia[2];
        provinciasTarija[0] = proTa1;
        provinciasTarija[1] = proTa2;

        //DEPARTAMENTOS
        Departamento deLpz = new Departamento("LA PAZ",2,provinciasLapaz);
        Departamento deTrj = new Departamento("TARIJA",2,provinciasTarija);


        Departamento[] deps = new Departamento[2];
        deps[0] = deLpz;
        deps[1] = deTrj;

        Pais pa = new Pais("Bolivia",2,deps);

        System.out.println("2) DATOS DEL PAIS: ");
        pa.MuestraPais();
        System.out.println(" ");

        //3) AGREGAR UN NUEVO DEPARTAMENTO Y UNA NUEVA PROVINCIA
        Provincia proCbba1 = new Provincia("Quillacollo");
        Provincia[] provinciasCbba = new Provincia[1];
        provinciasCbba[0] = proCbba1;
        Departamento deCbba = new Departamento("COCHABAMBA",1,provinciasCbba);
        System.out.println("3) DATOS DEL PAIS ACTUALIZADO DE ACUERDO AL PUNTO 3: ");
        pa.agregaDepartamento(deCbba);
        pa.MuestraPais();
        System.out.println("   ");

        //4) AGREGAR UNA NUEVA PROVINCIA EN UN DEPARTAMENTO YA CREADO
        System.out.println("4) LA NUEVA PROVINCIA ES:");
        Provincia proLa3 = new Provincia("Ingavi");

        //AGREGARE UNA PROVINCIA A EL DEPARTAMENTO LA PAZ por eso se usa el "deLpz"
        deLpz.agregaNuevaProvincia("LA PAZ",proLa3);
        pa.MuestraPais();


    }
}
