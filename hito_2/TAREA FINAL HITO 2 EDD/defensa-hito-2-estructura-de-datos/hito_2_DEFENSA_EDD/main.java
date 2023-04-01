package hito_2_DEFENSA_EDD;

public class main {

    public static void main(String[] argv)
    {
//        //INSTANCIA DE PROVINCIA CREADA
//        Provincia pro = new Provincia();
//        pro.Muestraprovincia();
//        //INSTANCIA DE DEPARTAMENTO CREADO
//        Departamento de = new Departamento();
//        de.MostrarDepartamento();
//        //INSTANCIA DE PAIS CREADO
//        Pais pa = new Pais();
//        pa.MostrarPais();
        //DESARROLANDO EL PUNTO 14)
        //POVINCIAS DE LA PAZ
        Provincia prolpz1 = new Provincia("Ingavi");
        Provincia prolpz2 = new Provincia("Murillo");
        Provincia[] ProvinciasLpz = new Provincia[2];
        ProvinciasLpz[0]=prolpz1;
        ProvinciasLpz[1]=prolpz2;
        //POVINCIAS DE ORURO
        Provincia proOr1 = new Provincia("Cercado");
        Provincia proOr2 = new Provincia("Popo");
        Provincia[] ProvinciasOr = new Provincia[2];
        ProvinciasOr[0]=proOr1;
        ProvinciasOr[1]=proOr2;
        //POVINCIAS DE CBBA
        Provincia proCbba1 = new Provincia("Quillacollo");
        Provincia proCbba2 = new Provincia("Arque");
        Provincia[] ProvinciasCbba = new Provincia[2];
        ProvinciasCbba[0]=proCbba1;
        ProvinciasCbba[1]=proCbba2;

        //DEPARTAMENTOS DEL PAIS BOLIVIA
        Departamento Lpz=new Departamento("LA PAZ",2,ProvinciasLpz);
        Departamento Cbba=new Departamento("COCHABAMBA",2,ProvinciasCbba);
        Departamento Or=new Departamento("ORURO",2,ProvinciasOr);

        Departamento[] deps = new Departamento[3];
        deps[0]=Lpz;
        deps[1]=Cbba;
        deps[2]=Or;
        //CREACION DEL PAIS
        Pais pa = new Pais("Bolivia",3,deps);
        pa.MostrarPais();
        System.out.println("  " );
        //AGREGANDO NUEVOS DEPARTAMENTOS
        System.out.println("Datos actualizados");
        Provincia proTrj = new Provincia("Gran chaco");

        Provincia[] ProvinciasTrj = new Provincia[1];
        ProvinciasTrj[0]=proTrj;

        Departamento Trj = new Departamento("TARIJA",1,ProvinciasTrj);

        pa.AgregarNuevoDepartamento(Trj);
        pa.MostrarPais();
        //AGREGANDO PROVINCIAS
        System.out.println("Datos actualizados 2) ");
        Provincia proLpz3 = new Provincia("Aroma");
        Lpz.AgregarProvincia(proLpz3);
        pa.MostrarPais();




    }
}
