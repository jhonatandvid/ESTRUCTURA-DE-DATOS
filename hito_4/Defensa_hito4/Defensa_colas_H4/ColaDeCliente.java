package Colas.Defensa_colas_H4;

public class ColaDeCliente {

    private int max;
    private int ini;
    private int fin;
    private Cliente[] Cliente;


    public ColaDeCliente(){
        this.max = 100;
        this.ini = 0;
        this.fin = 0;
        this.Cliente = new Cliente[this.max +1];

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

    public Cliente Adicionar(Cliente nuevoCliente) {
        if (EsLleno() == true) {
            System.out.println("COLA LLENA");
        }else{
            this.fin = this.fin + 1;
            Cliente[fin] = nuevoCliente;
        }
        return nuevoCliente;
    }
    public Cliente eliminar(){
        Cliente itemEliminado = null;
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

    public void Vaciar(ColaDeCliente cola){
        while(cola.EsVacio() ==  false){
            Adicionar(cola.eliminar());
        }
    }
    public void Mostrar(){
        Cliente item = null;
        if(EsVacio() == true ){
            System.out.println("No hay items que mostrar");
        }else{
            System.out.println("Mostrando la COLA DE CLIENTES");
            ColaDeCliente aux = new ColaDeCliente();
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


}
