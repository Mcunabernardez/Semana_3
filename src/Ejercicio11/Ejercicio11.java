package Ejercicio11;

import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {

        int a;
        int b;
        int c;
        int resultado;
        Scanner numero1 = new Scanner(System.in);
        System.out.println("Elige un numero: ");
        a = numero1.nextInt();

        b = a + 1;
        Scanner numero2 = new Scanner(System.in);
        System.out.println("Elige otro numero: ");
        c = numero2.nextInt();

        resultado = b * c;

        System.out.println("El resultado final es: \n" +resultado);
    }
}
