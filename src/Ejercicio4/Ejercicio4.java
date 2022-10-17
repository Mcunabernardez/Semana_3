package Ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        float a;
        float b;
        float h;
        try {
            Scanner calculo = new Scanner(System.in);
            System.out.println("Ingresa el valor de la base: ");
            b = calculo.nextFloat();

            System.out.println("Ingresa el valor de la altura: ");
            h = calculo.nextFloat();

            a = b * h;
            System.out.println("El area del rectángulo es: " + a);

        } catch (Exception e) {
            System.out.println("Solo se admiten valores validos");


        }
    }
}