/*
 * Lección 6: Siguientes Pasos - Excepciones y Características Avanzadas
 * 
 * Este ejemplo muestra:
 * 1. Manejo de excepciones (try-catch)
 * 2. Excepciones personalizadas
 * 3. Uso de finally
 * 4. Lanzamiento de excepciones
 */

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Manejo de Excepciones ===\n");

        // Ejemplo básico de try-catch
        try {
            int resultado = dividir(10, 0);
            System.out.println("Resultado: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Error: No se puede dividir por cero");
        }

        // Manejo de múltiples excepciones
        System.out.println("\n=== Múltiples Excepciones ===");
        int[] numeros = {1, 2, 3};
        try {
            System.out.println(numeros[5]); // IndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Índice fuera de rango");
        } catch (Exception e) {
            System.out.println("Error general: " + e.getMessage());
        }

        // Uso de finally
        System.out.println("\n=== Uso de finally ===");
        try {
            procesarDatos();
        } catch (Exception e) {
            System.out.println("Error al procesar datos: " + e.getMessage());
        } finally {
            System.out.println("Limpieza de recursos (siempre se ejecuta)");
        }

        // Excepción personalizada
        System.out.println("\n=== Excepción Personalizada ===");
        try {
            validarEdad(15);
        } catch (EdadInvalidaException e) {
            System.out.println("Error de validación: " + e.getMessage());
        }
    }

    // Método que puede lanzar una excepción
    public static int dividir(int a, int b) {
        return a / b;
    }

    // Método con múltiples posibles excepciones
    public static void procesarDatos() throws Exception {
        throw new Exception("Error simulado en el procesamiento");
    }

    // Método que usa una excepción personalizada
    public static void validarEdad(int edad) throws EdadInvalidaException {
        if (edad < 18) {
            throw new EdadInvalidaException("La edad debe ser mayor o igual a 18");
        }
        System.out.println("Edad válida: " + edad);
    }
}

// Excepción personalizada
class EdadInvalidaException extends Exception {
    public EdadInvalidaException(String mensaje) {
        super(mensaje);
    }
}
