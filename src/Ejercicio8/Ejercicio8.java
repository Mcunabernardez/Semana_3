package Ejercicio8;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        int A;
        int B;
        Scanner datos = new Scanner(System.in);
        System.out.println("Elige un valor para A: ");
        A = datos.nextInt();

        System.out.println("Elige un valor para B: ");
        B = datos.nextInt();

        if (A==B){
            System.out.println("El valor de A es igual al valor de B");
        } else {
            System.out.println("El valor de A no es igual la valor de B");
        }

    }
}
