/*
 * Lección 5: Programación Orientada a Objetos (POO)
 * Archivo: Main1.java
 * 
 * Este ejemplo demuestra:
 * 1. Creación de clases y objetos
 * 2. Constructores con parámetros
 * 3. Métodos de instancia
 * 4. Encapsulamiento básico
 * 5. Uso de atributos y métodos
 */

public class Main1 {
    public static void main(String[] args) {
        System.out.println("=== Lección 5: Programación Orientada a Objetos (POO) ===\n");
        
        // Crear objetos de la clase Estudiante
        Estudiante e1 = new Estudiante("Ana García", 17, 18.5);
        Estudiante e2 = new Estudiante("Luis Pérez", 19, 15.8);
        Estudiante e3 = new Estudiante("María López", 18, 10.2);
        
        // Mostrar información de cada estudiante
        e1.mostrarInfo();
        e2.mostrarInfo();
        e3.mostrarInfo();
        
        // Demostrar uso de métodos
        System.out.println("\n=== Simulando cumpleaños ===");
        e1.cumplirAnios();
        e1.mostrarInfo();
        
        // Verificar estado académico
        System.out.println("\n=== Estado académico ===");
        System.out.println(e1.getNombre() + " está " + (e1.estaAprobado() ? "APROBADO" : "DESAPROBADO"));
        System.out.println(e2.getNombre() + " está " + (e2.estaAprobado() ? "APROBADO" : "DESAPROBADO"));
        System.out.println(e3.getNombre() + " está " + (e3.estaAprobado() ? "APROBADO" : "DESAPROBADO"));
    }
}

class Estudiante {
    // Atributos (encapsulados como private para mejores prácticas)
    private String nombre;
    private int edad;
    private double nota;
    
    // Constructor
    public Estudiante(String nombre, int edad, double nota) {
        this.nombre = nombre;
        this.edad = edad;
        this.nota = nota;
    }
    
    // Métodos getter (acceso a atributos privados)
    public String getNombre() {
        return nombre;
    }
    
    public int getEdad() {
        return edad;
    }
    
    public double getNota() {
        return nota;
    }
    
    // Métodos setter (modificar atributos privados)
    public void setNota(double nuevaNota) {
        if (nuevaNota >= 0 && nuevaNota <= 20) {
            this.nota = nuevaNota;
        }
    }
    
    // Método para mostrar información del estudiante
    public void mostrarInfo() {
        System.out.println("\n--- Información del Estudiante ---");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad + " años");
        System.out.println("Nota: " + nota + "/20");
        System.out.println("Estado: " + (estaAprobado() ? "✅ Aprobado" : "❌ Desaprobado"));
    }
    
    // Método para verificar si está aprobado
    public boolean estaAprobado() {
        return nota >= 11.0;
    }
    
    // Método para simular cumpleaños
    public void cumplirAnios() {
        edad++;
        System.out.println("¡Feliz cumpleaños " + nombre + "! Ahora tienes " + edad + " años.");
    }
    
    // Método para calcular el nivel académico
    public String getNivelAcademico() {
        if (nota >= 18) return "Excelente";
        else if (nota >= 15) return "Bueno";
        else if (nota >= 11) return "Regular";
        else return "Insuficiente";
    }
}