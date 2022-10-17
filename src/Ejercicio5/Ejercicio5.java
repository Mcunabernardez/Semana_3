package Ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        double r;
        double a;
        double L;
        double PI = 3.1415;

        try {

            Scanner calculo = new Scanner(System.in);
            System.out.println("Valor del radio: ");
            r = calculo.nextDouble();
            double r2 = Math.pow(r, 2);

            a = PI + r2;
            L = 2 * PI * r;

            System.out.println("El area de la circunferencia es: " + a + "\nSu longitud es: " + L);
        } catch (Exception e) {
            System.out.println("Solo se admiten valores válidos");
        }
    }
}
