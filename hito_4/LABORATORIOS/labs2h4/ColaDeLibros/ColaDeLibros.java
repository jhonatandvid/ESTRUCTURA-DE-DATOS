package Colas.ColaDeLibros;


public class ColaDeLibros {

    private int max;
    private int ini;
    private int fin; //SIRVE PARA SABER CUANTOS ELEMENTOS HAY
    private libro[] libros;

    public ColaDeLibros(){
        this.max = 100;
        this.ini = 0;
        this.fin = 0;
        this.libros = new libro[this.max +1];

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

    public libro Adicionar(libro nuevoLibro) {
        if (EsLleno() == true) {
            System.out.println("COLA LLENA");
        }else{
            this.fin = this.fin + 1;
            libros[fin] = nuevoLibro;
        }
        return nuevoLibro;
    }
    public libro eliminar(){
        libro itemEliminado = null;
        if(EsVacio() == true){
            System.out.println("COLA VACIA");
        }
        else {
            ini = ini +1;
            itemEliminado = libros[ini];
            if(this.ini == this.fin){
                ini=0;
                fin=0;
            }
        }
        return itemEliminado;
    }

    public void Vaciar(ColaDeLibros pila){
        while(pila.EsVacio() ==  false){
            Adicionar(pila.eliminar());
        }
    }
    public void Mostrar(){
        libro item = null;
        if(EsVacio() == true ){
            System.out.println("No hay items que mostrar");
        }else{
            System.out.println("Mostrando la COLA DE OBJETOS");
            ColaDeLibros aux = new ColaDeLibros();
            while(EsVacio()==false){
                item = eliminar();
                item.MostrarLibro();
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
