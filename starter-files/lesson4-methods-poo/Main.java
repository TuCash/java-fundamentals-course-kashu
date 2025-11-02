/**
 * Lesson 4 - Methods and OOP
 * File: starter-files/lesson4-methods-poo/Main.java
 *
 * Simple examples that demonstrate static and instance methods.
 */

public class Main {
    public static void main(String[] args) {
        System.out.println("Lesson 4 — Methods and OOP examples\n");

        // static method usage
        int a = 7, b = 5;
        System.out.printf("Static add: %d + %d = %d\n", a, b, Calculator.add(a, b));

        // instance method usage
        Calculator calc = new Calculator(10);
        System.out.printf("Multiply by factor (10): %d * %d = %d\n", a, calc.getFactor(), calc.multiply(a));
    }
}

/**
 * Calculator demonstrates an instance method (multiply) and a static method (add).
 */
class Calculator {
    private int factor;

    /**
     * Create a calculator with a multiplication factor.
     * @param factor multiplication factor used by multiply()
     */
    public Calculator(int factor) {
        this.factor = factor;
    }

    /**
     * Get the configured factor.
     */
    public int getFactor() {
        return factor;
    }

    /**
     * Multiply the provided value by the internal factor.
     * @param x value to multiply
     * @return x * factor
     */
    public int multiply(int x) {
        return x * factor;
    }

    /**
     * Add two integers (static utility method).
     */
    public static int add(int x, int y) {
        return x + y;
    }
}
