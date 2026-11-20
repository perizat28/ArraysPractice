import java.util.Scanner;

public class task5 {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        int[] scores =new int [5];
        for (int index = 0; index < scores.length; index++) {
            System.out.print("Enter score " + (index + 1) + " (0-100): ");
            int score = scanner.nextInt();

            while (score < 0 || score > 100) {
                System.out.print("Invalid score. Enter again (0-100): ");
                score = scanner.nextInt();
            }

            scores[index] = score;
        }

        int passed = 0;
        int failed = 0;
        int sum = 0;

        for (int currentScore : scores) {
            sum += currentScore;
            if (currentScore >= 60) {
                passed++;
            } else {
                failed++;
            }
        }

        double average = (double) sum / scores.length;

        System.out.print("Scores: ");
        for (int currentScore : scores) {
            System.out.print(currentScore + " ");
        }
        System.out.println();

        System.out.println("Passed: " + passed);
        System.out.println("Failed: " + failed);
        System.out.println("Average: " + average);

        scanner.close();
    }
}
