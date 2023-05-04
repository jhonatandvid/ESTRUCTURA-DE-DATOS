package Libros;

import Pilas_de_cadenas.PilaDeCadenas;

public class main {
    public static void main(String[] argv){
        Libro libro1 = new Libro("Homero",500,30.00,"La odisea" ,"Epopeya");
        Libro libro2 = new Libro("Homero",500,20.00,"La iliada" ,"Epopeya");
        PilaDeLibros pilaDeLibros1 = new PilaDeLibros();
        pilaDeLibros1.Adicionar(libro1);
        pilaDeLibros1.Adicionar(libro2);
        pilaDeLibros1.Mostrar();
        //determinar cuantos libros tienen un costo mayor a 25
        CalcularPrecio(pilaDeLibros1);
        //agregar un descuento del 10% a los libros de epopeya
        Descuento(pilaDeLibros1,"Epopeya");
        //creando la segunda pila//
        PilaDeLibros pilaDeLibros2 = new PilaDeLibros();
        Libro libro12 = new Libro("Victor",500,100.00,"Pinochio" ,"Fantasia");
        Libro libro22 = new Libro("Edgar",500,510.00,"La ola" ,"Historia");
        pilaDeLibros2.Adicionar(libro12);
        pilaDeLibros2.Adicionar(libro22);
        ////intercambiar los libros de mayor precio
        //mayor(pilaDeLibros1);
        Intercambio(pilaDeLibros1,pilaDeLibros2);
        System.out.println("cambiando");
        pilaDeLibros1.Mostrar();
        pilaDeLibros2.Mostrar();

    }
    public static void CalcularPrecio(PilaDeLibros pila){
        PilaDeLibros aux = new PilaDeLibros();
        Libro itemEliminado = null;

        int cont = 0;
        while (!pila.EsVacio()){
            itemEliminado = pila.eliminar();
            if(itemEliminado.getPrecio()>25){
                cont = cont +1 ;
            }
            aux.Adicionar(itemEliminado);
        }
        pila.Vaciar(aux);
        System.out.println("Libros con precio mayor a 25bs: " + cont);
    }
    public static void Descuento(PilaDeLibros pila, String categoria){
        PilaDeLibros aux = new PilaDeLibros();
        Libro itemEliminado = null;
        double descuento = 0;
        double desc = 0;
        while (!pila.EsVacio()){
            itemEliminado = pila.eliminar();
            if(itemEliminado.getCategoria().equals(categoria)){
                desc = (itemEliminado.getPrecio() * 0.1);
                descuento =(itemEliminado.getPrecio() - desc);
            }
            System.out.println("EL DESCUENTO AL LIBRO ES " + descuento+ "bs");
            aux.Adicionar(itemEliminado);
        }
        pila.Vaciar(aux);
    }
    public static double mayor (PilaDeLibros pilaA ){
        PilaDeLibros aux = new PilaDeLibros();
        Libro item = null;
        double MAYOR = 0;
        while (!pilaA.EsVacio()){
            item = pilaA.eliminar();

            if(MAYOR < item.getPrecio())
            {
                MAYOR = item.getPrecio();
            }

            aux.Adicionar(item);
        }
        System.out.println("el mayor es: " +item.getPrecio() );
        pilaA.Vaciar(aux);
        return  MAYOR;
    }
    public static void Intercambio(PilaDeLibros pilaA, PilaDeLibros pilaB ){
        PilaDeLibros aux = new PilaDeLibros();
        Libro item = null;
        Libro item2 = null;
        double pila1 = mayor(pilaA);
        double pila2 = mayor(pilaB);
        Libro l1 = null;
        Libro l2 = null;

        while (!pilaA.EsVacio()){
            item = pilaA.eliminar();

            if(item.getPrecio()==pila1){
                l1 = item;
            }else{
                aux.Adicionar(item);
            }

            aux.Adicionar(item);
        }
        while (!pilaB.EsVacio()){
            item2 = pilaB.eliminar();

            if(item2.getPrecio()==pila2){
                l2 = item2;
            }else{
                aux.Adicionar(item2);
            }
            aux.Adicionar(item2);
        }
        System.out.println("el mayor es: " +item.getPrecio() );
        pilaA.Vaciar(aux);
        pilaA.Adicionar(l2);
        pilaB.Vaciar(aux);
        pilaB.Adicionar(l1);
    }
}
