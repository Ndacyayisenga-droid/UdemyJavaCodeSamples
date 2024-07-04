public class Main {

    public static void main(String[] args) {
        String[] playerNames = {"Alice", "Bob", "Charlie", "David", "Eve"};
        int[] scores = {1500, 1000, 500, 100, 25};

        for (int i = 0; i < scores.length; i++) {
            int position = calculateHighScorePosition(scores[i]);
            displayHighScorePosition(playerNames[i], position);
        }
    }

    public static void displayHighScorePosition(String playerName, int position) {
        System.out.println(playerName + " managed to get into position " + position + " on the high score list");
    }

    public static int calculateHighScorePosition(int score) {
        if (score >= 1000) {
            return 1;
        } else if (score >= 500) {
            return 2;
        } else if (score >= 100) {
            return 3;
        } else {
            return 4;
        }
    }
}
