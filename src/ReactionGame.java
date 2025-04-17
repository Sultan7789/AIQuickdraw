import java.util.Scanner;

public class ReactionGame {
    private  ReactionAI ai = new ReactionAI();
    private Scanner sc = new Scanner(System.in);
    private int playerScore = 0;
    private int aiScore = 0;

    public void playRound() throws InterruptedException {
        System.out.println("Get ready...");

        Thread.sleep(1000 + (int)(Math.random() * 3000)); //Rand Delay

        System.out.println("\n DRAW NOW! (PRESS ENTER!)");

        long startTime = System.currentTimeMillis();
        while(!sc.hasNextLine()) {
            // WAIT TIME
        }
        sc.nextLine();
        long userTime = System.currentTimeMillis() - startTime;

        if (userTime < 100) {
            System.out.println("False start! You lose.");
            aiScore++;
            ai.increaseLeniency();
            return;
        }

        long aiTime = ai.getAIReactionTime();
        ai.recordUserReaction(userTime);

        if (userTime < aiTime) {
            System.out.printf("You win, partner! Your time: %dms, AI: %dms%n", userTime, aiTime);
            playerScore++;
            ai.resetLeniency();
        } else {
            System.out.printf("Sorry partner... AI wins. Your time: %dms, AI: %dms%n", userTime, aiTime);
            aiScore++;
            ai.increaseLeniency(); // Helps player.
        }
    }

    public void startGame() throws InterruptedException {
        System.out.println("Howdy! Welcome to my AI-powered QuickDraw!");
        for (int i = 0; i < 5; i++) {
            System.out.println("\n --- Round " + (i + 1) + "---");
            playRound();
        }
        System.out.printf("\nFinal Score - You: %d | AI: %d%n", playerScore, aiScore);
    }
}
