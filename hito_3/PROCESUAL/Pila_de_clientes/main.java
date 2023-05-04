package Pila_de_clientes;

public class main {
    public static void main(String[] argv){
        Cliente cliente1 = new Cliente("Juan Carlos","Mamani Colque",19,"Av. 6 de Marzo #4720, Villa Dolores, El Alto, Bolivia","Masculino");
        Cliente cliente2 = new Cliente("Maria","Mancora Lopez",25,"Calle Hermanos Manchego #100, Zona Sur, La Paz, Bolivia","Femenino");
        Cliente cliente3 = new Cliente("Edson ivan","Condori Condori",21,"Calle Juan de la Riva #1108, Zona Central, La Paz, Bolivia","Masculino");
        Cliente cliente4 = new Cliente("Elena","Lopez Mendoza",19,"Calle México #150, Villa Exaltación, El Alto, Bolivia","Femenino");
        Cliente cliente5 = new Cliente("Sergio Andres","Mendoza Alvarado",20,"Av. Julio Cesar Valdez #1250, Zona Villa Copacabana, La Paz, Bolivia","Masculino");
        //instanciando clase//
        PilaDeClientes PilaDeClientes1 = new PilaDeClientes();
        //Agregando clientes a la pila
        PilaDeClientes1.Adicionar(cliente1);
        PilaDeClientes1.Adicionar(cliente2);
        PilaDeClientes1.Adicionar(cliente3);
        PilaDeClientes1.Adicionar(cliente4);
        PilaDeClientes1.Adicionar(cliente5);
        PilaDeClientes1.Mostrar();
        //12.Determinar cuántos CLIENTES son mayores de 20 años.
        MayoresCiertaEdad(PilaDeClientes1,20);
        //13.Mover el k-ésimo elemento al final de la pila.
        kEsimoPosicion(PilaDeClientes1,3);
        PilaDeClientes1.Mostrar();
        //14.Cambiar la dirección de algunos CLIENTES de la PILA.
        //Siempre y cuando sea femenino
        asignaDireccion(PilaDeClientes1, "Av. 16 de Julio No. 1496, El Alto, La Paz, Bolivia");
        PilaDeClientes1.Mostrar();
        //15.Mover ÍTEMS de la PILA.
        ReordenaPila(PilaDeClientes1);
        PilaDeClientes1.Mostrar();
    }
    public static void MayoresCiertaEdad(PilaDeClientes pila,int EdadMayor){
        PilaDeClientes aux = new PilaDeClientes();
        Cliente item = null;
        int cont = 0;
        while (!pila.EsVacio()){
            item = pila.eliminar();
            if (item != null) {
                if(item.getEdad()>EdadMayor){
                    cont = cont +1 ;
                }
                aux.Adicionar(item);
            }
        }
        pila.Vaciar(aux);
        System.out.println("El numero de clientes mayores a"+ EdadMayor +" años es: " + cont);
    }
    public static void kEsimoPosicion(PilaDeClientes pila,int kesimo){
        PilaDeClientes aux = new PilaDeClientes();
        Cliente item = null;
        Cliente min = null;
        while (!pila.EsVacio()){
            item = pila.eliminar();
            if (item != null) {
                if(pila.NroElementos()+1==kesimo){
                    min = item;
                }else{
                    aux.Adicionar(item);
                }
            }
        }
        pila.Vaciar(aux);
        pila.Adicionar(min);
        System.out.println("\nMOSTRANDO NUEVA PILA DE DATOS\n ");
    }
    public static void  asignaDireccion(PilaDeClientes pila,String nuevaDireccion){
        PilaDeClientes aux = new PilaDeClientes();
        Cliente item = null;
        while (!pila.EsVacio()){
            item = pila.eliminar();
            if (item != null) {
                if(item.getGenero().equals("Femenino")){
                    item.setDireccion(nuevaDireccion);
                }
                aux.Adicionar(item);
            }
        }
        pila.Vaciar(aux);
        System.out.println("MOSTRANDO LA NUEVA PILA DE CLIENTES CON DIRECCION CAMBIADA");
    }

public static void ReordenaPila(PilaDeClientes pila){
    PilaDeClientes auxm = new PilaDeClientes();
    PilaDeClientes auxf = new PilaDeClientes();
    Cliente item = null;
    while (!pila.EsVacio()){
        item = pila.eliminar();
        if (item != null) {
            if(item.getGenero().equals("Masculino")){
                auxm.Adicionar(item);
            } else {
                auxf.Adicionar(item);
            }
        }
    }
    pila.Vaciar(auxm);
    pila.Vaciar(auxf);
    System.out.println("///MOSTRANDO LA NUEVA PILA DE CLIENTES///");
    }
}
