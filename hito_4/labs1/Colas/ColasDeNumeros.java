package Colas;


public class ColasDeNumeros {

    private int max;
    private int ini;
    private int fin; //SIRVE PARA SABER CUANTOS ELEMENTOS HAY
    private int[] numeros;

    public ColasDeNumeros(){
        this.max = 10;
        this.ini = 0;
        this.fin = 0;
        this.numeros = new int[this.max +1];

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

    public int Adicionar(int nuevoNumero) {
        if (EsLleno() == true) {
            System.out.println("COLA LLENA");
        }else{
            this.fin = this.fin + 1;
            numeros[fin] = nuevoNumero;
        }
        return nuevoNumero;
    }
    public int eliminar(){
        int itemEliminado = 0;
        if(EsVacio() == true){
            System.out.println("COLA VACIA");
        }
        else {
            ini = ini +1;
            itemEliminado = numeros[ini];
            if(this.ini == this.fin){
                ini=0;
                fin=0;
            }
        }
        return itemEliminado;
    }

    public void Vaciar(ColasDeNumeros pila){
        while(pila.EsVacio() ==  false){
            Adicionar(pila.eliminar());
        }
    }
    public void Mostrar(){
        int item = 0;
        if(EsVacio() == true ){
            System.out.println("No hay items que mostrar");
        }else{
            System.out.println("Mostrando la COLA DE NUMEROS");
            ColasDeNumeros aux = new ColasDeNumeros();
            while(EsVacio()==false){
                item = eliminar();
                System.out.println("NUMERO: "+item);
                aux.Adicionar(item);
            }
            Vaciar(aux);
        }
    }
}
