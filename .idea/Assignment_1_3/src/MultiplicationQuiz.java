import java.util.Scanner;

public class MultiplicationQuiz {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalScore;

        do {
            totalScore = 0;

            for (int questionNumber = 1; questionNumber <= 10; questionNumber++) {
                int factor1 = (int)(Math.random() * 10) + 1;
                int factor2 = (int)(Math.random() * 10) + 1;
                int correctAnswer = factor1 * factor2;

                System.out.print("Question " + questionNumber + ": What is " + factor1 + " * " + factor2 + "? ");
                int userAnswer = scanner.nextInt();

                if (userAnswer == correctAnswer) {
                    System.out.println("Correct");
                    totalScore++;
                } else {
                    System.out.println("Incorrect");
                }
            }

            System.out.println("Let's try another set of questions!");

        } while (totalScore < 10);
    }
}
