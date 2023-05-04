package Defensa_Pilas_H3;

import Libros.Libro;
import Libros.PilaDeLibros;

public class main {
    public static void main(String[] argv){
        Estudiante Estudiantes1 = new Estudiante("William","Barra",33,"El alto",62,"6778933LP");
        Estudiante Estudiantes2 = new Estudiante("Maria","Mancora Lopez",25,"La paz",51,"7485966LP");
        Estudiante Estudiantes3 = new Estudiante("Edson ivan","Condori Condori",21,"Santa cruz",33,"7425169SC");
        Estudiante Estudiantes4 = new Estudiante("Elena","Lopez Mendoza",19,"Cochabamba",40,"4152367CB");
        Estudiante Estudiantes5 = new Estudiante("Sergio Andres","Mendoza Alvarado",20,"Cochabamba",78,"7485961CB");
        //INSTANCIANDO LA CLASE//
        PilaDeEstudiantes pilaDeEstudiantes1 = new PilaDeEstudiantes();
        //AGREGANDO DATOS A LA PILA//
        pilaDeEstudiantes1.Adicionar(Estudiantes1);
        pilaDeEstudiantes1.Adicionar(Estudiantes2);
        pilaDeEstudiantes1.Adicionar(Estudiantes3);
        pilaDeEstudiantes1.Adicionar(Estudiantes4);
        pilaDeEstudiantes1.Adicionar(Estudiantes5);
        //pilaDeEstudiantes1.Mostrar();
        //EJERICIO 1:
        //CREAR UN METODO QUE DETERMINE CUANDOS ESTUDIANTES APROVARON notas mayores a 51 y la extencion sea lp
        Aprovados(pilaDeEstudiantes1);
        pilaDeEstudiantes1.Mostrar();
        //EJERCICIO 2:
        //CREAR UN METODO QUE LLEVAR EL K ESIMO
        kEsimoPosicion(pilaDeEstudiantes1,2);
        pilaDeEstudiantes1.Mostrar();
        //EJERCICIO 3:
        //mover a la base de la pila el estudiante con menor nota
        menor(pilaDeEstudiantes1);
        moverBase(pilaDeEstudiantes1);
        pilaDeEstudiantes1.Mostrar();
        //Ejercicio 4:
        //Ordenar donde el cb sea cocha vallan arriba y otros  abajo
        Ordenar(pilaDeEstudiantes1);
        pilaDeEstudiantes1.Mostrar();

    }
    public static void Aprovados(PilaDeEstudiantes pila){
        PilaDeEstudiantes aux = new PilaDeEstudiantes();
        Estudiante item = null;
        int cont = 0;
        while (!pila.EsVacio()){
            item = pila.eliminar();
                String str = item.getCI();
                String subStr = str.substring(str.length() -2);
                if (subStr.equals("LP")) {
                    if(item.getNotafinal()>51){
                        cont = cont +1 ;
                    }
                }
                aux.Adicionar(item);
        }
        pila.Vaciar(aux);
        System.out.println("Numero de estudiantes aprovados es: "+cont );
    }
    public static void kEsimoPosicion(PilaDeEstudiantes pila,int kesimo){
        PilaDeEstudiantes aux = new PilaDeEstudiantes();
        Estudiante item = null;
        Estudiante min = null;
        while (!pila.EsVacio()){
            item = pila.eliminar();
                if(pila.NroElementos()+1==kesimo){
                    min = item;
                }else{
                    aux.Adicionar(item);
                }
        }
        pila.Vaciar(aux);
        pila.Adicionar(min);
        System.out.println("\nMOSTRANDO NUEVA PILA DE DATOS\n ");
    }
    public static void moverBase(PilaDeEstudiantes pila){
            PilaDeEstudiantes aux = new PilaDeEstudiantes();
            PilaDeEstudiantes auxMenor = new PilaDeEstudiantes();
            Estudiante item = null;
            int menor = menor(pila);
            while (!pila.EsVacio()){
                item = pila.eliminar();
                    if(item.getNotafinal() == menor){
                        aux.Adicionar(item);
                    } else {
                        auxMenor.Adicionar(item);
                    }
            }
            pila.Vaciar(auxMenor);
            pila.Vaciar(aux);
            System.out.println("///MOSTRANDO LA NUEVA PILA DE CLIENTES///");

    }
    public static int menor(PilaDeEstudiantes pilaA) {
        PilaDeEstudiantes aux = new PilaDeEstudiantes();
        int menor = Integer.MAX_VALUE;
        while (!pilaA.EsVacio()) {
            Estudiante item = pilaA.eliminar();
            if (item.getNotafinal() < menor) {
                menor = item.getNotafinal();
            }
            aux.Adicionar(item);
        }
        System.out.println("El menor es: " + menor);
        pilaA.Vaciar(aux);
        return menor;
    }
    public static void Ordenar(PilaDeEstudiantes pila){
        PilaDeEstudiantes aux = new PilaDeEstudiantes();
        PilaDeEstudiantes aux2 = new PilaDeEstudiantes();
        Estudiante item = null;
        int cont = 0;
        while (!pila.EsVacio()){
            item = pila.eliminar();
            String str = item.getCI();
            String subStr = str.substring(str.length() -2);
            if (!subStr.equals("LP")) {
                aux.Adicionar(item);
            } else {
                aux2.Adicionar(item);
            }
        }
        pila.Vaciar(aux);
        pila.Vaciar(aux2);
        System.out.println("ORDENANDO: " );
    }

}
