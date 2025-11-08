/*
 * Lección 5: Fundamentos de POO - Herencia y Polimorfismo
 * 
 * Este ejemplo muestra:
 * 1. Herencia de clases
 * 2. Sobrescritura de métodos
 * 3. Polimorfismo
 * 4. Clases abstractas e interfaces
 */

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Ana", 17);
        s1.showInfo();
    }
}

class Student {
    String name;
    int age;

    Student(String n, int a) {
        name = n;
        age = a;
    }

    void showInfo() {
        System.out.println("Nombre: " + name + " | Edad: " + age);
    }
}

