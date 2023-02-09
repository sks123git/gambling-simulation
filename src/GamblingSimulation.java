public class GamblingSimulation {
    public static int STAKE_PER_DAY = 100;
    public static int BET_PER_GAME = 1;

    public int winLoose() {
        return (int) (Math.floor(Math.random() * 2) + 1);
    }

    public static void main(String[] args) {
        GamblingSimulation gamble = new GamblingSimulation();
        int winLoose;
        while (STAKE_PER_DAY<=0 || STAKE_PER_DAY>=50) {
            winLoose = gamble.winLoose();
            if (winLoose == 1) {
                STAKE_PER_DAY+=BET_PER_GAME;
            } else if (winLoose == 2) {
                STAKE_PER_DAY-=BET_PER_GAME;
            }
        }
        System.out.println(STAKE_PER_DAY);
    }
}