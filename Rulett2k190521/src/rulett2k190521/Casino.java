package rulett2k190521;

import Player.FullRandomPlayer;
import Player.Martingel;
import Player.RandomColorPlayer;
import Player.RealPlayer;
import Player.ShyPlayer;
import java.util.ArrayList;
import java.util.Arrays;
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
    

    public Casino() {
        this.board = new Board();
        this.possibleBets = new ArrayList<>();
        fillPossibleBets();
    }

    public void game(int rounds) {
        for (int i = 0; i < rounds; i++) {
            System.out.println((i+1) + ". játék.");
            if (!simulation()) {
                break;
            }
        }
    }
    
    public RealPlayer getRealPlayer(){
        return (RealPlayer)this.player;
    }

    //realPlayernek simulation
    public boolean simulation() {
        System.out.println("A játékos beszállt " + player.money + " zsetonnal.");
        Bet placeTakes = player.placeTakes();
        if (placeTakes.getStake() == -1) {
            System.out.println("Martingél abbahagyta a játékot.");
            return false;
        }
        if(placeTakes.getStake() > player.money) {
            System.out.println("Nincs elegendő pénze ekkora téthez.");
            player.recievePrize(0);
            return false;
        }
        System.out.println("A játékos erre rakott: " + placeTakes.getWhere() + " Ennyit: " + placeTakes.getStake());
        int randomNumber = spin();
        System.out.println("A nyerő szám: " + randomNumber);
        HashSet<BetType> winningBets = board.getWinningBets(randomNumber);
        if (winningBets.contains(placeTakes.getWhere())) {
            double prize = Prize.prize(placeTakes.getWhere());
            player.recievePrize((int) (prize * placeTakes.getStake()));
            System.out.println("A játékos nyereménye:  " + (int) (prize * placeTakes.getStake()));
        } else {
            player.recievePrize(-(placeTakes.getStake()));
            System.out.println("Nem nyert.");
            
        }
        return true;
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
            case 4:
                this.player = new Martingel(possibleBets, minBet, maxBet, money);
                break;
        }
    }

    public void newPlayer(int money) {
        this.player = new RealPlayer(null, 0, 0, money);
    }

    private int spin() {
        return (int) (Math.random() * 37);
    }

    private void fillPossibleBets() {
        BetType[] all = BetType.values();
        possibleBets.addAll(Arrays.asList(all));
    }

}
