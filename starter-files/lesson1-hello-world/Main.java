/*
 * Lección 1: ¡Hola Mundo! - Introducción a Java
 * 
 * Este es un ejemplo básico que muestra:
 * 1. La estructura básica de un programa Java
 * 2. Cómo imprimir en consola
 * 3. Diferentes tipos de comentarios
 */

public class Main {
    // Método principal - punto de entrada del programa
    public static void main(String[] args) {
        // Comentario de una línea
        System.out.println("¡Hola Mundo!"); // Imprime un mensaje

        /*
         * Este es un comentario
         * de múltiples líneas
         */
        System.out.println("Bienvenidos al curso de Java");

        // Ejemplos de println vs print
        System.out.print("Esto se imprime ");
        System.out.print("en la misma línea");
        System.out.println(); // Nueva línea
        
        // Usando caracteres especiales
        System.out.println("Una línea\nOtra línea"); // \n crea nueva línea
        System.out.println("Texto con\ttabulación"); // \t añade tabulación
    }
}
