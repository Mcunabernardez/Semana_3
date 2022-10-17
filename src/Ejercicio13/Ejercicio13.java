package Ejercicio13;

import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner valor = new Scanner(System.in);
        System.out.println("De que número quieres la tabla de 10: ");
        int a = valor.nextInt();

        System.out.println("La tabla de "+a);
        for (int i=0 ; i<11 ; i++) {
            int resultado = a * i;
            System.out.println("2 x "+i+" = "  +resultado);
        }
    }
}