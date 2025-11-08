/*
 * Lección 4: Métodos y Programación Orientada a Objetos
 * 
 * Este ejemplo muestra:
 * 1. Definición y uso de métodos
 * 2. Parámetros y retorno de valores
 * 3. Sobrecarga de métodos
 * 4. Métodos estáticos vs de instancia
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Ingresa tu nombre: ");
        String name = input.nextLine();

        System.out.print("Ingresa tu edad: ");
        int age = input.nextInt();

        greetUser(name, age);
    }

    static void greetUser(String name, int age) {
        System.out.println("¡Hola " + name + "! Tienes " + age + " años.");
    }
}
