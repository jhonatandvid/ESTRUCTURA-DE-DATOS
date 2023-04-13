package Pilas_de_numeros;

public class PilaDeNumeros {

    private int max;
    private int top;
    private int[] numeros;

    public PilaDeNumeros(){
        this.max = 10;
        this.top = 0;
        this.numeros = new int[this.max +1];

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

    public int Adicionar(int nuevoNumero) {
        if (EsLleno() == true) {
            System.out.println("PILA LLENA");
        }else{
            this.top = this.top + 1;
            numeros[top] = nuevoNumero;
        }
        return nuevoNumero;
    }
    public int eliminar(){
        int itemEliminado = 0;
        if(EsVacio() == true){
            System.out.println("PILA VACIA");
        }
        else {
            itemEliminado = numeros[top];
            top = top -1;
        }
        return itemEliminado;
    }

    public void Vaciar(PilaDeNumeros pila){
        while(pila.EsVacio() ==  false){
            Adicionar(pila.eliminar());
        }
    }
    public void Mostrar(){
        int item = 0;
        if(EsVacio() == true ){
            System.out.println("No hay items que mostrar");
        }else{
            System.out.println("Mostrando la PILA DE NUMEROS");
            PilaDeNumeros aux = new PilaDeNumeros();
            while(EsVacio()==false){
                item = eliminar();
                System.out.println("NUMERO: "+item);

                aux.Adicionar(item);
            }

            Vaciar(aux);
        }
    }

}
