package rulett2k190521;

import java.util.List;

/**
 *
 * @author Prynerd
 */
public abstract class AbstractPlayer {
    
    protected final List<BetType> possibleBets;
    
    protected int money;
    protected int minBet;
    protected int maxBet;

    public AbstractPlayer(List<BetType> possibleBets, int minBet, int maxBet, int money) {
        this.possibleBets = possibleBets;
        this.maxBet = maxBet;
        this.minBet = minBet;
        this.money = money;
    }
    
    protected abstract BetType strategy();
    
    protected abstract Bet placeTakes();
    
    public void recievePrize(int prize){
      this.money += prize;  
    }
}
