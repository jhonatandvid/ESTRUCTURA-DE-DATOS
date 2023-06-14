package Colas;

public class main {
    public static void main(String[] args){
        ColasDeNumeros cola = new ColasDeNumeros();
        cola.Adicionar(4);
        cola.Adicionar(6);
        cola.Adicionar(8);
        cola.Adicionar(10);
        cola.Adicionar(5);
        cola.Adicionar(6);
        cola.Mostrar();
        muestraNumeroMenor(cola);
        //labs 1 estructura de datos
        //1)CREAR UN METODO ESTATICO QUE DETERMINE CUANTOS NUMEROS SON MULTIPLOS DE 3
        multiplos(cola,3);
        //eliminar todos los elementos repetidos
        eliminarRepetidos(cola);
        cola.Mostrar();
    }
    public static int muestraNumeroMenor(ColasDeNumeros cola) {
        ColasDeNumeros aux = new ColasDeNumeros();
        int num = 0;
        //MAX_VALUE Y MIN_VALUE CON CONSTANTES EN JAVA QUE NOS DAN EL MAXIMO Y MINIMO VALOR DE UN OBJETO TIPO INT
        int min = Integer.MAX_VALUE;
        while (!cola.EsVacio()) {
            num = cola.eliminar();
            if (num < min) {
                min = num;
            }
            aux.Adicionar(num);
        }
        cola.Vaciar(aux);
        System.out.println("MENOR: " + min);
        return min;
    }
    public static void multiplos(ColasDeNumeros cola,int numero) {
        ColasDeNumeros aux = new ColasDeNumeros();
        int num = 0;
        int cont = 0;
        while (!cola.EsVacio()) {
            num = cola.eliminar();
            if (num %numero == 0) {
                cont = cont +1;
            }
            aux.Adicionar(num);
        }
        cola.Vaciar(aux);
        System.out.println("los multiplos de "+numero+" son: " + cont);
    }
    public static void eliminarRepetidos(ColasDeNumeros cola) {
        ColasDeNumeros aux = new ColasDeNumeros();
        int num = 0;
        int num2 = 0;
        while (!cola.EsVacio()) {
            num = cola.eliminar();
            num2 = cola.eliminar();
            if (num == num2 ) {
               num2 = cola.eliminar();
            }
            aux.Adicionar(num);

        }
        cola.Vaciar(aux);
        System.out.println("el numero repetido es "+num);
    }
}
