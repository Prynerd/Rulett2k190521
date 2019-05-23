package Player;

import java.util.List;
import rulett2k190521.AbstractPlayer;
import rulett2k190521.Bet;
import rulett2k190521.BetType;

/**
 *
 * @author progmatic
 */
public class RealPlayer extends AbstractPlayer{
    
    private Bet bet;
    
    public RealPlayer(List<BetType> possibleBets, int minBet, int maxBet, int money) {
        super(possibleBets, minBet, maxBet, money);
    }

    @Override
    protected BetType strategy() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Bet placeTakes() {
    return bet;    
    }

    public void setBet(Bet bet) {
        this.bet = bet;
    }
    
    
    
}
