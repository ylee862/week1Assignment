import java.util.Arrays;

public class StudentScore {

    // static
    private static int serialIndex;
    private static int[] allScores;

    private int myIndex;
    private int score;

    public static int[] getAllScores() {
        return allScores;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
        allScores[myIndex] = score;
    }

    public StudentScore(int score) {
        this.myIndex = serialIndex++;
        this.score = score;
        addAllScore(score);


    }

    private static void addAllScore(int score) {
        if (allScores == null) {
            allScores = new int[] {score};
        }

        int leng = allScores.length;
        allScores = Arrays.copyOf(allScores, leng +1);
        allScores[leng] = score;
    }
}
