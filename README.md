# UNIVERSIDAD PERUANA DE CIENCIAS APLICADAS (UPC)

### Escuela de Ingeniería  
**Carrera:** Ingeniería de Software  
**Curso:** Desarrollo de Aplicaciones de Código Abierto (1ASI0729)  
**Ciclo:** 2025-02  
**NRC:** 7369  
**Docente:** Wilder Julio Espinoza Bravo  

---

##  TRABAJO COMPLEMENTARIO  
#  FUNDAMENTOS DE JAVA PARA PRINCIPIANTES

**Startup:** KASHU  
**Repositorio:** [https://github.com/TuCash/java-fundamentals-course-kashu.git](https://github.com/TuCash/java-fundamentals-course-kashu.git)

---

### 👥 INTEGRANTES DEL EQUIPO

| Nº | Nombre completo | Código |
|----|------------------|--------|
| 1 | **Taquiri Calderón, Jhunior Giussepe** | u20221c576 |
| 2 | **Mondoñedo Rodríguez, Juan Diego Javier** | u202110373 |
| 3 | **Mejía Poma, Patricia Valeria** | u202523271 |
| 4 | **Humano Hinostroza, Milenio** | u20211c245 |


##  OBJETIVO GENERAL

Desarrollar un **curso introductorio de programación en Java** enfocado en estudiantes de secundaria (12-17 años) sin experiencia previa, aplicando **principios de Programación Orientada a Objetos (POO)**.  
El curso tiene una duración total aproximada de **1 hora**, dividido en **8 lecciones cortas y progresivas**, con videos **no listados en YouTube** y ejercicios prácticos en plataformas online gratuitas.

---

##  OBJETIVOS ESPECÍFICOS

- Enseñar los fundamentos de la programación y la POO de manera simple y visual.  
- Fomentar el aprendizaje activo con ejemplos y prácticas interactivas.  
- Promover la inclusión tecnológica mediante herramientas gratuitas en línea.  
- Aplicar buenas prácticas de documentación y trabajo colaborativo usando GitHub.  

---

##  HERRAMIENTAS Y PLATAFORMAS

| Propósito | Herramienta / Plataforma |
|------------|--------------------------|
| Ejecución de código online | **Replit**, **JDoodle**, **OnlineGDB** |
| Control de versiones | **GitHub (repositorio público)** |
| Alojamiento de videos | **YouTube (no listados)** |
| Documentación | **Markdown (.md)** |
| Reportes | **Microsoft Word / PDF** |

---




# Curso Fundamental de Java 

¡Bienvenido al curso fundamental de Java!  
Este repositorio contiene todo el material necesario para aprender los fundamentos de la programación en **Java**, desde los conceptos básicos hasta temas más avanzados.  
Desarrollado por el equipo **Kashu** como parte del curso **Desarrollo de Aplicaciones de Open Source (UPC 2025-02, NRC 7369)**.

---

##  Contenido del Curso

El curso está dividido en **8 lecciones**, cada una con ejemplos prácticos, ejercicios y videos explicativos.

### 1️. Introducción a Java
- Estructura básica de un programa Java  
- Uso de `System.out.println()`  
- Comentarios en Java  
- [ Ver la lección en YouTube](https://youtu.be/wDRoMQEmJkc)

---

### 2️. Variables y Tipos de Datos
- Variables y tipos de datos primitivos  
- Operadores aritméticos y lógicos  
- Cadenas de texto (`String`)  
- Conversión de tipos  
- [ Ver la lección en YouTube](https://www.youtube.com/watch?v=n_oFI97LFqw)

---

### 3️. Estructuras de Control
- Condicionales `if-else`  
- Sentencias `switch-case`  
- Bucles `for` y `while`  
- Control de flujo con `break` y `continue`  
- [ Fundamentos de Java #3 – Estructuras de Control](https://youtu.be/Or8rIrHKmAY)

---

### 4️. Métodos y Entrada de Usuario
- Creación y uso de métodos  
- Parámetros y valores de retorno  
- Entrada de usuario con `Scanner`  
- Sobrecarga de métodos (`overloading`)  
- [ Fundamentos de Java #4 – Métodos y Entrada de Usuario](https://youtu.be/zdOd86EgwTM)

---

### 5️. Programación Orientada a Objetos (POO)
- Clases y objetos  
- Atributos y métodos  
- Encapsulamiento  
- Herencia y polimorfismo  

#### 📚 Videos de POO:
- [POO - Conceptos Básicos](https://youtu.be/XjaSQu1Lmgc)
- [POO - Clases y Objetos](https://youtu.be/zU-ufayiI9k)
- [POO - Constructores y Métodos](https://youtu.be/esVVNXbklgk)
- [POO - Encapsulación](https://youtu.be/NV5JP8tnPso)
- [POO - Herencia y Polimorfismo](https://youtu.be/POPDjMBjLmg)

#### 💻 Ejemplo de Código:
```java
public class Main {
    public static void main(String[] args) {
        Estudiante e1 = new Estudiante("Ana", 17, 18.5);
        Estudiante e2 = new Estudiante("Luis", 19, 15.8);
        
        e1.mostrarInfo();
        e2.mostrarInfo();
    }
}

class Estudiante {
    String nombre;
    int edad;
    double nota;
    
    Estudiante(String n, int e, double no) {
        nombre = n;
        edad = e;
        nota = no;
    }
    
    void mostrarInfo() {
        System.out.println("Nombre: " + nombre + " | Edad: " + edad + " | Nota: " + nota);
        if (nota >= 11) {
            System.out.println("Estado: Aprobado ✅");
        } else {
            System.out.println("Estado: Desaprobado ❌");
        }
    }
}
```

---

### 6️. Arreglos y Bucles Anidados
- Declaración e inicialización de arreglos  
- Recorridos con bucles anidados  
- Arreglos multidimensionales  
- Ejercicios prácticos con matrices  

#### 📚 Videos de Arrays y Bucles:
- [Arrays - Introducción](https://youtu.be/AiELBA074Uw)
- [Arrays - Manipulación](https://youtu.be/t_rjliAELYA)
- [Bucles Básicos](https://youtu.be/i_RZDKGee8g)
- [Bucles Anidados](https://youtu.be/A1NmM-HdO0U)
- [Ejercicios Prácticos](https://youtu.be/u4hwqY8S4WM)

#### 💻 Ejemplo de Código:
```java
public class Main {
    public static void main(String[] args) {
        // Arrays simples
        String[] nombres = {"Ana", "Luis", "María"};
        int[] notas = {18, 15, 12};
        
        // Recorrido de arrays
        for (int i = 0; i < nombres.length; i++) {
            System.out.println(nombres[i] + " obtuvo nota " + notas[i]);
        }
        
        // Bucles anidados - Tabla de multiplicar
        System.out.println("\nTabla de multiplicar (1 al 3):");
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                System.out.print(i * j + "\t");
            }
            System.out.println();
        }
        
        // Array bidimensional
        int[][] matriz = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println("\nMatriz 3x3:");
        for (int fila = 0; fila < matriz.length; fila++) {
            for (int columna = 0; columna < matriz[fila].length; columna++) {
                System.out.print(matriz[fila][columna] + " ");
            }
            System.out.println();
        }
    }
}
```

---

### 7. Mini Proyecto Final – Parte 1: Desarrollo
- Diseño del proyecto “Juego de Cartas”  
- Creación de clases base y subclases  
- Aplicación de principios POO  
- Manejo de entrada del usuario  
- [ Fundamentos de Java #7 – Mini Proyecto Final (Parte 1)](https://youtube.com/playlist?your_playlist_id_7)

---

### 8️. Mini Proyecto Final – Parte 2: Mejoras y Presentación 
- Refactorización del código  
- Manejo de excepciones  
- Documentación y comentarios  
- Presentación final del proyecto  
- [ Fundamentos de Java #8 – Mini Proyecto Final (Parte 2)](https://youtube.com/playlist?your_playlist_id_8)

---




