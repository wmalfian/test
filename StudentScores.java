import java.util.*;

public class StudentScores {
    public static void main(String[] args) {
        // Initialize students' scores
        String[] students = {"Jamison", "Sara", "Sabrina", "Martin", "Eva", "Frank", "Alice", "David", "Margaret"};
        int[] scores = {87, 55, 65, 60, 59, 78, 98, 80, 77};

        // Find the highest and lowest scores
        int highestScore = scores[0];
        int lowestScore = scores[0];
        String highestScoringStudent = students[0];
        String lowestScoringStudent = students[0];

        for (int i = 1; i < scores.length; i++) {
            if (scores[i] > highestScore) {
                highestScore = scores[i];
                highestScoringStudent = students[i];
            }
            if (scores[i] < lowestScore) {
                lowestScore = scores[i];
                lowestScoringStudent = students[i];
            }
        }

        // Sort the scores in ascending order
        int[] sortedScores = Arrays.copyOf(scores, scores.length);
        Arrays.sort(sortedScores);

        Integer[] scoresInteger = new Integer[scores.length];
        for (int i = 0; i < scores.length; i++) {
            scoresInteger[i] = scores[i];
        }
        Arrays.sort(scoresInteger, Collections.reverseOrder());
        int[] sortedScoresDescending = new int[scores.length];
        for (int i = 0; i < scores.length; i++) {
            sortedScoresDescending[i] = scoresInteger[i];
        }
        
        // Calculate the average score
        int total = 0;
        for (int score : scores) {
            total += score;
        }
        double average = (double) total / scores.length;

        // List students with above-average scores
        List<String> aboveAverageStudents = new ArrayList<>();
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] > average) {
                aboveAverageStudents.add(students[i]);
            }
        }

        // Output the results
        System.out.println("Highest score: " + highestScore + " by " + highestScoringStudent);
        System.out.println("Lowest score: " + lowestScore + " by " + lowestScoringStudent);
        System.out.println("Scores in ascending order: " + Arrays.toString(sortedScores));
        System.out.println("Scores in descending order: " + Arrays.toString(sortedScoresDescending));
        System.out.println("Average score: " + average);
        System.out.println("Students scoring above average: " + aboveAverageStudents);
    }
}
