package Pila_de_clientes;

public class PilaDeClientes {
    private int max;
    private int top;
    private Cliente[] Cliente;
    public PilaDeClientes(){
        this.max = 10;
        this.top = 0;
        this.Cliente = new Cliente[this.max+1];
    }
    public boolean EsVacio(){
        if(this.top == 0 ){
            return true;
        }else{
            return false;
        }
    }

    public boolean EsLleno(){
        if(this.top == this.max ){
            return true;
        }else{
            return false;
        }
    }
    public int NroElementos(){
        return top;
    }
    public void Adicionar(Cliente nuevoCliente) {
        if (EsLleno()==true) {
            System.out.println("PILA LLENA");
        }else{
            top = top + 1;
            this.Cliente[top] = nuevoCliente;
        }
    }
    public Cliente eliminar(){
        Cliente itemEliminado = null;
        if(EsVacio() == true){
            System.out.println("PILA VACIA");
        }
        else {
            itemEliminado = Cliente[top];
            top = top -1;
        }
        return itemEliminado;
    }

    public void Vaciar(PilaDeClientes pila){
        while(pila.EsVacio() ==  false){
            Adicionar(pila.eliminar());
        }
    }
    public void Mostrar(){
        Cliente item;
        if(EsVacio() == true ){
            System.out.println("No hay items que mostrar");
        }else{
            System.out.println("Mostrando la PILA DE CLIENTES");
            PilaDeClientes aux = new PilaDeClientes();
            while(EsVacio()==false){
                item = eliminar();
                item.MuestraCliente();
                aux.Adicionar(item);

            }
            Vaciar(aux);
        }
    }
}
