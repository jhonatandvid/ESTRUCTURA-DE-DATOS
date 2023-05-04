package Pila_de_clientes;

public class main {
    public static void main(String[] argv){
        Cliente cliente1 = new Cliente("Juan Carlos","Mamani Colque",19,"Av. 6 de Marzo #4720, Villa Dolores, El Alto, Bolivia","Masculino");
        Cliente cliente2 = new Cliente("Maria","Mancora Lopez",25,"Calle Hermanos Manchego #100, Zona Sur, La Paz, Bolivia","Femenino");
        Cliente cliente3 = new Cliente("Edson ivan","Condori Condori",21,"Calle Juan de la Riva #1108, Zona Central, La Paz, Bolivia","Masculino");
        Cliente cliente4 = new Cliente("Elena","Lopez Mendoza",19,"Calle México #150, Villa Exaltación, El Alto, Bolivia","Femenino");
        Cliente cliente5 = new Cliente("Sergio Andres","Mendoza Alvarado",20,"Av. Julio Cesar Valdez #1250, Zona Villa Copacabana, La Paz, Bolivia","Masculino");
        //instanciar la clase Pila de clientes
        PilaDeClientes pilaDeClientes1 = new PilaDeClientes();
        pilaDeClientes1.Adicionar(cliente1);
        pilaDeClientes1.Adicionar(cliente2);
        pilaDeClientes1.Adicionar(cliente3);
        pilaDeClientes1.Adicionar(cliente4);
        pilaDeClientes1.Adicionar(cliente5);
        pilaDeClientes1.Mostrar();
        //12
        mayoresCiertaEdad(pilaDeClientes1,20);
        //13\
        kEsimoPosicion(pilaDeClientes1,3);
        pilaDeClientes1.Mostrar();
        //14
        asignaDireccion(pilaDeClientes1,"Av. 16 de Julio No 1496, El Alto, La Paz, Bolivia");
        pilaDeClientes1.Mostrar();
        //15
        ReordenarPila(pilaDeClientes1);
        pilaDeClientes1.Mostrar();
    }
    public static void mayoresCiertaEdad(PilaDeClientes pila,int EdadMayor){
        PilaDeClientes aux = new PilaDeClientes();
        Cliente item = null;
        int cont = 0;
        while (!pila.EsVacio()){
            item = pila.eliminar();
            if(item.getEdad()>EdadMayor){
                cont = cont +1 ;
            }
            aux.Adicionar(item);
        }
        pila.Vaciar(aux);
        System.out.println("El numero de clientes mayores a "+ EdadMayor +" años es: " + cont);
    }
    public static void kEsimoPosicion(PilaDeClientes pila,int kesimo){
        PilaDeClientes aux = new PilaDeClientes();
        Cliente item = null;
        Cliente min = null;

        while (!pila.EsVacio()){
            item = pila.eliminar();
            if(pila.NroElementos()+1==kesimo){
                min = item;
            }else{
                aux.Adicionar(item);
            }
        }
        pila.Vaciar(aux);
        pila.Adicionar(min);
        System.out.println("\nMOSTRANDO NUEVA PILA DE CLIENTES\n");
    }
    public static void asignaDireccion(PilaDeClientes pila,String nuevaDireccion){
        PilaDeClientes aux = new PilaDeClientes();
        Cliente item = null;
        while (!pila.EsVacio()){
            item = pila.eliminar();
            if(item.getGenero().equals("Femenino")){
                item.setDireccion(nuevaDireccion);
            }
                aux.Adicionar(item);

        }
        pila.Vaciar(aux);
        System.out.println("\nMOSTRANDO NUEVA PILA DE CLIENTE CON DIRECCION CAMBIADA\n");
    }
    public static void ReordenarPila(PilaDeClientes pila){
        PilaDeClientes aux = new PilaDeClientes();
        PilaDeClientes aux2 = new PilaDeClientes();
        Cliente item = null;
        while (!pila.EsVacio()){
            item = pila.eliminar();
            if(item.getGenero().equals("Masculino")){
                aux.Adicionar(item);
            }else {
                aux2.Adicionar(item);
            }
        }
        pila.Vaciar(aux);
        pila.Vaciar(aux2);
        System.out.println("\nMOSTRANDO NUEVA PILA DE CLIENTES\n");
    }
}
