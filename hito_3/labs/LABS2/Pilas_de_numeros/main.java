package Pilas_de_numeros;

public class main {
    public static void main(String[] argv) {

        //DEFINICION PILA: LOS PRIMEROS EN ENTRAR SON LOS ULTIMOS EN SALIR Y LOS ULTIMOS SON LOS PRIMEROS
        PilaDeNumeros pila1 = new PilaDeNumeros();
        pila1.Adicionar(10);
        pila1.Adicionar(2);
        pila1.Adicionar(5);
        pila1.Adicionar(23); //este valor deberia mostrarse
        pila1.Adicionar(5);
        pila1.Mostrar();
        muestraNumeroMaximo(pila1);
        pila1.Mostrar();
        muestraNumeroMenor(pila1);
        pila1.Mostrar();
        //DETERMINAR CUANTOS NUMEROS 5 HAY EN LA PILA
        //CuantosNumHay(pila1, 5);
        //CAMBIAR VALORES EL MAYOR Y EL MENOR
        System.out.println("CAMBIOS DE NUMEROS");
        intercambiaMayorYMenor(pila1);
        pila1.Mostrar();
        //System.out.println("CALCULANDO VALORES PARES E IMPARES" );
        //numeroPar(pila1);
        Agregar(pila1,100);
        pila1.Mostrar();
    }

    //CALCULANDO NUMERO MAYOR
    public static int muestraNumeroMaximo(PilaDeNumeros pila) {
        PilaDeNumeros aux = new PilaDeNumeros();
        int num = 0;
        int max = 0;
        while (!pila.EsVacio()) {
            num = pila.eliminar();
            if (num > max) {
                max = num;
            }
            aux.Adicionar(num);
        }
        pila.Vaciar(aux);
        System.out.println("MAYOR: " + max);
        return max;
    }
    //CALCULANDO NUMERO MENOR
    public static int muestraNumeroMenor(PilaDeNumeros pila) {
        PilaDeNumeros aux = new PilaDeNumeros();
        int num = 0;
        //MAX_VALUE Y MIN_VALUE CON CONSTANTES EN JAVA QUE NOS DAN EL MAXIMO Y MINIMO VALOR DE UN OBJETO TIPO INT
        int min = Integer.MAX_VALUE;
        while (!pila.EsVacio()) {
            num = pila.eliminar();
            if (num < min) {
                min = num;
            }
            aux.Adicionar(num);
        }
        pila.Vaciar(aux);
        System.out.println("MENOR: " + min);
        return min;
    }


    public static void CuantosNumHay(PilaDeNumeros pila, int num) {
        PilaDeNumeros aux = new PilaDeNumeros();
        int numelim = 0;
        int cont = 0;
        while (!pila.EsVacio()) {
            numelim = pila.eliminar();
            if (numelim == num) {
                cont = cont +1;
            }
            aux.Adicionar(num);

        } pila.Vaciar(aux);
        System.out.println("EL NUMERO SE REPITE: " + cont);
    }

    //cambiando valores
    public static void intercambiaMayorYMenor(PilaDeNumeros pila) {
        PilaDeNumeros aux = new PilaDeNumeros();
        int num = 0;
        int max = muestraNumeroMaximo(pila);
        int min = muestraNumeroMenor(pila);
        //intercambiando
        while (!pila.EsVacio()) {
             num = pila.eliminar();
            if (num == max) {
                num = min;
            } else if (num == min) {
                num = max;
            }
            aux.Adicionar(num);
        }
        pila.Vaciar(aux);
        System.out.println("VALORES INTERCAMBIADOS" );
    }
    public static void numeroPar(PilaDeNumeros pila) {
        PilaDeNumeros aux = new PilaDeNumeros();
        int num = 0;
        int cont = 0;
        int cont1 = 0;
        //intercambiando
        while (!pila.EsVacio()) {
            num = pila.eliminar();
            if (num %2 == 0) {
                cont += 1;
                System.out.println(  num+ " es PAR ");
            } else if (num %2 == 1) {
                cont1 += 1;
                System.out.println( num+" es IMPAR " );
            }
            aux.Adicionar(num);

        }
        pila.Vaciar(aux);
        System.out.println("PAR: "+cont );
        System.out.println("IMPAR: "+cont1 );
    }
    public static void Agregar(PilaDeNumeros pila,int nuevo) {
        PilaDeNumeros aux = new PilaDeNumeros();
        aux.Vaciar(pila);
        aux.Adicionar(nuevo);
        pila.Vaciar(aux);
    }
}

