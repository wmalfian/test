import java.util.*;

public class StudentScores {
    public static void main(String[] args) {

        String[] studNames = {"Jamison", "Sara", "Sabrina", "Martin", "Eva", "Frank", "Alice", "David", "Margaret"};
        int[] scores = {87, 55, 65, 60, 59, 78, 98, 80, 77};

        int topScore = scores[0];
        int minScore = scores[0];
        String topScoreStud = studNames[0];
        String minScoreStudent = studNames[0];

        for (int i = 1; i < scores.length; i++) {
            if (scores[i] > topScore) {
                topScore = scores[i];
                topScoreStud = studNames[i];
            }
            if (scores[i] < minScore) {
                minScore = scores[i];
                minScoreStudent = studNames[i];
            }
        }

        int[] sortedScoresAscending = Arrays.copyOf(scores, scores.length);
        Arrays.sort(sortedScoresAscending);

        Integer[] scoresInt = new Integer[scores.length];
        for (int i = 0; i < scores.length; i++) {
            scoresInt[i] = scores[i];
        }
        Arrays.sort(scoresInt, Collections.reverseOrder());
        int[] sortedScoresDescending = new int[scores.length];
        for (int i = 0; i < scores.length; i++) {
            sortedScoresDescending[i] = scoresInt[i];
        }

        int total = 0;
        for (int score : scores) {
            total += score;
        }
        double average = (double) total / scores.length;

        List<String> aboveAverageStud = new ArrayList<>();
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] > average) {
                aboveAverageStud.add(studNames[i]);
            }
        }
 
        System.out.println("Top score: " + topScore + ", " + topScoreStud);
        System.out.println("Minimum score: " + minScore + ", " + minScoreStudent);
        System.out.println("Scores in ascending order: " + Arrays.toString(sortedScoresAscending));
        System.out.println("Scores in descending order: " + Arrays.toString(sortedScoresDescending));
        System.out.println("Average mark: " + average);
        System.out.println("Students above average mark: " + aboveAverageStud);
    }
}
