package Pilas_de_numeros;

public class main {
    public static void main(String[] argv) {
        PilaDeNumeros pila1 = new PilaDeNumeros();
        pila1.Adicionar(10);
        pila1.Adicionar(2);
        pila1.Adicionar(5);
        pila1.Adicionar(23); //este valor deberia mostrarse
        pila1.Adicionar(5);
        pila1.Mostrar();
        muestraNumeroMaximo(pila1);
        pila1.Mostrar();
        //DETERMINAR CUANTOS NUMEROS 5 HAY EN LA PILA
        CuantosNumHay(pila1, 5);

    }

    public static void muestraNumeroMaximo(PilaDeNumeros pila) {
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
}
