package Colas.ColaClientes;

public class ColaDeClientes {

    private int max;
    private int ini;
    private int fin;
    private Clientes[] Cliente;

    public ColaDeClientes(){
        this.max = 100;
        this.ini = 0;
        this.fin = 0;
        this.Cliente = new Clientes[this.max +1];

    }
    public boolean EsVacio(){
        if(this.ini == 0 && fin ==0){
            return true;
        }else{
            return false;
        }
    }

    public boolean EsLleno(){
        if(this.fin == this.max ){
            return true;
        }else{
            return false;
        }
    }

    public int NroElementos(){

        return fin-ini;
    }

    public Clientes Adicionar(Clientes nuevoCliente) {
        if (EsLleno() == true) {
            System.out.println("COLA LLENA");
        }else{
            this.fin = this.fin + 1;
            Cliente[fin] = nuevoCliente;
        }
        return nuevoCliente;
    }
    public Clientes eliminar(){
        Clientes itemEliminado = null;
        if(EsVacio() == true){
            System.out.println("COLA VACIA");
        }
        else {
            ini = ini +1;
            itemEliminado = Cliente[ini];
            if(this.ini == this.fin){
                ini=0;
                fin=0;
            }
        }
        return itemEliminado;
    }

    public void Vaciar(ColaDeClientes cola){
        while(cola.EsVacio() ==  false){
            Adicionar(cola.eliminar());
        }
    }
    public void Mostrar(){
        Clientes item = null;
        if(EsVacio() == true ){
            System.out.println("No hay items que mostrar");
        }else{
            System.out.println("Mostrando la COLA DE CLIENTES");
            ColaDeClientes aux = new ColaDeClientes();
            while(EsVacio()==false){
                item = eliminar();
                System.out.println(" ");
                item.MuestraCliente();
                aux.Adicionar(item);
            }
            Vaciar(aux);
        }
    }

    public int getIni() {
        return ini;
    }

    public int getFin() {
        return fin;
    }
}
