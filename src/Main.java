public class Main {
    public static void main(String[] args) {
        // High score display section
        String[] playerNames = {"Alice", "Bob", "Charlie", "David", "Eve"};
        int[] scores = {1500, 1000, 500, 100, 25};

        for (int i = 0; i < scores.length; i++) {
            int position = calculateHighScorePosition(scores[i]);
            displayHighScorePosition(playerNames[i], position);
        }

        // Bank account section
        // Create a BankAccount instance
        BankAccount myAccount = new BankAccount("123456", 1000.0, "Tayebwa Noah", "tayebwa@noah.com", "123-456-7890");

        // Test deposit method
        myAccount.deposit(500.0); // Depositing $500
        System.out.println("Current balance after deposit: $" + myAccount.getBalance());

        // Test withdraw method
        myAccount.withdraw(200.0); // Withdrawing $200
        System.out.println("Current balance after withdrawal: $" + myAccount.getBalance());

        // Attempt to withdraw more than balance
        myAccount.withdraw(900.0); // Trying to withdraw $900
        System.out.println("Current balance after attempted withdrawal: $" + myAccount.getBalance());
    }

    // High score methods
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
