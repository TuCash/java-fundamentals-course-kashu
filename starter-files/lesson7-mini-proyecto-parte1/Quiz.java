import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] questions = {
            "1. ¿Qué tipo de dato guarda texto?",
            "2. ¿Qué estructura repite acciones?",
            "3. ¿Qué palabra clave crea una clase?"
        };
        String[] answers = {"String", "for", "class"};

        int score = 0;

        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            String userAnswer = input.nextLine();

            if (userAnswer.equalsIgnoreCase(answers[i])) {
                System.out.println("✅ Correcto!\n");
                score++;
            } else {
                System.out.println("❌ Incorrecto.\n");
            }
        }

        System.out.println("Puntaje final: " + score + "/" + questions.length);
    }
}