package Colas.ColaClientes;

public class main {
    public static void main(String[] args){
        Clientes cli1 = new Clientes("Saul","Escobar",22,"Bolivia","Masculino","Gold");
        Clientes cli2 = new Clientes("Maria","Mancora Lopez",73,"Colombia","Femenino","Platinum");
        Clientes cli3 = new Clientes("Hernesto","Perez",61,"Bolivia","Masculino","Gold");
        Clientes cli4 = new Clientes("Anna","Mendoza",20,"Argentina","Femenino","Silver");
        Clientes cli5 = new Clientes("Jose","Alvarado",23,"Bolivia","Masculino","Gold");
        //instanciando la Clase ColaDeClientes//
        ColaDeClientes cola1 = new ColaDeClientes();
        cola1.Adicionar(cli1);
        cola1.Adicionar(cli2);
        cola1.Adicionar(cli3);
        cola1.Adicionar(cli4);
        cola1.Adicionar(cli5);
        System.out.println("MOSTRANDO COLA A");
        cola1.Mostrar();

        //METODOS ESTATICOS//

        //13)
        System.out.println("Ejercicio 13: ");
        System.out.println(" ");
        ClienteVIP(cola1,"Gold","Bolivia"); // RESULTADO: HERNESTO Y JOSE
        cola1.Mostrar();
        //14)
        System.out.println("Ejercicio 14: ");
        System.out.println(" ");
        //MoverCola(cola1,60);
        //cola1.Mostrar();
        //15)
        System.out.println("Ejercicio 15: ");
        System.out.println(" ");
        //creando segunda cola
        Clientes cli1b = new Clientes("Juan","Alarcon",21,"Bolivia","Masculino","Silver");
        Clientes cli2b = new Clientes("Hernan","Mancora",43,"Colombia","Masculino","Platinum");
        Clientes cli3b = new Clientes("Carla","Olivares",32,"Bolivia","Femenino","Gold");
        Clientes cli4b = new Clientes("Edson","Condori",76,"Argentina","Masculino","Silver");
        Clientes cli5b = new Clientes("Sergio","Alvarado",34,"Bolivia","Masculino","Gold");
        ColaDeClientes cola2 = new ColaDeClientes();
        cola2.Adicionar(cli1b);
        cola2.Adicionar(cli2b);
        cola2.Adicionar(cli3b);
        cola2.Adicionar(cli4b);
        cola2.Adicionar(cli5b);
        System.out.println("MOSTRANDO COLA B");
        cola2.Mostrar();
        //creando metodo//
        System.out.println("MOSTRANDO COLA B con el nuevo cliente");
        //MoverCliente(cola1,cola2,"Saul");

    }
    public static void ClienteVIP(ColaDeClientes cola,String tipo,String nacionalidad){
        ColaDeClientes aux = new ColaDeClientes();

        while(!cola.EsVacio()){
            Clientes item = cola.eliminar();
            if(item.getTipo().equals(tipo) && item.getPais().equals(nacionalidad)){
                item.setTipo("VIP");
            }
            aux.Adicionar(item);
        }
        cola.Vaciar(aux);
    }

    // METODO MOVER COLA
    public static void MoverCola(ColaDeClientes cola,int edad){
        ColaDeClientes aux = new ColaDeClientes();
        ColaDeClientes aux2 = new ColaDeClientes();
        while(!cola.EsVacio()){
            Clientes item = cola.eliminar();
            if(item.getEdad() > edad){
                aux.Adicionar(item);
            }else {
                aux2.Adicionar(item);
            }
        }
        cola.Vaciar(aux);
        cola.Vaciar(aux2);
    }
    //METODO MOVER CLIENTE
    public static void MoverCliente(ColaDeClientes colaA,ColaDeClientes colaB,String nombre){
        ColaDeClientes aux = new ColaDeClientes();
        ColaDeClientes auxB = new ColaDeClientes();
        while(!colaA.EsVacio()){
            Clientes item = colaA.eliminar();
            Clientes item2 = colaB.eliminar();
            if(item.getNombre().equals(nombre)){
                colaB.Adicionar(item);
                item = colaA.eliminar();

            } aux.Adicionar(item);
             auxB.Adicionar(item2);
        }
        colaA.Vaciar(aux);
        colaB.Vaciar(auxB);
        colaA.Mostrar();
        colaB.Mostrar();
    }
}
