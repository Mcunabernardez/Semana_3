package Ejercicio7;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {

        Scanner valor1 = new Scanner(System.in);
        System.out.println("Valor deseado: ");
        int a = valor1.nextInt();


        Scanner valor2 = new Scanner(System.in);
        System.out.println("Otro valor: ");
        int b = valor2.nextInt();

        int resultado = a % b;
        System.out.println("El modulo de los valores es: " +resultado);
    }
}
