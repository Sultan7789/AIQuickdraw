import java.util.ArrayList;
import java.util.Random;

public class ReactionAI {
    private ArrayList<Long> userReactionTimes = new ArrayList<>();
    private Random rand = new Random();
    private long leniencyBonus = 0; // extra delay in ms to help

    public void recordUserReaction(long time) {
        // Filtering out unreasonable times to avoid cheating
        if (time < 100 || time > 700) {
            System.out.println("Too slow! Got shot! (Time ignored) Time: " + time + "ms");
            return;
        }

        userReactionTimes.add(time);
        if (userReactionTimes.size() > 10) {
            userReactionTimes.remove(0);
        }
    }

    public long getAIReactionTime() {
        if(userReactionTimes.isEmpty()) {
            return 450 + rand.nextInt(100) + leniencyBonus; // Default: An average of ±450ms
        }


        long sum = 0;
        for (long time : userReactionTimes) sum += time;
        long avg = sum / userReactionTimes.size();

        return avg + rand.nextInt(100) - 50 + leniencyBonus; // 50ms Variation.
    }
    public void increaseLeniency(){
        leniencyBonus += 50;
        if (leniencyBonus > 150) leniencyBonus = 150; //Bonus cap.
    }

    public void resetLeniency() {
        leniencyBonus = 0;
    }
}
