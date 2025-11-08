/*
 * Lección 4: Métodos y Programación Orientada a Objetos
 * 
 * Este ejemplo muestra:
 * 1. Definición y uso de métodos
 * 2. Parámetros y retorno de valores
 * 3. Sobrecarga de métodos
 * 4. Métodos estáticos vs de instancia
 */

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Métodos y POO ===\n");

        // Uso de métodos estáticos
        System.out.println("Suma de números: " + sumar(5, 3));
        System.out.println("Suma con decimales: " + sumar(5.5, 3.3));
        
        // Uso de método con múltiples parámetros
        System.out.println("Promedio: " + calcularPromedio(8.5, 9.0, 7.5));

        // Creación de objetos y uso de métodos de instancia
        Calculadora calc = new Calculadora();
        System.out.println("\n=== Operaciones con Calculadora ===");
        System.out.println("Multiplicación: " + calc.multiplicar(4, 3));
        System.out.println("División: " + calc.dividir(10, 2));

        // Uso de método con valores variables (varargs)
        System.out.println("\n=== Suma de múltiples números ===");
        System.out.println("Suma total: " + sumarTodos(1, 2, 3, 4, 5));

        // Demostración de recursividad
        System.out.println("\n=== Factorial (recursivo) ===");
        System.out.println("Factorial de 5: " + factorial(5));
    }

    // Método básico con dos parámetros
    public static int sumar(int a, int b) {
        return a + b;
    }

    // Sobrecarga del método sumar para decimales
    public static double sumar(double a, double b) {
        return a + b;
    }

    // Método con múltiples parámetros
    public static double calcularPromedio(double... notas) {
        double suma = 0;
        for (double nota : notas) {
            suma += nota;
        }
        return suma / notas.length;
    }

    // Método recursivo
    public static int factorial(int n) {
        if (n <= 1) return 1;
        return n * factorial(n - 1);
    }

    // Método con varargs
    public static int sumarTodos(int... numeros) {
        int suma = 0;
        for (int num : numeros) {
            suma += num;
        }
        return suma;
    }
}

// Clase auxiliar para demostrar métodos de instancia
class Calculadora {
    public int multiplicar(int a, int b) {
        return a * b;
    }

    public double dividir(double a, double b) {
        if (b == 0) {
            System.out.println("Error: División por cero");
            return 0;
        }
        return a / b;
    }
}
