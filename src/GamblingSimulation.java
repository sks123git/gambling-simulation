public class GamblingSimulation {
    public static final int STAKE_PER_DAY = 100;
    public static final int BET_PER_GAME = 1;

    public int winLoose(){
        return (int)(Math.floor(Math.random() * 2) +1);
    }
    public static void main(String[] args) {
        GamblingSimulation gamble= new GamblingSimulation();
        int winLoose = gamble.winLoose();
        int gamblerAmount = 0;
        if(winLoose==1){
            System.out.println(winLoose + " You win the bet");
            gamblerAmount++;
        }else {
            System.out.println(winLoose + "You loose the bet");
            gamblerAmount--;
        }

    }
}