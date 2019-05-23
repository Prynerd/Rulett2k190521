package rulett2k190521;

import Player.FullRandomPlayer;
import Player.RandomColorPlayer;
import Player.ShyPlayer;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 *
 * @author progmatic
 */
public class Casino {

    private AbstractPlayer player;
    private Board board;
    private List<BetType> possibleBets;
    private Bet realPlayerBet;
    

    public Casino() {
        this.board = new Board();
        this.possibleBets = new ArrayList<>();
        fillPossibleBets();
    }

    public void game(int rounds) {
        for (int i = 0; i < rounds; i++) {
            System.out.println(i + ". játék.");
            simulation();
        }
    }

    public void newPlayer(int playerNumber, int minBet, int maxBet, int money) {
        switch (playerNumber) {
            case 1:
                this.player = new RandomColorPlayer(possibleBets, minBet, maxBet, money);
                break;
            case 2:
                this.player = new FullRandomPlayer(possibleBets, minBet, maxBet, money);
                break;
            case 3:
                this.player = new ShyPlayer(possibleBets, minBet, maxBet, money);
                break;
        }
    }
    
    public void realPlayer(BetType bt, int nbr){
        this.realPlayerBet = new Bet(bt, nbr);
    }

    //realPlayernek simulation
    private void simulation() {
        Bet placeTakes = player.placeTakes();
        System.out.println("A játékos erre rakott: " + placeTakes.getWhere());
        int randomNumber = spin();
        System.out.println("A nyerő szám: " + randomNumber);
        HashSet<BetType> winningBets = board.getWinningBets(randomNumber);
        if (winningBets.contains(placeTakes.getWhere())) {
            double prize = Prize.prize(placeTakes.getWhere());
            player.recievePrize((int) (prize * player.placeTakes().getStake()));
            System.out.println("A játékos nyereménye:  " + (int) (prize * player.placeTakes().getStake()));
        } else {
            player.recievePrize(0);
            System.out.println("Nem nyert.");
        }
    }

    private int spin() {
        return (int) (Math.random() * 37);
    }

    private void fillPossibleBets() {
        possibleBets.add(BetType.SINGLE_00);
        possibleBets.add(BetType.SINGLE_01);
        possibleBets.add(BetType.SINGLE_02);
        possibleBets.add(BetType.SINGLE_03);
        possibleBets.add(BetType.SINGLE_04);
        possibleBets.add(BetType.SINGLE_05);
        possibleBets.add(BetType.SINGLE_06);
        possibleBets.add(BetType.SINGLE_07);
        possibleBets.add(BetType.SINGLE_08);
        possibleBets.add(BetType.SINGLE_09);
        possibleBets.add(BetType.SINGLE_10);
        possibleBets.add(BetType.SINGLE_11);
        possibleBets.add(BetType.SINGLE_12);
        possibleBets.add(BetType.SINGLE_13);
        possibleBets.add(BetType.SINGLE_14);
        possibleBets.add(BetType.SINGLE_15);
        possibleBets.add(BetType.SINGLE_16);
        possibleBets.add(BetType.SINGLE_17);
        possibleBets.add(BetType.SINGLE_18);
        possibleBets.add(BetType.SINGLE_19);
        possibleBets.add(BetType.SINGLE_20);
        possibleBets.add(BetType.SINGLE_21);
        possibleBets.add(BetType.SINGLE_22);
        possibleBets.add(BetType.SINGLE_23);
        possibleBets.add(BetType.SINGLE_24);
        possibleBets.add(BetType.SINGLE_25);
        possibleBets.add(BetType.SINGLE_26);
        possibleBets.add(BetType.SINGLE_27);
        possibleBets.add(BetType.SINGLE_28);
        possibleBets.add(BetType.SINGLE_29);
        possibleBets.add(BetType.SINGLE_30);
        possibleBets.add(BetType.SINGLE_31);
        possibleBets.add(BetType.SINGLE_32);
        possibleBets.add(BetType.SINGLE_33);
        possibleBets.add(BetType.SINGLE_34);
        possibleBets.add(BetType.SINGLE_35);
        possibleBets.add(BetType.SINGLE_36);
        possibleBets.add(BetType.SPLIT_01_02);
        possibleBets.add(BetType.SPLIT_02_03);
        possibleBets.add(BetType.SPLIT_04_05);
        possibleBets.add(BetType.SPLIT_05_06);
        possibleBets.add(BetType.SPLIT_07_08);
        possibleBets.add(BetType.SPLIT_08_09);
        possibleBets.add(BetType.SPLIT_10_11);
        possibleBets.add(BetType.SPLIT_11_12);
        possibleBets.add(BetType.SPLIT_13_14);
        possibleBets.add(BetType.SPLIT_14_15);
        possibleBets.add(BetType.SPLIT_16_17);
        possibleBets.add(BetType.SPLIT_17_18);
        possibleBets.add(BetType.SPLIT_19_20);
        possibleBets.add(BetType.SPLIT_20_21);
        possibleBets.add(BetType.SPLIT_22_23);
        possibleBets.add(BetType.SPLIT_23_24);
        possibleBets.add(BetType.SPLIT_25_26);
        possibleBets.add(BetType.SPLIT_26_27);
        possibleBets.add(BetType.SPLIT_28_29);
        possibleBets.add(BetType.SPLIT_29_30);
        possibleBets.add(BetType.SPLIT_31_32);
        possibleBets.add(BetType.SPLIT_32_33);
        possibleBets.add(BetType.SPLIT_34_35);
        possibleBets.add(BetType.SPLIT_35_36);
        possibleBets.add(BetType.SPLIT_01_04);
        possibleBets.add(BetType.SPLIT_02_05);
        possibleBets.add(BetType.SPLIT_03_06);
        possibleBets.add(BetType.SPLIT_04_07);
        possibleBets.add(BetType.SPLIT_05_08);
        possibleBets.add(BetType.SPLIT_06_09);
        possibleBets.add(BetType.SPLIT_07_10);
        possibleBets.add(BetType.SPLIT_08_11);
        possibleBets.add(BetType.SPLIT_09_12);
        possibleBets.add(BetType.SPLIT_10_13);
        possibleBets.add(BetType.SPLIT_11_14);
        possibleBets.add(BetType.SPLIT_12_15);
        possibleBets.add(BetType.SPLIT_13_16);
        possibleBets.add(BetType.SPLIT_14_17);
        possibleBets.add(BetType.SPLIT_15_18);
        possibleBets.add(BetType.SPLIT_16_19);
        possibleBets.add(BetType.SPLIT_17_20);
        possibleBets.add(BetType.SPLIT_18_21);
        possibleBets.add(BetType.SPLIT_19_22);
        possibleBets.add(BetType.SPLIT_20_23);
        possibleBets.add(BetType.SPLIT_21_24);
        possibleBets.add(BetType.SPLIT_22_25);
        possibleBets.add(BetType.SPLIT_23_26);
        possibleBets.add(BetType.SPLIT_24_27);
        possibleBets.add(BetType.SPLIT_25_28);
        possibleBets.add(BetType.SPLIT_26_29);
        possibleBets.add(BetType.SPLIT_27_30);
        possibleBets.add(BetType.SPLIT_28_31);
        possibleBets.add(BetType.SPLIT_29_32);
        possibleBets.add(BetType.SPLIT_30_33);
        possibleBets.add(BetType.SPLIT_31_34);
        possibleBets.add(BetType.SPLIT_32_35);
        possibleBets.add(BetType.SPLIT_33_36);
        possibleBets.add(BetType.CORNER_01_05);
        possibleBets.add(BetType.CORNER_02_06);
        possibleBets.add(BetType.CORNER_04_08);
        possibleBets.add(BetType.CORNER_05_09);
        possibleBets.add(BetType.CORNER_07_11);
        possibleBets.add(BetType.CORNER_08_12);
        possibleBets.add(BetType.CORNER_10_14);
        possibleBets.add(BetType.CORNER_11_15);
        possibleBets.add(BetType.CORNER_13_17);
        possibleBets.add(BetType.CORNER_14_18);
        possibleBets.add(BetType.CORNER_16_20);
        possibleBets.add(BetType.CORNER_17_21);
        possibleBets.add(BetType.CORNER_19_23);
        possibleBets.add(BetType.CORNER_20_24);
        possibleBets.add(BetType.CORNER_22_26);
        possibleBets.add(BetType.CORNER_23_27);
        possibleBets.add(BetType.CORNER_25_29);
        possibleBets.add(BetType.CORNER_26_30);
        possibleBets.add(BetType.CORNER_28_32);
        possibleBets.add(BetType.CORNER_29_33);
        possibleBets.add(BetType.CORNER_31_35);
        possibleBets.add(BetType.CORNER_32_36);
        possibleBets.add(BetType.TRIO_00_02);
        possibleBets.add(BetType.TRIO_00_03);
        possibleBets.add(BetType.FIRST_FOUR);
        possibleBets.add(BetType.STREET_01);
        possibleBets.add(BetType.STREET_04);
        possibleBets.add(BetType.STREET_07);
        possibleBets.add(BetType.STREET_10);
        possibleBets.add(BetType.STREET_13);
        possibleBets.add(BetType.STREET_16);
        possibleBets.add(BetType.STREET_19);
        possibleBets.add(BetType.STREET_22);
        possibleBets.add(BetType.STREET_25);
        possibleBets.add(BetType.STREET_28);
        possibleBets.add(BetType.STREET_31);
        possibleBets.add(BetType.STREET_34);
        possibleBets.add(BetType.SIX_LINE_01);
        possibleBets.add(BetType.SIX_LINE_04);
        possibleBets.add(BetType.SIX_LINE_07);
        possibleBets.add(BetType.SIX_LINE_10);
        possibleBets.add(BetType.SIX_LINE_13);
        possibleBets.add(BetType.SIX_LINE_16);
        possibleBets.add(BetType.SIX_LINE_19);
        possibleBets.add(BetType.SIX_LINE_22);
        possibleBets.add(BetType.SIX_LINE_25);
        possibleBets.add(BetType.SIX_LINE_28);
        possibleBets.add(BetType.SIX_LINE_31);
        possibleBets.add(BetType.THIRD_01_12);
        possibleBets.add(BetType.THIRD_13_24);
        possibleBets.add(BetType.THIRD_25_36);
        possibleBets.add(BetType.HALF_01_18);
        possibleBets.add(BetType.HALF_19_36);
        possibleBets.add(BetType.COLUMN_01);
        possibleBets.add(BetType.COLUMN_02);
        possibleBets.add(BetType.COLUMN_03);
        possibleBets.add(BetType.NUM_ODDS);
        possibleBets.add(BetType.NUM_EVEN);
        possibleBets.add(BetType.CLR_RED);
        possibleBets.add(BetType.CLR_BLACK);
    }

}
