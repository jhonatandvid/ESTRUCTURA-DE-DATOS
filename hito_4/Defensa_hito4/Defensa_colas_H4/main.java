package Colas.Defensa_colas_H4;



public class main {

    public static void main(String[] argv){
        Cliente cli1 = new Cliente("Saul","Escobar",22,"Bolivia","Masculino","Platinum",6775623);
        Cliente cli2 = new Cliente("Mercedes","Mamani",73,"Colombia","Femenino","Gold",4571286);
        Cliente cli3 = new Cliente("Hernan","Perez",61,"Bolivia","Masculino","Gold",3514268);
        Cliente cli4 = new Cliente("Anna","Mendoza",20,"Argentina","Femenino","Silver",9587324);
        Cliente cli5 = new Cliente("Joshep","Alvarado",23,"Bolivia","Masculino","Gold",6853491);

        //instanciando la Clase ColaDeClientes//
        ColaDeCliente colaA = new ColaDeCliente();
        colaA.Adicionar(cli1);
        colaA.Adicionar(cli2);
        colaA.Adicionar(cli3);
        colaA.Adicionar(cli4);
        colaA.Adicionar(cli5);
        colaA.Mostrar();

        //////////////////EVALUACION//////////////////
        // 1) Dar promocion vip
        // condiciones: tiene que ser Gold, su apellido tiene que empezar en M y terminar en ni
        //ClienteVIP(colaA,"Gold");
        //System.out.println("cambiando vip");
        //colaA.Mostrar();

        // 2) Mover al inicio todos los clientes mayores a 60
        //MoverCola(colaA,60);
       // System.out.println("clientes mayores");
        //colaA.Mostrar();

        // 3) Cambiar de vuelo ciertos clientes
        // agregar cliente_id a la clase tipo int
        // a) Seleccionar 2 ID Y ELIMINARLOS
        //ClienteAtrasado(colaA,6775623);//saul
        //ClienteAtrasado(colaA,3514268);//hernan
        // b) llamar solo 1 vez al metodo
        int[] ids = new int[2];
        ids[0] = 6853491;
        ids[1] = 6775623;
        ClienteAtrasadov2(colaA,ids);
    }
    public static void ClienteVIP(ColaDeCliente cola, String tipo){
        ColaDeCliente aux = new ColaDeCliente();

        while(!cola.EsVacio()){
            Cliente item = cola.eliminar();
            String str = item.getApellido();
            String subStr = str.substring( 0,1);
            String subStr2 = str.substring(str.length() -2);

            if(item.getTipo().equals(tipo)  && subStr.equals("M") && subStr2.equals("ni") ){
                item.setTipo("VIP");
            }
            aux.Adicionar(item);
        }
        cola.Vaciar(aux);
    }

    public static void MoverCola(ColaDeCliente cola, int edad){
        ColaDeCliente aux = new ColaDeCliente();
        ColaDeCliente aux2 = new ColaDeCliente();
        int nroElem = cola.NroElementos();
        for(int i=1;i<=nroElem;i++)
        {
            Cliente item = cola.eliminar();
            if(item.getEdad() > edad){
                aux.Adicionar(item);
            }else {
                aux2.Adicionar(item);
            }
        }
        cola.Vaciar(aux);
        cola.Vaciar(aux2);
    }

    public static void ClienteAtrasado(ColaDeCliente cola, int id){
        ColaDeCliente aux = new ColaDeCliente();

        while(!cola.EsVacio()){
            Cliente item = cola.eliminar();

            if(item.getCliente_id() == id  ){
                item = cola.eliminar();
            }
            aux.Adicionar(item);
        }
        cola.Vaciar(aux);
        cola.Mostrar();
    }
    public static void ClienteAtrasadov2(ColaDeCliente cola, int[] id){
        ColaDeCliente aux = new ColaDeCliente();
        ColaDeCliente aux2 = new ColaDeCliente();
        while(!cola.EsVacio()){
             Cliente item = cola.eliminar();
            if(item.getCliente_id() == id[0] ||  item.getCliente_id() == id[1] ){
                aux.Adicionar(item);
            }else {
                aux2.Adicionar(item);
            }
        }
        cola.Vaciar(aux);
        cola.Vaciar(aux2);
        cola.Mostrar();
    }
}
