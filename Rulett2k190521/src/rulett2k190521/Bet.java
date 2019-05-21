package rulett2k190521;

/**
 *
 * @author Prynerd
 */
public class Bet {
    
    private BetType where;
    private int stake;

    public Bet(BetType where, int stake) {
        this.where = where;
        this.stake = stake;
    }

    public BetType getWhere() {
        return where;
    }

    public int getStake() {
        return stake;
    }
    
    
    
}
