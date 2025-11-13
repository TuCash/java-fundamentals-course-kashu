#  Curso Fundamental de Java – Team KASHU
### Guía completa de programación desde cero

---

## 📖 Introducción

¡Bienvenido al **Curso Fundamental de Java**!  
Este documento reúne todo el contenido teórico y práctico necesario para iniciarte en el mundo de la programación con Java.  
Fue elaborado por el equipo **KASHU** como parte del curso **Desarrollo de Aplicaciones Open Source (UPC 2025-02, NRC 7369)**.

Nuestro objetivo es que aprendas **paso a paso** los fundamentos de la programación, aplicando buenas prácticas, lógica y estructura de pensamiento computacional.

---

## 📘 Índice General

1️ Introducción a Java  
2️ Variables y Tipos de Datos  
3️ Estructuras de Control  
4️ Métodos y Entrada de Usuario  
5️ Programación Orientada a Objetos (POO)  
6️ Arreglos y Bucles Anidados  
7️ Mini Proyecto Final – Parte 1  
8️ Mini Proyecto Final – Parte 2  

---

## 1️ Introducción a Java

### Objetivo
Comprender la estructura básica de un programa en Java y aprender a mostrar información en consola.

### Conceptos Clave
- **Clase principal (`Main`)**: todo programa en Java empieza dentro de una clase.  
- **Método `main()`**: punto de entrada del programa.  
- **`System.out.println()`**: se usa para mostrar texto en la consola.  
- **Comentarios (`//`)**: sirven para documentar el código.



### Explicación
El programa anterior imprime mensajes en pantalla.  
La estructura `public static void main(String[] args)` es obligatoria: indica dónde empieza a ejecutarse el código.  
Java es sensible a mayúsculas y minúsculas, por lo que debes escribir todo exactamente igual.

---

## 2️ Variables y Tipos de Datos

### Objetivo
Aprender a almacenar información en variables, operar con números y manejar tipos de datos básicos.

### Conceptos Clave
- Una **variable** guarda un valor en memoria.  
- Cada variable tiene un **tipo de dato**:  
  - `int` → números enteros  
  - `double` → decimales  
  - `boolean` → verdadero/falso  
  - `String` → texto  


### Ejemplo:
```java
public class Main {
    public static void main(String[] args) {
        int edad = 20;
        double promedio = 17.5;
        String nombre = "Diana";
        boolean aprobado = true;

        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Promedio: " + promedio);
        System.out.println("¿Aprobado?: " + aprobado);
    }
}
```


--- 

## 3️. Estructuras de Control

### Objetivo
Controlar el flujo de ejecución del programa mediante condiciones y repeticiones.

### Conceptos Clave
- **Condicionales**: ejecutan bloques de código si se cumple una condición.  
- **Bucles**: repiten código mientras se cumpla una condición.  

### Ejemplo con condicional:
```java
int nota = 14;

if (nota >= 11) {
    System.out.println("Aprobado ✅");
} else {
    System.out.println("Desaprobado ❌");
}
```

### Ejemplo con bucles:
```java
for (int i = 1; i <= 5; i++) {
    System.out.println("Número: " + i);
}

int contador = 3;
while (contador > 0) {
    System.out.println("Cuenta atrás: " + contador);
    contador--;
}
```

### Explicación
- `if-else` permite tomar decisiones.  
- `for` se usa cuando sabemos cuántas veces repetir.  
- `while` repite mientras la condición sea verdadera.

---

## 4️⃣ Métodos y Entrada de Usuario

### Objetivo
Aprender a organizar el código en métodos y recibir datos desde el teclado con `Scanner`.

### Conceptos Clave
- Un **método** agrupa instrucciones que realizan una tarea.  
- `Scanner` permite capturar texto, números o caracteres que escribe el usuario.

### Ejemplo:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Ingresa tu nombre: ");
        String nombre = input.nextLine();

        System.out.print("Ingresa tu edad: ");
        int edad = input.nextInt();

        saludarUsuario(nombre, edad);
    }

    static void saludarUsuario(String n, int e) {
        System.out.println("\n¡Hola " + n + "! Tienes " + e + " años.");
        if (e >= 18) {
            System.out.println("Eres mayor de edad. ✅");
        } else {
            System.out.println("Aún eres menor de edad. 🧒");
        }
    }
}
```

### Explicación
`Scanner` debe importarse.  
`nextLine()` lee texto, `nextInt()` lee números enteros.  
Los métodos permiten **reutilizar código** y mantenerlo ordenado.

---

## 5️⃣ Programación Orientada a Objetos (POO)

### Objetivo
Entender el concepto de **clases**, **objetos**, **atributos** y **métodos**.

### Conceptos Clave
- Una **clase** es un molde que define características y comportamientos.  
- Un **objeto** es una instancia de esa clase.  
- **Atributos** → datos de un objeto.  
- **Métodos** → acciones que puede realizar.

### Ejemplo:
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
        System.out.println("\nNombre: " + nombre + " | Edad: " + edad + " | Nota: " + nota);
        if (nota >= 11) {
            System.out.println("Estado: Aprobado ✅");
        } else {
            System.out.println("Estado: Desaprobado ❌");
        }
    }
}
```

### Explicación
Este programa crea dos estudiantes con diferentes atributos y muestra su información.  
Cada objeto tiene su propio conjunto de valores, pero todos usan los mismos métodos definidos en la clase.

---

## 6️⃣ Arreglos y Bucles Anidados

### Objetivo
Aprender a manejar colecciones de datos (listas) y recorrerlas con bucles.

### Conceptos Clave
- Un **arreglo** almacena varios valores del mismo tipo.  
- Los índices comienzan en 0.  
- Se pueden usar bucles anidados para recorrer matrices.

### Ejemplo:
```java
public class Main {
    public static void main(String[] args) {
        String[] nombres = {"Ana", "Luis", "María"};
        int[] notas = {18, 15, 12};

        for (int i = 0; i < nombres.length; i++) {
            System.out.println(nombres[i] + " obtuvo nota " + notas[i]);
        }

        System.out.println("\nTabla de multiplicar (1 al 3):");
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                System.out.print(i * j + "\t");
            }
            System.out.println();
        }
    }
}
```

---

## 7️⃣ Mini Proyecto Final – Parte 1: Desarrollo

### Objetivo
Combinar todo lo aprendido para construir la base de un pequeño juego tipo *Quiz de Java*.

### Ejemplo:
```java
import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] preguntas = {
            "1. ¿Qué tipo de dato guarda texto?",
            "2. ¿Qué estructura repite acciones?",
            "3. ¿Qué palabra clave crea una clase?"
        };
        String[] respuestas = {"String", "for", "class"};
        int puntaje = 0;

        for (int i = 0; i < preguntas.length; i++) {
            System.out.println(preguntas[i]);
            String respuestaUsuario = input.nextLine();

            if (respuestaUsuario.equalsIgnoreCase(respuestas[i])) {
                System.out.println("✅ Correcto!\n");
                puntaje++;
            } else {
                System.out.println("❌ Incorrecto.\n");
            }
        }

        System.out.println("Puntaje final: " + puntaje + "/" + preguntas.length);
    }
}
```

---

## 8️⃣ Mini Proyecto Final – Parte 2: Mejoras y Presentación

### Objetivo
Agregar validaciones, control de errores y un menú para volver a jugar.

### Ejemplo:
```java
import java.util.Scanner;

public class QuizFinal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean jugarOtraVez = true;

        while (jugarOtraVez) {
            int puntaje = ejecutarQuiz(input);
            System.out.println("Tu puntaje fue: " + puntaje + "/3");

            System.out.print("\n¿Quieres volver a jugar? (sí/no): ");
            String opcion = input.nextLine();
            if (!opcion.equalsIgnoreCase("sí")) {
                jugarOtraVez = false;
            }
        }

        System.out.println("\nGracias por completar el curso Fundamentos de Java ☕");
        System.out.println("Creado por: Team KASHU · UPC 2025-20 🚀");
    }

    static int ejecutarQuiz(Scanner input) {
        String[] preguntas = {
            "1. ¿Qué tipo de dato guarda texto?",
            "2. ¿Qué estructura repite acciones?",
            "3. ¿Qué palabra clave crea una clase?"
        };
        String[] respuestas = {"String", "for", "class"};
        int puntaje = 0;

        for (int i = 0; i < preguntas.length; i++) {
            System.out.println(preguntas[i]);
            String respuesta = input.nextLine();

            try {
                if (respuesta.equalsIgnoreCase(respuestas[i])) {
                    System.out.println("✅ Correcto!\n");
                    puntaje++;
                } else {
                    System.out.println("❌ Incorrecto.\n");
                }
            } catch (Exception e) {
                System.out.println("⚠️ Error de entrada. Intenta de nuevo.");
            }
        }
        return puntaje;
    }
}
```

---

## 🏁 Conclusión

Con este curso has aprendido los pilares de la programación en Java:
- Sintaxis básica y estructura de un programa  
- Variables, tipos de datos y operadores  
- Estructuras de control  
- Métodos y entrada del usuario  
- Programación orientada a objetos  
- Arreglos y lógica de bucles  
- Manejo de errores  
- Desarrollo de un mini proyecto funcional  

¡Felicidades por completar tu formación inicial como programador Java! ☕🚀  

---

##  Equipo de Desarrollo

**Team KASHU – UPC 2025-02**  
- Taquiri Calderón, Jhunior Giussepe  
- Mondoñedo Rodríguez, Juan Diego Javier  
- Mejía Poma, Patricia Valeria  
- Huamán Hinostroza, Milenio

---

**Universidad Peruana de Ciencias Aplicadas (UPC)**  
**Curso:** Desarrollo de Aplicaciones Open Source  
**Ciclo:** 2025-02  
**NRC:** 7369  
