/*
 * Lección 6: Siguientes Pasos - Excepciones y Características Avanzadas
 * 
 * Este ejemplo muestra:
 * 1. Manejo de excepciones (try-catch)
 * 2. Excepciones personalizadas
 * 3. Uso de finally
 * 4. Lanzamiento de excepciones
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int score = 0;

        System.out.println("Bienvenido al Mini Quiz de Java 🎯");

        System.out.print("1. ¿Qué tipo de dato guarda texto? ");
        String answer1 = input.nextLine();
        if (answer1.equalsIgnoreCase("String")) score++;

        System.out.print("2. ¿Qué tipo de dato guarda valores verdaderos o falsos? ");
        String answer2 = input.nextLine();
        if (answer2.equalsIgnoreCase("boolean")) score++;

        System.out.println("\nTu puntaje final es: " + score + "/2");
        System.out.println("¡Excelente trabajo, programador Java!");
    }
}
