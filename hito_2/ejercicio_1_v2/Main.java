import Ejercicios.Ejercicios;
import Ejercicios.Student;
import Math_utils.MATH;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Ejercicios ejer1 = new Ejercicios();
        ejer1.mostrarMensaje();
        System.out.println("\ngenerarNumerosNaturalesFOR");
        ejer1.generarNumerosNaturalesFOR();
        System.out.println("\ngenerarNumerosParesFor");
        ejer1.generarNumerosParesFor();
        System.out.println("\ngenerarNumerosNaturalesWHILE");
        ejer1.generarNumerosNaturalesWHILE();


//segundo ejercicio

        MATH math= new MATH("GOOAPP","0.1V",2023);
        math.printApp();
        math.generateNaturalNumber(10);
        math.generatePairNumber(10);
        math.getExtensionFromCI("12345678LP");
        System.out.println("Hola Mundo!");

        //tercer ejercicio

        Student stu = new Student("pepitio","pep",25);

        //pepito1
        //pep1
        //30
        //NOMBRE
        String nombre = stu.getFullName();
        System.out.println("Nombre:"+ nombre);
        stu.setFullname("pepito1");
        String nombreCambiado = stu.getFullName();
        System.out.println("Nombre:"+ nombreCambiado);
        //APELLIDO
        String apellido = stu.getLastname();
        System.out.println("Apellido:"+ apellido);
        stu.setLastname("pep1");
        String apellidoCambiado = stu.getLastname();
        System.out.println("Apellido:"+ apellidoCambiado);
        //EDAD
        int edad = stu.getAge();
        System.out.println("edad:"+ edad);
        stu.setAge(30);
        int edadCambiado = stu.getAge();
        System.out.println("edad:"+ edadCambiado);





























    }
}

















