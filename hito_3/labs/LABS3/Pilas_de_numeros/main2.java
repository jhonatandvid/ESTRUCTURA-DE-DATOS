package Pilas_de_numeros;

public class main2 {
    public static void main(String[] argv) {
        PilaDeCadenas pilaC = new PilaDeCadenas();
        pilaC.Adicionar("William");
        pilaC.Adicionar("Andres");
        pilaC.Adicionar("Josias");
        pilaC.Adicionar("Iris");
        pilaC.Adicionar("Jonathan");
        pilaC.Adicionar("Ilia");
        //pilaC.llenar(6);
        pilaC.Mostrar();
        //cuentaNombres(pilaC,"Jonathan");
        //ingresaNombres(pilaC,"Andres","Anna");
        //pilaC.Mostrar();
        //moverNombres(pilaC);
        //pilaC.Mostrar();
        moverkesimo(pilaC,3);
        pilaC.Mostrar();

    }
    public static void cuentaNombres(PilaDeCadenas pila, String Nombre){
        PilaDeCadenas aux = new PilaDeCadenas();
        String itemEliminado = "";
        int cont = 0;
        while (!pila.EsVacio()){
            itemEliminado = pila.eliminar();
            if(itemEliminado.equals(Nombre)){ // EL EQUALS SE USA PRINCIPAL MENTE PARA CADENAS
                cont = cont +1 ;
            }
            aux.Adicionar(itemEliminado);
        }
        pila.Vaciar(aux);
        System.out.println("El nombre "+ Nombre + " se repite: "+cont+ " veces ");
    }
    public static void ingresaNombres(PilaDeCadenas pila, String nombre2,String Nombre){
        PilaDeCadenas aux = new PilaDeCadenas();
        String itemEliminado = "";
        int cont = 0;
        while (!pila.EsVacio()){
            itemEliminado = pila.eliminar();
            if(itemEliminado.equals(nombre2)){
                aux.Adicionar(Nombre) ;
            }
            aux.Adicionar(itemEliminado);
        }
        pila.Vaciar(aux);
        System.out.println("El nombre adicionado ");
    }
    public static void moverNombres(PilaDeCadenas pila){
        PilaDeCadenas aux = new PilaDeCadenas();
        String ITEM1 = pila.eliminar();
        aux.Vaciar(pila);
        String ITEM2 = aux.eliminar();
        pila.Adicionar(ITEM1);
        pila.Vaciar(aux);
        pila.Adicionar(ITEM2);
    }
    public static void moverkesimo(PilaDeCadenas pila,int kesimo){
        PilaDeCadenas aux = new PilaDeCadenas();
        String itemEliminado = "";
        String min = "";
        while (!pila.EsVacio()){
            itemEliminado = pila.eliminar();
            if(pila.NroElementos()+1==kesimo){
                min = itemEliminado;
            }else{
                aux.Adicionar(itemEliminado);
            }
        }
        pila.Vaciar(aux);
        pila.Adicionar(min);
        System.out.println("eliminando ");
    }

}
