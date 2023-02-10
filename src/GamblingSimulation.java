public class GamblingSimulation {
    public static int STAKE_PER_DAY = 100;
    public static int BET_PER_GAME = 1;
    public double winLoose() {
        return Math.random();
    }
    public static void main(String[] args) {
        GamblingSimulation gamble = new GamblingSimulation();
        double winLoose;
        int totalDays = 20, totalWin=0, totalloss=0;
        int endValue=0;
        int win=0,loss=0;
            int amount = STAKE_PER_DAY;
            while (totalDays>endValue) {
                winLoose = gamble.winLoose();
                System.out.println("win or loose : " + winLoose);
                if (winLoose < 0.5) {
                    amount++;
                    win++;
                    totalWin+=amount;
                } else {
                    amount--;
                    loss++;
                    totalloss+=amount;
                }
                totalDays--;
        }System.out.println("Amount = " + amount);
        System.out.println("Wins = " + win + "  Loss = " + loss);
        System.out.println("won by : " + (totalWin-totalloss));
    }
}