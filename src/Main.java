import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);


        System.out.println("Howdy! Welcome to my AI-powered QuickDraw!");

        System.out.println("Ready to play? (Y/N)");
        String input = scnr.nextLine().trim().toUpperCase();

        if (input.equals("Y")) {
            ReactionGame game = new ReactionGame();
            try {
                game.startGame();
            } catch (InterruptedException e) {
                System.out.println("Game interrupted.");
            }
        } else {
            System.out.println("Exiting partner... Maybe next time!");
        }

        scnr.close();
    }
}
    

