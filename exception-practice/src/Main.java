import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        List<Integer> rightList = new ArrayList<>();
        List<Integer> wrongList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name");
        String name = scanner.next();

        long start = System.currentTimeMillis();

        for (int i = 0; i < 2; i++) {

            System.out.println("Enter first number");
            int firstNumber = scanner.nextInt();

            System.out.println("Enter second number");
            int secondNumber = scanner.nextInt();

            System.out.println("Enter operator (+ -)");
            String operator = scanner.next();

            System.out.println("Enter your answer");
            int answer = scanner.nextInt();

            int sumResult = firstNumber + secondNumber;
            int minusResult = firstNumber - secondNumber;

            switch (operator) {
                case "+":
                    try {
                        AnswerException.checkAnswer(sumResult, answer);
                        System.out.println("Right");
                        rightList.add(answer);
                    } catch (AnswerException e) {
                        System.out.println(e.getMessage());
                        wrongList.add(answer);
                    }
                    break;

                case "-":
                    try {
                        AnswerException.checkAnswer(minusResult, answer);
                        System.out.println("Right");
                        rightList.add(answer);
                    } catch (AnswerException e) {
                        System.out.println(e.getMessage());
                        wrongList.add(answer);
                    }
                    break;

                default:
                    System.out.println("Invalid operator");
                    i--;
            }
        }

        long end = System.currentTimeMillis();
        long totalSeconds = (end - start) / 1000;
        long minutes = totalSeconds / 60;
        long seconds = totalSeconds % 60;

        System.out.printf(
                "Name : %s  Time : %d:%02d  Rights : %d  Wrongs : %d%n",
                name, minutes, seconds, rightList.size(), wrongList.size()
        );
    }
}
