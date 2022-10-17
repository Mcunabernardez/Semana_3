package Ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        double r = 10;
        double a;
        double L;
        double PI = 3.1415;

        double r2 = Math.pow(r, 2);
        a = PI + r2;
        L = 2 * PI * r;
        System.out.println("El area de la circunferencia es: " + a + "\nSu longitud es: " + L);

    }
}