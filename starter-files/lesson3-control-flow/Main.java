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
        // If-else
        System.out.println("=== Estructura if-else ===");
        int edad = 18;
        
        if (edad < 18) {
            System.out.println("Eres menor de edad");
        } else if (edad == 18) {
            System.out.println("Acabas de alcanzar la mayoría de edad");
        } else {
            System.out.println("Eres mayor de edad");
        }

        // Switch
        System.out.println("\n=== Estructura switch ===");
        int diaSemana = 3;
        switch (diaSemana) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miércoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            default:
                System.out.println("Fin de semana");
        }

        // Bucle while
        System.out.println("\n=== Bucle while ===");
        int contador = 0;
        while (contador < 3) {
            System.out.println("Contador while: " + contador);
            contador++;
        }

        // Bucle do-while
        System.out.println("\n=== Bucle do-while ===");
        contador = 0;
        do {
            System.out.println("Contador do-while: " + contador);
            contador++;
        } while (contador < 3);

        // Bucle for
        System.out.println("\n=== Bucle for ===");
        for (int i = 0; i < 3; i++) {
            System.out.println("Contador for: " + i);
        }

        // Break y continue
        System.out.println("\n=== Break y continue ===");
        for (int i = 0; i < 5; i++) {
            if (i == 1) {
                continue; // Salta esta iteración
            }
            if (i == 4) {
                break; // Sale del bucle
            }
            System.out.println("Número: " + i);
        }

        // For anidado con etiquetas
        System.out.println("\n=== For anidado con etiquetas ===");
        externo: for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == 1 && j == 1) {
                    break externo; // Sale del bucle externo
                }
                System.out.printf("i=%d, j=%d\n", i, j);
            }
        }
    }
}
