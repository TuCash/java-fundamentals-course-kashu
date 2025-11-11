import java.util.Scanner;

public class QuizFinal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean playAgain = true;

        while (playAgain) {
            int score = runQuiz(input);
            System.out.println("Tu puntaje fue: " + score + "/3");

            System.out.print("\n¿Quieres volver a jugar? (sí/no): ");
            String choice = input.nextLine();
            if (!choice.equalsIgnoreCase("sí")) {
                playAgain = false;
            }
        }

        System.out.println("\nGracias por completar el curso Fundamentos de Java ☕");
        System.out.println("Creado por: Team KASHU · UPC 2025-20 🚀");
    }

    static int runQuiz(Scanner input) {
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

            try {
                if (userAnswer.equalsIgnoreCase(answers[i])) {
                    System.out.println("✅ Correcto!\n");
                    score++;
                } else {
                    System.out.println("❌ Incorrecto.\n");
                }
            } catch (Exception e) {
                System.out.println("⚠️ Error de entrada. Intenta de nuevo.");
            }
        }
        return score;
    }
}