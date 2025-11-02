/**
 * Lesson 5 - OOP basics (classes, fields, constructors)
 * File: starter-files/lesson5-oop-basics/Main.java
 *
 * Demonstrates creating a simple object and calling its methods.
 */

public class Main {
    public static void main(String[] args) {
        System.out.println("Lesson 5 — OOP basics: create and interact with objects\n");

        Person p = new Person("Ana", 30);
        System.out.println(p);
        p.birthday();
        System.out.println("After birthday: " + p);
    }
}

/**
 * Simple Person class used for demonstration.
 */
class Person {
    private String name;
    private int age;

    /**
     * Construct a person with name and age.
     */
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * Simulate a birthday by incrementing age.
     */
    public void birthday() {
        this.age += 1;
    }

    @Override
    public String toString() {
        return String.format("Person{name='%s', age=%d}", name, age);
    }
}
