/*
 * Lección 6: Arreglos y Bucles Anidados
 * Archivo: Main1.java
 * 
 * Este ejemplo demuestra:
 * 1. Declaración e inicialización de arreglos
 * 2. Recorrido de arreglos con bucles
 * 3. Bucles anidados para tablas y matrices
 * 4. Arreglos bidimensionales
 * 5. Búsqueda y operaciones con arreglos
 */

public class Main1 {
    public static void main(String[] args) {
        System.out.println("=== Lección 6: Arreglos y Bucles Anidados ===\n");
        
        // 1. Arreglos simples
        System.out.println("1. ARREGLOS SIMPLES");
        String[] estudiantes = {"Ana", "Luis", "María", "Carlos", "Sofía"};
        int[] edades = {17, 19, 18, 20, 16};
        double[] notas = {18.5, 15.8, 16.2, 14.0, 19.1};
        
        // Recorrido básico de arreglos
        System.out.println("Lista de estudiantes:");
        for (int i = 0; i < estudiantes.length; i++) {
            System.out.println((i+1) + ". " + estudiantes[i] + 
                             " - Edad: " + edades[i] + 
                             " - Nota: " + notas[i]);
        }
        
        // 2. Búsqueda en arreglos
        System.out.println("\n2. BÚSQUEDA EN ARREGLOS");
        String buscarEstudiante = "María";
        int posicionEncontrada = -1;
        
        for (int i = 0; i < estudiantes.length; i++) {
            if (estudiantes[i].equals(buscarEstudiante)) {
                posicionEncontrada = i;
                break;
            }
        }
        
        if (posicionEncontrada != -1) {
            System.out.println("Estudiante encontrado: " + estudiantes[posicionEncontrada] + 
                             " (Posición: " + posicionEncontrada + ", Nota: " + 
                             notas[posicionEncontrada] + ")");
        }
        
        // 3. Cálculos con arreglos
        System.out.println("\n3. ESTADÍSTICAS");
        double sumaNotas = 0;
        double notaMaxima = notas[0];
        double notaMinima = notas[0];
        
        for (int i = 0; i < notas.length; i++) {
            sumaNotas += notas[i];
            if (notas[i] > notaMaxima) notaMaxima = notas[i];
            if (notas[i] < notaMinima) notaMinima = notas[i];
        }
        
        double promedio = sumaNotas / notas.length;
        System.out.println("Promedio de notas: " + String.format("%.2f", promedio));
        System.out.println("Nota máxima: " + notaMaxima);
        System.out.println("Nota mínima: " + notaMinima);
        
        // 4. Bucles anidados - Tabla de multiplicar
        System.out.println("\n4. BUCLES ANIDADOS - Tabla de Multiplicar");
        System.out.println("Tabla del 1 al 5:");
        
        for (int tabla = 1; tabla <= 5; tabla++) {
            System.out.println("\nTabla del " + tabla + ":");
            for (int multiplicador = 1; multiplicador <= 10; multiplicador++) {
                int resultado = tabla * multiplicador;
                System.out.println(tabla + " x " + multiplicador + " = " + resultado);
            }
        }
        
        // 5. Arreglos bidimensionales (matrices)
        System.out.println("\n5. MATRICES (ARREGLOS BIDIMENSIONALES)");
        
        // Crear y llenar una matriz de calificaciones
        int[][] calificaciones = {
            {18, 15, 17, 19, 16},  // Ana
            {14, 16, 15, 18, 17},  // Luis
            {19, 18, 16, 17, 20},  // María
            {13, 14, 15, 16, 12},  // Carlos
            {20, 19, 18, 19, 18}   // Sofía
        };
        
        String[] materias = {"Matemáticas", "Ciencias", "Historia", "Literatura", "Inglés"};
        
        // Mostrar matriz de calificaciones
        System.out.println("Calificaciones por estudiante y materia:");
        System.out.print("Estudiante\\Materia\t");
        for (String materia : materias) {
            System.out.print(materia + "\t");
        }
        System.out.println("Promedio");
        
        for (int estudiante = 0; estudiante < estudiantes.length; estudiante++) {
            System.out.print(estudiantes[estudiante] + "\t\t");
            
            double sumaEstudiante = 0;
            for (int materia = 0; materia < materias.length; materia++) {
                System.out.print(calificaciones[estudiante][materia] + "\t\t");
                sumaEstudiante += calificaciones[estudiante][materia];
            }
            
            double promedioEstudiante = sumaEstudiante / materias.length;
            System.out.println(String.format("%.1f", promedioEstudiante));
        }
        
        // 6. Promedio por materia
        System.out.println("\n6. PROMEDIO POR MATERIA");
        for (int materia = 0; materia < materias.length; materia++) {
            double sumaMateria = 0;
            for (int estudiante = 0; estudiante < estudiantes.length; estudiante++) {
                sumaMateria += calificaciones[estudiante][materia];
            }
            double promedioMateria = sumaMateria / estudiantes.length;
            System.out.println(materias[materia] + ": " + String.format("%.1f", promedioMateria));
        }
        
        // 7. Patrón con bucles anidados
        System.out.println("\n7. PATRÓN TRIANGULAR");
        for (int fila = 1; fila <= 5; fila++) {
            for (int columna = 1; columna <= fila; columna++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        
        System.out.println("\n=== Fin de la lección ===");
    }
}