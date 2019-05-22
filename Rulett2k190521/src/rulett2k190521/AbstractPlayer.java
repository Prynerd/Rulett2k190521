package rulett2k190521;

import java.util.List;

/**
 *
 * @author Prynerd
 */
public abstract class AbstractPlayer {
    
    protected final List<BetType> possibleBets;
    
    protected int money;

    public AbstractPlayer(List<BetType> possibleBets) {
        this.possibleBets = possibleBets;
    }
    
    protected abstract void strategy();
    
    protected abstract Bet placeTakes();
    
    public void recievePrize(int prize){
      this.money += prize;  
    }
}
