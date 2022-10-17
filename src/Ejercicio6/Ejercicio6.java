package Ejercicio6;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {

        Scanner almacenar = new Scanner(System.in);
        String nombre = "";
        System.out.println("Su nombre por favor: ");
        nombre = almacenar.nextLine();

        String localidad = "";
        System.out.println("Su localidad por favor: ");
        localidad = almacenar.nextLine();

        String gusto = "";
        System.out.println("¿Algo que le guste? ");
        gusto = almacenar.nextLine();

        System.out.println("Hola, mi nombre es " + nombre +"\nSoy de " + localidad + "\nMe gusta " + gusto);

    }
}
