/*
 * Lección 3: Control de Flujo en Java
 * 
 * Este ejemplo muestra:
 * 1. Estructuras if-else
 * 2. Bucles (while, do-while, for)
 * 3. Switch-case
 * 4. Break y continue
 */

public class Main {
    public static void main(String[] args) {
        int grade = 15;

        if (grade >= 11) {
            System.out.println("Aprobado ✅");
        } else {
            System.out.println("Desaprobado ❌");
        }

        System.out.println("\nContando del 1 al 5:");
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }

        int count = 3;
        while (count > 0) {
            System.out.println("Cuenta atrás: " + count);
            count--;
        }
    }
}
