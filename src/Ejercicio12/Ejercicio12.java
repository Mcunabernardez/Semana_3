package Ejercicio12;

import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner permiso = new Scanner(System.in);
        System.out.println("Escribe tu edad: ");
        int edad = permiso.nextInt();
        int minimo = 18;

        if (edad >= minimo) {
            System.out.println("Puede sacarse el permiso de conducir");
        } else {
            System.out.println("Aún no tiene la edad adecuada");
        }
    }
}
