package rulett2k190521;

/**
 *
 * @author Prynerd
 */
public abstract class AbstractPlayer {
    
    protected int money;
    
    protected abstract void strategy();
    
    protected abstract Bet placeTakes();
    
    public void recievePrize(int prize){
      this.money += prize;  
    }
}
