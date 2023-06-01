package Colas.ColaDeLibros;

import Pila_de_clientes.Cliente;
import Pila_de_clientes.PilaDeClientes;

public class main {
    public static void main(String[] args){
        ColaDeLibros colaDeLibros = new ColaDeLibros();

        libro libro1 = new libro(1,"Juan","Masculino","MANGA",80);
        libro libro2 = new libro(2,"Saul","Otros","MANGA",100);
        libro libro3 = new libro(3,"Ana","Femenino","HISTORIA",40);
        libro libro4 = new libro(4,"Micaela","Femenino","HISTORIA",30);
        libro libro5 = new libro(5,"Pepito","Masculino","NOVELA",20);
        libro libro6 = new libro(6,"Pep","Masculino","NOVELA",20);
        libro libro7 = new libro(7,"Carlos","Masculino","ARTE",200);

        colaDeLibros.Adicionar(libro1);
        colaDeLibros.Adicionar(libro2);
        colaDeLibros.Adicionar(libro3);
        colaDeLibros.Adicionar(libro4);
        colaDeLibros.Adicionar(libro5);
        colaDeLibros.Adicionar(libro6);
        colaDeLibros.Adicionar(libro7);
        colaDeLibros.Mostrar();
        System.out.println("Mostrando el libro con menor numero de paginas");
        libroMenor(colaDeLibros).MostrarLibro();
        libroMayor(colaDeLibros).MostrarLibro();
        ReordenarCola(colaDeLibros);
        colaDeLibros.Mostrar();
        //System.out.println(factorial(5));
        ReordenarPorPaginas(colaDeLibros);
        colaDeLibros.Mostrar();

    }

    //Crear un metodo estatico y mostrar el libro con menor numero de paginas
    public static libro libroMenor(ColaDeLibros cola){
        ColaDeLibros aux = new ColaDeLibros();
        libro LibroMenor = null;
        int menorPag = Integer.MAX_VALUE;

        while (!cola.EsVacio()){
            libro item = cola.eliminar();
            if(item.getPaginas()<menorPag){
                menorPag = item.getPaginas();
                LibroMenor = item;
            }
            aux.Adicionar(item);
        }
        cola.Vaciar(aux);
        return LibroMenor;
    }

    public static libro libroMayor(ColaDeLibros cola){
        ColaDeLibros aux = new ColaDeLibros();
        libro LibroMayor = null;
        int mayorPag = Integer.MIN_VALUE;

        while (!cola.EsVacio()){
            libro item = cola.eliminar();
            if(item.getPaginas() > mayorPag){
                mayorPag = item.getPaginas();
                LibroMayor = item;
            }
            aux.Adicionar(item);
        }
        cola.Vaciar(aux);
        return LibroMayor;
    }
    public static void ReordenarCola(ColaDeLibros Cola){
        ColaDeLibros aux = new ColaDeLibros();
        ColaDeLibros aux2 = new ColaDeLibros();
        ColaDeLibros aux3 = new ColaDeLibros();
        libro item = null;
        while (!Cola.EsVacio()){
            item = Cola.eliminar();
            if(item.getGenero().equals("Femenino")){
                aux.Adicionar(item);
            }else if(item.getGenero().equals("Masculino")) {
                aux2.Adicionar(item);
            }else{
                aux3.Adicionar(item);
            }
        }
        Cola.Vaciar(aux);
        Cola.Vaciar(aux2);
        Cola.Vaciar(aux3);
        System.out.println("\nMOSTRANDO NUEVA COLA DE LIBROS OREDENADA POR GENERO\n");
    }
//    public static int factorial(int n){
//        if(n == 0 ){
//            return 0;
//        }else if(n==1){
//            return 1;
//        }else{
//            int result = n * factorial(n-1);
//            return result;
//        }
//    }

    public static void ReordenarPorPaginas(ColaDeLibros Cola){
        ColaDeLibros aux = new ColaDeLibros();
        ColaDeLibros aux2 = new ColaDeLibros();
        int nroElem = Cola.NroElementos();
        for(int i =  1;i<=nroElem;i++){
            libro libro = libroMenor(Cola);
            while (!Cola.EsVacio()){
                libro item = Cola.eliminar();
                if(item.getCodigoDeLibro() == libro.getCodigoDeLibro()){
                    aux2.Adicionar(item);
                }else{
                    aux.Adicionar(item);
                }
            }
            Cola.Vaciar(aux);
        }
        Cola.Vaciar(aux2);
        System.out.println("\nMOSTRANDO NUEVA COLA DE LIBROS OREDENADA POR PAGINAS\n");
    }
}
