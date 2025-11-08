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
        System.out.println("=== Fundamentos de POO ===\n");

        // Crear instancias de diferentes animales
        Animal perro = new Perro("Rex");
        Animal gato = new Gato("Whiskers");
        Ave pajaro = new Ave("Tweety");

        // Demostración de polimorfismo
        System.out.println("=== Sonidos de Animales ===");
        perro.hacerSonido();
        gato.hacerSonido();
        pajaro.hacerSonido();

        // Uso de métodos específicos de cada clase
        System.out.println("\n=== Comportamientos Específicos ===");
        ((Perro)perro).jugar();
        ((Gato)gato).arañar();
        pajaro.volar();

        // Uso de interfaces
        Mascota mascotaPerro = (Mascota)perro;
        System.out.println("\n=== Interacción con Mascotas ===");
        mascotaPerro.alimentar();
        mascotaPerro.acariciar();
    }
}

// Clase abstracta base
abstract class Animal {
    protected String nombre;

    public Animal(String nombre) {
        this.nombre = nombre;
    }

    abstract void hacerSonido();
}

// Interface para mascotas
interface Mascota {
    void alimentar();
    void acariciar();
}

// Clase Perro que hereda de Animal e implementa Mascota
class Perro extends Animal implements Mascota {
    public Perro(String nombre) {
        super(nombre);
    }

    @Override
    void hacerSonido() {
        System.out.println(nombre + " dice: ¡Guau guau!");
    }

    @Override
    public void alimentar() {
        System.out.println(nombre + " come su comida para perros");
    }

    @Override
    public void acariciar() {
        System.out.println(nombre + " mueve la cola felizmente");
    }

    public void jugar() {
        System.out.println(nombre + " juega con la pelota");
    }
}

// Clase Gato que hereda de Animal
class Gato extends Animal {
    public Gato(String nombre) {
        super(nombre);
    }

    @Override
    void hacerSonido() {
        System.out.println(nombre + " dice: ¡Miau!");
    }

    public void arañar() {
        System.out.println(nombre + " araña el sofá");
    }
}

// Clase Ave que hereda de Animal
class Ave extends Animal {
    public Ave(String nombre) {
        super(nombre);
    }

    @Override
    void hacerSonido() {
        System.out.println(nombre + " dice: ¡Pío pío!");
    }

    public void volar() {
        System.out.println(nombre + " vuela por el cielo");
    }
}
