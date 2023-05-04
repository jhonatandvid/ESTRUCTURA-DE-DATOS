package Libros;

import Pilas_de_cadenas.PilaDeCadenas;

import java.util.Scanner;

public class PilaDeLibros {

    private int max;
    private int top;
    private Libro[] p;

    public PilaDeLibros(){
        this.max = 10;
        this.top = 0;
        this.p = new Libro[this.max +1];

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

    public Void Adicionar(Libro nuevoLibro) {
        if (EsLleno() == true) {
            System.out.println("PILA LLENA");
        }else{
            this.top = this.top + 1;
            p[top] = nuevoLibro;
        }
        return null;
    }
    public Libro eliminar(){
        Libro itemEliminado = null;
        if(EsVacio() == true){
            System.out.println("PILA VACIA");
        }
        else {
            itemEliminado = p[top];
            top = top -1;
        }
        return itemEliminado;
    }

    public void Vaciar(PilaDeLibros pila){
        while(pila.EsVacio() ==  false){
            Adicionar(pila.eliminar());
        }
    }
    public void Mostrar(){
        Libro item = null;
        if(EsVacio() == true ){
            System.out.println("No hay items que mostrar");
        }else{
            System.out.println("Mostrando la PILA DE LIBROS");

            PilaDeLibros aux = new PilaDeLibros();
            while(EsVacio()==false){
                item = eliminar();
                item.MostrarLibro();
                aux.Adicionar(item);
            }
            Vaciar(aux);
        }
    }
//    public void Llenar(int nroItems){
//        Scanner leer = new Scanner(System.in); // lee por teclado
//        String nombre = "";
//
//        System.out.println("Llenando la pila de nombres(cadenas)");
//        for(int i=0;i<nroItems;i++){
//            System.out.println("ingrese el nombre "+(i+1)+" : ");
//            nombre = leer.nextLine();
//            Adicionar(nombre);
//            System.out.println();
//        }
//    }
}
