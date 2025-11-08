/*
 * Lección 2: Variables y Tipos de Datos en Java
 * 
 * Este ejemplo muestra:
 * 1. Tipos de datos primitivos
 * 2. Declaración y asignación de variables
 * 3. Operaciones básicas
 * 4. Conversión de tipos (casting)
 */

public class Main {
    public static void main(String[] args) {
        // Tipos numéricos enteros
        byte numeroPequeno = 127;
        short numeroCorto = 32767;
        int numeroEntero = 2147483647;
        long numeroLargo = 9223372036854775807L; // Notar la 'L' al final

        // Tipos numéricos decimales
        float decimal = 3.14f; // Notar la 'f' al final
        double decimalPreciso = 3.141592653589793;

        // Caracteres y booleanos
        char caracter = 'A';
        boolean esVerdadero = true;

        // Cadenas de texto (String no es un tipo primitivo)
        String texto = "¡Hola desde Java!";

        // Mostrando los valores
        System.out.println("=== Tipos de Datos en Java ===");
        System.out.println("byte: " + numeroPequeno);
        System.out.println("short: " + numeroCorto);
        System.out.println("int: " + numeroEntero);
        System.out.println("long: " + numeroLargo);
        System.out.println("float: " + decimal);
        System.out.println("double: " + decimalPreciso);
        System.out.println("char: " + caracter);
        System.out.println("boolean: " + esVerdadero);
        System.out.println("String: " + texto);

        // Operaciones básicas
        System.out.println("\n=== Operaciones Básicas ===");
        int a = 10;
        int b = 3;
        System.out.println("a = " + a + ", b = " + b);
        System.out.println("Suma: " + (a + b));
        System.out.println("Resta: " + (a - b));
        System.out.println("Multiplicación: " + (a * b));
        System.out.println("División: " + (a / b));
        System.out.println("Módulo: " + (a % b));

        // Conversión de tipos (casting)
        System.out.println("\n=== Conversión de Tipos ===");
        double numeroDouble = 9.99;
        int numeroConvertido = (int) numeroDouble;
        System.out.println("Double: " + numeroDouble);
        System.out.println("Convertido a int: " + numeroConvertido);
    }
}
