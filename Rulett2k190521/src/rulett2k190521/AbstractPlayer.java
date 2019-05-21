package rulett2k190521;

/**
 *
 * @author Prynerd
 */
public abstract class AbstractPlayer {
    
    private int money;
    
    abstract void strategy();
    
    abstract Bet placeTakes();
    
    public void recievePrize(int prize){
      this.money += prize;  
    }
}
