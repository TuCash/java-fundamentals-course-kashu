# Lecciones del Curso de Java Fundamentals 🚀

Este documento contiene la información detallada de todas las lecciones del curso.

## 📚 Índice de Lecciones

1. [Hola Mundo y Fundamentos Básicos](#lección-1-hola-mundo)
2. [Variables y Tipos de Datos](#lección-2-variables)
3. [Control de Flujo](#lección-3-control-de-flujo)
4. [Métodos y POO](#lección-4-métodos-y-poo)
5. [POO Básica](#lección-5-poo-básica)
6. [Siguientes Pasos](#lección-6-siguientes-pasos)

---

## Lección 1: Hola Mundo

### Objetivos
- Entender la estructura básica de un programa Java
- Aprender a imprimir en consola
- Conocer los diferentes tipos de comentarios

### Conceptos Clave
```java
public class Main {
    public static void main(String[] args) {
        System.out.println("¡Hola Mundo!");
    }
}
```

### Temas Cubiertos
- Estructura básica de una clase Java
- Método main como punto de entrada
- System.out.println() vs System.out.print()
- Comentarios de una línea (//) y múltiples líneas (/* */)

---

## Lección 2: Variables

### Objetivos
- Comprender los tipos de datos en Java
- Aprender a declarar y usar variables
- Realizar operaciones básicas

### Tipos de Datos
- Números enteros: byte, short, int, long
- Números decimales: float, double
- Caracteres: char
- Booleanos: boolean
- Cadenas: String

### Ejemplos
```java
int numero = 42;
double decimal = 3.14;
String texto = "Hola";
boolean activo = true;
```

---

## Lección 3: Control de Flujo

### Objetivos
- Dominar estructuras de control if-else
- Usar diferentes tipos de bucles
- Implementar switch-case

### Estructuras
1. Condicionales
   - if-else
   - switch-case

2. Bucles
   - while
   - do-while
   - for
   - break y continue

### Ejemplos Prácticos
```java
// If-else
if (edad >= 18) {
    System.out.println("Eres mayor de edad");
}

// For loop
for (int i = 0; i < 5; i++) {
    System.out.println("Iteración: " + i);
}
```

---

## Lección 4: Métodos y POO

### Objetivos
- Crear y usar métodos
- Entender parámetros y retorno
- Introducción a POO

### Temas
- Definición de métodos
- Parámetros y argumentos
- Valor de retorno
- Sobrecarga de métodos
- Métodos estáticos vs instancia

### Ejemplo
```java
public class Calculadora {
    public static int sumar(int a, int b) {
        return a + b;
    }

    public static int sumar(int a, int b, int c) {
        return a + b + c;
    }
}
```

---

## Lección 5: POO Básica

### Objetivos
- Comprender clases y objetos
- Implementar herencia
- Usar interfaces y clases abstractas

### Conceptos
- Clases y objetos
- Atributos y métodos
- Constructores
- Herencia
- Polimorfismo
- Encapsulamiento

### Ejemplo
```java
public abstract class Animal {
    protected String nombre;
    
    public Animal(String nombre) {
        this.nombre = nombre;
    }
    
    public abstract void hacerSonido();
}

public class Perro extends Animal {
    @Override
    public void hacerSonido() {
        System.out.println("¡Guau!");
    }
}
```

---

## Lección 6: Siguientes Pasos

### Objetivos
- Manejar excepciones
- Implementar try-catch-finally
- Crear excepciones personalizadas

### Temas Avanzados
- Try-catch blocks
- Throws y throw
- Excepciones personalizadas
- Finally
- Multi-catch

### Ejemplo
```java
try {
    // Código que puede lanzar excepción
    int resultado = dividir(10, 0);
} catch (ArithmeticException e) {
    System.out.println("Error: División por cero");
} finally {
    System.out.println("Esto siempre se ejecuta");
}
```

## 🎮 Proyecto Final: Juego de Cartas
Al completar todas las lecciones, construirás un juego de cartas en consola que implementa:
- Clases y objetos
- Herencia y polimorfismo
- Manejo de excepciones
- Entrada de usuario
- Lógica de juego

## 📝 Notas Importantes
- Cada lección incluye ejercicios prácticos
- Se recomienda escribir el código, no solo copiarlo
- Prueba las variaciones sugeridas en cada ejemplo
- Usa los comentarios para documentar tu código

## 🔗 Enlaces Útiles
- [Documentación oficial de Java](https://docs.oracle.com/en/java/javase/11/docs/api/)
- [OnlineGDB Java Compiler](https://www.onlinegdb.com/)