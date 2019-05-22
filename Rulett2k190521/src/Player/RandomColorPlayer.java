package Player;

import java.util.List;
import rulett2k190521.AbstractPlayer;
import rulett2k190521.Bet;
import rulett2k190521.BetType;

/**
 *
 * @author progmatic
 */
public class RandomColorPlayer extends AbstractPlayer {

    public RandomColorPlayer(List<BetType> possibleBets) {
        super(possibleBets);
        this.money = 1000;
    }

    @Override
    protected BetType strategy() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected Bet placeTakes() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
