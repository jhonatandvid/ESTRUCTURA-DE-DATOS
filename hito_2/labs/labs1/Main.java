import Ejercicios.Ejercicios;
import Math_utils.MATH;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Ejercicios ejer1 = new Ejercicios();
        ejer1.mostrarMensaje();
        System.out.println("generarNumerosNaturalesFOR");
        ejer1.generarNumerosNaturalesFOR();
        System.out.println("generarNumerosParesFor");
        ejer1.generarNumerosParesFor();
        System.out.println("generarNumerosNaturalesWHILE");
        ejer1.generarNumerosNaturalesWHILE();


//segundo ejercicio

        MATH math= new MATH("GOOAPP","0.1V",2023);
        math.printApp();
        math.generateNaturalNumber(10);
        math.generatePairNumber(10);
        math.getExtensionFromCI("LP");
        System.out.println("Hola Mundo!"); */


    }
}

















